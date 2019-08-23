N, K = map(int, input().split(' '))
A = [int(input()) for num in range(N)]

A.reverse()

coins = 0

for coin in A:
    coins += int(K / coin)
    K %= coin

print(coins)         
