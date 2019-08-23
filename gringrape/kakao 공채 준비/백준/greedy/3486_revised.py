# 1. 입력 처리 개선
# 2. 숫자를 거꾸로하는 부분 개선
 
# 1. input
# import sys

# for _ in range(int(sys.stdin.readline())):
#     a, b = sys.stdin.readline().split() 
# print(type(a))

# # 2. reverse
# a = 1230
# print(str(a)[::-1])

# 코드 개선
import sys

for _ in range(int(sys.stdin.readline())):
    a, b = sys.stdin.readline().split()
    revA = int(a[::-1])
    revB = int(b[::-1])
    revSum = str(revA + revB)[::-1]
    print(int(revSum))
