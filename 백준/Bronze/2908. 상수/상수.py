# 사용자 입력을 받아 공백을 기준으로 두 수를 입력받고 num1, num2에 값을 할당
num1, num2 = input().split()

# 입력받은 두 수를 [::-1]을 이용하여 각각 거꾸로
num1 = num1[::-1]
num2 = num2[::-1]

# num1과 num2를 비교하여 더 큰 값을 출력
if num1 > num2:
    print(num1)
else:
    print(num2)
