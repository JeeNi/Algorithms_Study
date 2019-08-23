import sys

paid = int(sys.stdin.readline())
remain = 1000 - paid

coinType = [500, 100, 50, 10, 5, 1]

coins = 0
for typ in coinType:
    coins += int(remain / typ)
    remain %= typ

print(coins)