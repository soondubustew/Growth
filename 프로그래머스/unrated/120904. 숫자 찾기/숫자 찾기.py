def solution(num, k):
    str_num = str(num)
    str_k = str(k)
    answer = 0
    for i in str_num:
        answer = answer +1 
        if i == str_k:
            return answer
    return -1    

        
    
        
    