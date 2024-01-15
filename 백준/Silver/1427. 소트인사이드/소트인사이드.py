# 사용자로부터 여러 숫자를 입력받아 리스트로 저장
s = list(map(int, input()))

# 입력된 숫자들을 내림차순으로 정렬하고, 정렬된 리스트를 문자열로 결합하여 정수로 변환
sorted_s = int(''.join(map(str, sorted(s, reverse=True))))

# 결과를 출력
print(sorted_s)
