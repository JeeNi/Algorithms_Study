def ceiling(data, start, end, K):
    middle = int((start + end) / 2)
    if start > end:
        return -1
    else:
        if data[middle] >= K:
            if data[middle - 1] >= K:
                return ceiling(data, start, middle - 1, K)
            else:
                return middle
        else:
            return ceiling(data, middle + 1, end, K)

# jaemin
'''
def ceiling(data, start, end, K):
    middle = int((start + end) / 2)
    if start > end:
        return -1
    else:
        if data[middle] >= K and data[middle - 1] >= K:
            return ceiling(data, start, middle - 1, K)
        elif data[middle] >= K:
            return middle
        else:
            return ceiling(data, middle + 1, end, K)
'''

N = 25
data = [1, 3, 6, 9, 13, 17, 21, 23, 24, 31, 37, 38, 44, 45, 47, 51, 55, 58, 71, 73, 88, 91, 99, 101, 102]
K = 72 

print(ceiling(data, 0, N - 1, K))
print(data[ceiling(data, 0, N - 1, K)])