def calculate_sum_after_operations(k, operations):
    stack = []

    for op in operations:
        if op == 0:
            # 0이 나오면 스택에서 최근에 추가된 값 제거
            stack.pop()
        else:
            # 0이 아닌 경우 스택에 해당 수 추가
            stack.append(op)

    # 최종적으로 적어 낸 수의 합 계산
    return sum(stack)

# 입력 받기
k = int(input())
operations = []
for _ in range(k):
    element = int(input())
    operations.append(element)

# 결과 출력
result = calculate_sum_after_operations(k, operations)
print(result)

