# 첫 번째 줄에서 공백을 기준으로 정수를 입력받아 리스트로 저장
first_line = list(map(int, input().split()))

# 입력받은 리스트에서 n과 k를 추출
n = first_line[0]
k = first_line[1]

# 두 번째 줄에서 공백을 기준으로 정수를 입력받아 리스트로 저장
A = list(map(int, input().split()))

# 리스트 A를 오름차순으로 정렬
A.sort()

# 정렬된 리스트 A에서 k번째로 작은 수를 출력
print(A[k-1])
