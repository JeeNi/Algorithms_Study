def countPairs(data, start, end, K):
    # base case
    if start >= end:
        return 0
    # recursive case    
    else:
        sum = data[start] + data[end]
        if sum > K:
            return countPairs(data, start, end - 1, K)
        elif sum == K:
            return countPairs(data, start + 1, end - 1, K) + 1
        else:
            return countPairs(data, start + 1, end, K)
            
# 재귀함수에서 시간복잡도의 계산
# 1. 한번의 단계에서 몇개의 함수를 재호출하는지
# 2. 몇단계 인지
# 3. 한 번의 호출 당 몇번의 기본연산이 이루어지는지
# --
# 1. 1개 , 해당하는 조건에 대해서만 호출
# 2. 최악의 경우, n 단계
# 3. 5회 비교 3, 덧셈 1, 대입 1
# --
# 따라서 시간복잡도는 O(n)

N = int(input())
data = [number for number in map(int, input().split(' '))]
K = int(input())

print(countPairs(data, 0, N - 1, K))
