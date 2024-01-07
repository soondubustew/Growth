def solution(s):
    answer = 0
    ls = s.split()
    
    for i in range(len(ls)):
        if ls[i] == "Z":
            answer = answer - int(ls[i - 1])  # 이전 숫자를 빼줍니다.
        else:
            answer = answer + int(ls[i])
    
    return answer
