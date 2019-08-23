# 그리디 알고리즘 적용
# - 돈을 뽑는 시간이 가장 짧은 사람을 앞에 세운다.

import sys

N = int(sys.stdin.readline())
pi = sys.stdin.readline().split()
pi = list(map(int, pi))

pi.sort()

s = 0
xi = 0
for i in range(N):
    xi += pi[i]
    s += xi
print(s) 