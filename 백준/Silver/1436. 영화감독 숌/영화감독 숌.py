# 영화 제목의 순서 입력
movie_num_input = int(input())

# 찾아낸 종말의 수를 카운트하기 위한 변수 초기화
movie_num = 0

# 현재 검사 중인 수 초기화
number = 666

# 무한 루프를 통해 조건을 만족하는 종말의 수 찾기
while True:
    # 현재 수에 '666'이 포함되어 있는지 확인
    if '666' in str(number):
        # 종말의 수를 찾았으므로 카운트 증가
        movie_num += 1
        
        # 입력받은 영화 제목의 순서와 같아지면 해당 종말의 수 출력하고 루프 종료
        if movie_num == movie_num_input:
            print(number)
            break
    
    # 다음 수를 검사하기 위해 현재 수 증가
    number += 1
