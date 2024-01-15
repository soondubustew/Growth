# 사용자로부터 단어 입력 받기
word = input()

# 모든 알파벳을 소문자로 변환
word = word.lower()

# 각 알파벳의 발생 횟수를 저장할 딕셔너리 초기화
count = {}

# 입력된 단어를 순회하며 각 알파벳의 발생 횟수 계산
for char in word:
    if char in count:
        count[char] += 1
    else:
        count[char] = 1

# 최대 발생 횟수 찾기
maxcount = max(count.values())

# 최대 발생 횟수를 가진 알파벳을 저장할 리스트 초기화
maxalpha = []

# 딕셔너리를 순회하며 최대 발생 횟수를 가진 알파벳(들) 찾기
for char, char_count in count.items():
    if char_count == maxcount:
        maxalpha.append(char)

# 최대 발생 횟수를 가진 알파벳이 유일한 경우 대문자로 출력
if len(maxalpha) == 1:
    print(maxalpha[0].upper())
else:
    # 여러 개의 알파벳이 최대 발생 횟수를 가질 경우 '?' 출력
    print("?")
