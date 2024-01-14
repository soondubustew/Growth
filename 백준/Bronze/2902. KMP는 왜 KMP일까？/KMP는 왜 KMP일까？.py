# 초기화: 빈 문자열을 가지는 firstnamearr 변수를 선언
firstnamearr = ""

# 사용자에게 입력을 받고, '-'를 기준으로 문자열을 나누어 리스트에 저장
namearr = input().split("-")

# namearr 리스트의 각 요소에서 첫 번째 글자를 firstnamearr에 추가
for i in range(len(namearr)):
    firstnamearr += namearr[i][0]

# 최종적으로 firstnamearr 출력
print(firstnamearr)