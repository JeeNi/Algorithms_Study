f = [-1 for i in range(100)]
f[0] = 0
f[1] = 1
f[2] = 2

def calF(n):
    if f[n] == -1:
        f[n] = (calF(n - 1) + calF(n - 2)) % 10007
    return f[n]

N = int(input())
print(calF(N))