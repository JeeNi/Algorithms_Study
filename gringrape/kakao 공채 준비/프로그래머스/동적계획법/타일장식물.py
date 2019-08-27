S = [-1 for i in range(82)] # 합 저장소
A = [-1 for i in range(82)] # 변의 길이 저장소
A[1] = 1
A[2] = 1
S[1] = 4

def calA(n):
    if A[n] == -1:
        A[n] = calA(n - 1) + calA(n - 2)
    return A[n]

def solution(N):
    if S[N] == -1:
        S[N] = solution(N - 1) + 2 * calA(N)
    return S[N]

print(solution(4))