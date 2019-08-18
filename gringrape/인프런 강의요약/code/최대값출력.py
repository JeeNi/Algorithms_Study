def findMax(data, begin, end):
    if begin == end:
        return data[begin]
    else:
        return max(data[begin], findMax(data, begin + 1, end))

# test
data = [10, 100, 9999, 1, 2, 3, 4, 5, 6]
begin = 0
end = len(data)
print(findMax(data, 0, len(data) - 1))