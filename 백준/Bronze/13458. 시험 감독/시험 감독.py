import math

# 학급 수 입력
num = int(input())

# A 선생님 수 초기화
a_teacher = num

# 전체 선생님 수 초기화
total_teacher = 0

# 각 학급별 B 선생님 수를 저장할 리스트
b_teacher_num = []

# 각 학급의 상태를 입력받아 리스트에 추가
room_in_student = []
room_in_student.append(list(map(int, input().split(" "))))

# A 선생님과 B 선생님의 시야를 입력받음
see = list(map(int, input().split(" ")))
a_teacher_see = see[0]
b_teacher_see = see[1]

# 각 학급에 필요한 B 선생님 수 계산
for i in range(num):
    b_teacher = math.ceil((room_in_student[0][i] - a_teacher_see) / b_teacher_see)
    b_teacher = max(b_teacher, 0) #음수 방지
    b_teacher_num.append(b_teacher)

    

# B 선생님 수의 합 계산
b_teacher_sum = sum(b_teacher_num)

# 전체 선생님 수 계산
total_teacher = a_teacher + b_teacher_sum

# 결과 출력
print(total_teacher)
