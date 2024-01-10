# 사용자로부터 8개의 문제 점수를 입력
scores = []
for i in range(8):
    score = int(input())
    scores.append(score)

# 점수를 내림차순으로 정렬
sorted_scores = sorted(scores, reverse=True)

# 가장 높은 점수 5개를 선택하여 총 점수를 계산
total_score = sum(sorted_scores[:5])

# 최종 점수에 포함된 문제 번호를 찾아 출력
included_problems = []
for score in sorted_scores[:5]:
    problem_number = scores.index(score) + 1
    included_problems.append(problem_number)
included_problems.sort()

# 총 점수와 포함된 문제를 출력
print(total_score)
print(*included_problems)
