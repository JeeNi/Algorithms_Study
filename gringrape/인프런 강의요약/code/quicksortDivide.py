# 문제의 정의
# 1. quicksort 의 구현
#   - quicksort 가 무엇인지?
#       - 분할정복법의 일종
#       - 어떤 pivot을 기준점으로 하여 원래의 배열을 분할.
#       - 분할된 배열들을 재귀적으로 정렬
# 2. 추가적으로 필요한 로직
#   - pivot을 고르는 로직 
#        - 무작위     
#   - pivot을 기준으로 주어진 배열을 나누는 로직.
# 공부한 내용들
# 1. python random number generation
#  - random.randrange(start, end, step) 

def quicksortDivide(pivot, array):
    i = 0
    j = 0
    while j < len(array) - 1:
    	if array[j] < array[pivot]:
        	temp = array[j]
        	array[j] = array[i]
        	array[i] = temp
        	i += 1
        	j += 1
    	else:
        	j += 1
    temp = array[pivot]
    array[pivot] = array[i]
    array[i] = temp
    return i


# # testcase 1. -> o.k.
# testArray = [5, 7, 10, 12, 2, 4, 8, 6, 3]
# pivot = len(testArray) - 1
# quicksortDivide(pivot, testArray)
# print(testArray)

# # testcase 2. -> o.k.
# testArray = [5, 7, 10, 12, 2, 4, 8, 6, 3, 6.5]
# pivot = len(testArray) - 1
# quicksortDivide(pivot, testArray)
# print(testArray)
