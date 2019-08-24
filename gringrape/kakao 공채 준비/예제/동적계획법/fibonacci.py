fibo = [0 for num in range(1000)]
fibo[0] = 1
fibo[1] = 1

def calFibo(n):
    if fibo[n] != 0:
        return fibo[n]
    else:
        result = calFibo(n - 1) + calFibo(n - 2)
        fibo[n] = result # memoization
        return result  

print(calFibo(100))