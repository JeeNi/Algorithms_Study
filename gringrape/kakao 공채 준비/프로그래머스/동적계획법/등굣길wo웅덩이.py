w = [[-1 for i in range(10)] for i in range(10)]

def way(m, n):
    if w[m][n] == -1:
        if m == 1 or n == 1:
            w[m][n] = 1
        else:
            w[m][n] = way(m - 1, n) + way(m, n - 1)
    return w[m][n]

print(way(5,5))
for row in w:
    print(row)