# 사용자로부터 문자열 입력 받기
s = input()

# 각 알파벳의 처음 등장 위치를 기록할 딕셔너리 초기화
alphabet = {}

# 문자열을 순회하면서 각 알파벳의 처음 등장 위치를 기록
for i, char in enumerate(s):
    if char not in alphabet:
        alphabet[char] = i

# 알파벳 'a'부터 'z'까지 반복하면서 각 알파벳의 처음 등장 위치 출력
for char in range(ord('a'), ord('z')+1):
    # get 메서드를 사용하여 딕셔너리에서 위치 가져오기, 없으면 -1 반환
    position = alphabet.get(chr(char), -1)
    
    # 위치 출력, 공백으로 구분하여 나열
    print(position, end=" ")
