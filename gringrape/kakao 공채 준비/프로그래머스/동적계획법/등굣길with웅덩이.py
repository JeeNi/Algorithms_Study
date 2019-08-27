# 웅덩이가 존재하는 경우
w = [[-1 for i in range(6)] for i in range(6)]
w[1][1] = 1
puddles = [[1,2],[2,2],[2,1]]

def way(m, n):
    if w[m][n] == -1:
        for puddle in puddles:
            if m == puddle[0] and n == puddle[1]:
                return 0
        if m == 1 and n != 1:
            w[m][n] = way(m, n - 1)
        elif n == 1 and m != 1:
            w[m][n] = way(m - 1, n)
        else:
            w[m][n] = way(m - 1, n) + way(m, n - 1)
    return w[m][n]

print(way(4,3))
for row in w:
    print(row)