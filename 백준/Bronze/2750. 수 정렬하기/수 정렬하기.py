n = int(input())
arr= []
for i in range(n):
    user_input = int(input())
    arr.append(user_input)
sort_arr = sorted(arr)

for i in sort_arr:
    print(i)