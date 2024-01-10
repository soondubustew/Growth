def solution(str_list):
    # 'l'과 'r'이 모두 리스트에 있는지 확인
    if 'l' in str_list and 'r' in str_list:
        # 'l'과 'r'의 첫 번째 등장 위치 찾기
        first_l = str_list.index('l')
        first_r = str_list.index('r')
        
        # 'l'이 'r'보다 먼저 등장하는지 확인
        if first_l < first_r:
            # 'l'이 'r'보다 먼저 등장하면 'l' 이전의 문자열들 반환
            return str_list[:first_l]
        else:
            # 'r'이 'l'보다 먼저 등장하면 'r' 이후의 문자열들 반환
            return str_list[first_r + 1:]
        
    # 'l'만 리스트에 있는 경우 'l' 이전의 문자열들 반환
    elif 'l' in str_list:
        return str_list[:str_list.index('l')]
    
    # 'r'만 리스트에 있는 경우 'r' 이후의 문자열들 반환
    elif 'r' in str_list:
        return str_list[str_list.index('r') + 1:]
    
    # 'l'이나 'r'이 리스트에 없는 경우 빈 리스트 반환
    else:
        return []
