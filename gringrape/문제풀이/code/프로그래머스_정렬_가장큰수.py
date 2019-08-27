# # 문자열 비교 test -1 -o.k
# array = [6, 10, 2]
# testArray = [i for i in map(str, array)]
# testArray.sort()
# testArray.reverse()
# print(testArray)

# 문자열 비교 test -2
def takeSecond(element):
    return element[1]

array = [0, 3, 30, 34, 40, 9, 5, 4, 1000, 1]
strArray = [i for i in map(str, array)]
for i in range(len(strArray)):
    while len(strArray[i]) < 3:
        strArray[i] += strArray[i][0]
    if strArray[i][0] == 1:
        strArray[i] += '1'
temp = []
for i in range(len(strArray)):
    temp.append((i, strArray[i]))
temp.sort(key=takeSecond, reverse=True)

ans = ''
for el in temp:
    ans = ans + str(array[el[0]])
print(ans)

# def takeSecond(element):
#     return element[1]

# def solution(numbers):
#     strArray = [i for i in map(str, numbers)]
#     for i in range(len(strArray)):
#         j = 0
#         while len(strArray[i]) < 4:
#             strArray[i] += strArray[i][j]
#             j += 1
#     temp = []
#     for i in range(len(strArray)):
#         temp.append((i, strArray[i]))
#     temp.sort(key=takeSecond, reverse=True)

#     ans = ''
#     for el in temp:
#         ans = ans + str(numbers[el[0]])
#     return ans