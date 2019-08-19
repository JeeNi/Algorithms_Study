# 풀이계획
# 자료 
# - N 개의 숫자들로 이루어진 배열이 주어진다.
# - 숫자의 갯수 N이 주어진다.
# 구하는 것
# - 숫자들이 오름차순으로 정렬된 배열
# 조건
# - 분할 정복법을 사용한다.
# 풀이 계획
# - recursive case를 설정한다.
#   - 배열을 두 부분으로 자르고 전반부와 후반부로 나눈다.
#   - 각각에 대해서 merge sort 함수를 재귀적으로 호출한다.
#   - 결과를 병합한다.
# - base case를 설정한다.

# def merge(start, middle, end, targetList): #start ~ middle 까지의 하나의 정렬과 middle + 1에서 end 까지 또하나의 정렬을 적절한 비교를 통해서 합병한다.
#     tem
def merge(start, middle, end, targetList):
    temp = [0 for num in targetList]
    i = start
    j = middle + 1
    print(i, j)

    for k in range(start, end):
        if targetList[i] < targetList[j]:
            temp[k] = targetList[i]
            i += 1
        else:
            temp[k] = targetList[j]
            j = j + 1
    if i == middle:
        temp[end] = targetList[i]
    elif j == end:
        temp[end] = targetList[j]
    for k in range(start, end + 1):
        targetList[k] = temp[k]

def mergesort(start, end, targetList):
    # recursive case
    if start < end: 
        middle = int((start + end) / 2)
        mergesort(start, middle, targetList)
        mergesort(middle + 1, end, targetList)
        merge(start, middle, end, targetList)
        
# test
testList = [3, 7, 10, 1, 2, 5, 8, 9, 6]
mergesort(0, len(testList) - 1, testList)

print(testList)

# 실패원인
# 작은 단위 테스트를 통해 검증하지 않아서 오류가 났다.
# 쪼개서 코딩하고 합병하는 방식을 기본으로 해야한다.
# 작은 단위 코딩1. merge method

# testList = [1, 3, 2, 4]

# def merge(start, middle, end, targetList):
#     temp = [0 for num in targetList]
#     i = start
#     j = middle + 1
#     print(i, j)

#     for k in range(start, end):
#         if targetList[i] < targetList[j]:
#             temp[k] = targetList[i]
#             i += 1
#         else:
#             temp[k] = targetList[j]
#             j = j + 1
#     if i == middle:
#         temp[end] = targetList[i]
#     elif j == end:
#         temp[end] = targetList[j]
#     for k in range(start, end + 1):
#         targetList[k] = temp[k]

# merge(0, 1, 3, testList)

# print(testList)









