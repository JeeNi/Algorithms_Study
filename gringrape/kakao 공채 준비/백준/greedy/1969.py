# hamming distance 합이 최소 => 각 자리에서 distance 최소가 되도록 골라냄

## step 1. local
# test = ['A', 'C', 'C', 'C', 'G']
# sel = test[0]
# disMin = 0
# for j in range(len(test)):
#     if test[j] != test[0]:
#         disMin += 1

# for i in range(1, len(test)):
#     dis = 0
#     for j in range(len(test)):
#         if test[j] != test[i]:
#             dis += 1
#     if dis == disMin:
#         if test[i] < sel:
#             sel = test[i]
#     elif dis < disMin:
#         disMin = dis
#         sel = test[i]
# print(sel, disMin)

# Step2. global

fo = open("input1969.txt", "r")
N, l = map(int, fo.readline().split())
strings = fo.read().splitlines()

ans = []
s = 0

# global
for ch in range(l):
    sel = strings[0][ch]
    disMin = 0
    for st in range(N):
        if strings[st][ch] != strings[0][ch]:
            disMin += 1
    for st in range(N): # select
        dis = 0
        # dis calculation
        for stTemp in range(N):
            if strings[st][ch] != strings[stTemp][ch]:
                dis += 1
        # local optimization
        if dis == disMin:
            if strings[st][ch] < sel:
                sel = strings[st][ch]
        elif dis < disMin:
            disMin = dis
            sel = strings[st][ch]
    # local -> global
    ans.append(sel)
    s += disMin
    
print(''.join(ans))
print(s)

# # input
# import sys

N, l = map(int, sys.stdin.readline().split())
strings = []
for i in range(N):
    strings.append(sys.stdin.readline())