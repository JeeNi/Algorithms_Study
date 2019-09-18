Row = 4
Col = 4
X = 100000
m = [
    [X, X, X, X, X],
    [X, 6, 7, 12, 5], 
    [X, 5, 3, 11, 18], 
    [X, 7, 17, 3, 3], 
    [X, 8, 10, 14, 9]
]

p = [[9 for i in range(Col + 1)] for j in range(Row + 1)]

L = [[-1 for i in range(Col + 1)] for j in range(Row + 1)]

for i in range(Col + 1):
  L[0][i] = X
for i in range(Row + 1):
  L[i][0] = X

L[1][1] = m[1][1]

def calL(i, j):
  if L[i][j] == -1:
    L[i][j] = min(calL(i - 1, j), calL(i, j - 1)) + m[i][j]
  return L[i][j]

def pathFind(i, j):
  print(i, j)
  p[i][j] = 0
  if L[i][j - 1] < L[i - 1][j]:
    pathFind(i, j - 1)
  elif L[i][j - 1] > L[i - 1][j]:
    pathFind(i - 1, j)
  if i == 1 and j == 1:
    return

calL(4, 4)
pathFind(4, 4)
for row in p:
  print(row)