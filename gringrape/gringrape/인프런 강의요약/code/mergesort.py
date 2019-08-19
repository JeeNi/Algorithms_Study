# 1. 문제분석
# - 자료 
#   - N 개의 숫자들로 이루어진 배열이 주어진다.
#   - 숫자의 갯수 N이 주어진다.
# - 구하는 것
#   - 숫자들이 오름차순으로 정렬된 배열
# - 조건
#   - 분할 정복법을 사용한다.
# 2. 풀이 계획 -> 실패를 통한 개선
#   - part1. merge() 를 구현한다.
#       - 합병 대상이 주어진다
#       - 합병 대상의 전반부와 후반부의 시작값인 두 값(i, j)를 비교 하여 임시공간에 넣는다
#       - i < j 인 경우에는 i를 한칸 진행하여 비교하고 임시공간에 넣는다
#       - 마지막 비교시에는 작은값을 먼저 삽입하고 후에 큰값도 삽입한다
#       - 임시 공간의 값들을 원래의 합병 대상으로 복사한다.
#   - part2. mergesort() 를 구현한다
#       - 재귀

def merge(start, middle, end, targetList):
    # 임시로 정렬된 값을 담아둘 공간을 초기화
    temp = [0 for num in targetList]

    # i, j 초기화
    i = start # 전반부 index
    j = middle + 1 # 후반부 index
    # print(i, j) -> for debbuging

    # 비교 후 삽입
    for k in range(start, end):
        # print(targetList[i], targetList[j]) -> for debugging
        if targetList[i] < targetList[j]:
            temp[k] = targetList[i]
            i += 1
        else:
            temp[k] = targetList[j]
            j += 1
        # print(i, j) -> for debugging

    # 마지막 요소 삽입
    if i == middle:
        temp[end] = targetList[i]
    elif j == end:
        temp[end] = targetList[j]

    # 임시 공간을 원래의 값으로 복사
    for k in range(start, end + 1):
        targetList[k] = temp[k]
    print(targetList)

# test merge
# # test case 1 -> o.k
# testList = [2, 1]
# merge(0, 0, 1, testList)
# # test case 2 -> o.k
# testList = [1, 3, 5, 7, 4, 6, 8]
# merge(0, 3, 6, testList)
# # test case 3 -> o.k
# testList = [1, 3, 5, 7, 9, 11, 4, 6, 8, 10, 12] 
# merge(0, int(len(testList)/2), len(testList) - 1, testList)
# print(testList)

def mergesort(start, end, targetList):
    if start < end:
        middle = int((start + end) / 2)
        mergesort(start, middle, targetList)
        mergesort(middle + 1, end, targetList)
        merge(start, middle, end, targetList)
    

# testcase 1.
targetList = [50, 3, 7, 9, 4, 18, 1, 2, 6, 5]
mergesort(0, len(targetList) - 1, targetList)
print(targetList)






