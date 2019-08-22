# 실패와 원인분석
# 1. pivot값을 end로 지정할 경우 무한 순환이 되는 문제
# - 문제 원인 분석
#   - pivot의 위치가 분할 과정 마지막에 바뀐다.
#   - 바뀐 위치를 기준으로 정렬해야한다.
# - 문제 해결
#   - 전반부와 후반부를 나누는 경계점의 index를 divide method 에서 return 받는다. -> 실패
# 2. 경계점의 index가 고정되는 현상
# - 문제 분석
#   - 경계점 좌측의 값들은 경계점의 값보다 작기 때문에, 경계점 위치가 바뀌지 않는다. 

from quicksortDivide import quicksortDivide
import random

def quicksort(start, end, targetList):
    if start < end:
        # pivot = random.randrange(start, end, 1)
        pivot = end
        seg = quicksortDivide(pivot, targetList)
        quicksort(start, seg - 1, targetList)
        quicksort(seg, end, targetList)

# # testcase1. -> success
# aList = [10, 7, 9, 4, 1, 11, 25, 6]

# # testcase2. -> success
# aList = [4, 1, 29, 3, 2, 5, 11]

# # testcase3. -> success  
# aList = [10, 2, 6, 7, 40, 23, 11, 5, 8, 9]

# # testcase tester
# quicksort(0, len(aList) - 1, aList)
# print(aList)