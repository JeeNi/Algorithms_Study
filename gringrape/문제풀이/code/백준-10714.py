
# # data case 1
# N = 15
# A = [182243672, 10074562 ,977552215, 122668426, 685444213, 3784162, 463324752 ,560071245, 134465220, 21447865, 654556327, 183481051, 20041805, 405079805, 564327789]

## data case 2
# N = 8
# A = [1, 10, 4, 5, 6, 2, 9, 3]

# # data case 3
# N = 5
# A = [2, 8, 1, 10, 9]

# input
N = int(input())
A = [int(input()) for i in range(N)]

SJ = 0
SI = 0

def getIndexI(A, jIndex):
  prv = getPrv(jIndex)
  next = getNext(jIndex)
  if A[next] > A[prv]:
    return next
  else:
    return prv

def getNext(curr):
  default = curr + 1
  if default >= N:
    return default - N
  else:
    return default

def getPrv(curr):
  result = curr - 1
  if result < 0:
    result += N
  return result

# first J selection
min = 1000000000
first = -1
for j in range(N):
  tempI = getIndexI(A, j)
  if min >= A[tempI]:
    min = A[tempI]
    first = j

SJ += A[first]
SI += A[getIndexI(A, first)]

# A rearrange
reA = []
curr = first
for i in range(N):  
  reA.append(A[curr])
  curr = getNext(curr)

reA.remove(SI)
reA.remove(SJ)
N -= 2

# second ~ last selection
while N > 0:
  if N == 1:
    SJ += reA[0]
    break
  if reA[getIndexI(reA, 0)] < reA[getIndexI(reA, N - 1)]:
    selJ = 0
    selI = getIndexI(reA, 0)
  else:
    selJ = N - 1
    selI = getIndexI(reA, N - 1)

  AJ = reA[selJ]
  AI = reA[selI]
  SJ += AJ
  SI += AI
  reA.remove(AJ)
  reA.remove(AI)
  N -= 2

print(SJ)