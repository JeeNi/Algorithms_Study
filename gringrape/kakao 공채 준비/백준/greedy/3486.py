# 1. 주어진 숫자를 뒤집는다.
# 2. 합한다.
# 3. 합을 뒤집는다.
# -> 뒤집는다.

# reverse test - 1
def reverseNum(num):
    temp = []
    while num != 0:
        if num % 10 != 0 or len(temp) != 0:
            temp.append(num % 10)
        num = int(num / 10)

    k = 1
    revNum = 0
    for i in range(len(temp) - 1, -1, -1):
        revNum += temp[i] * k
        k *= 10

    return revNum

N = int(input())
for i in range(N):
    num1, num2 = map(int, input().split(' '))
    print(reverseNum(reverseNum(num1) + reverseNum(num2)))