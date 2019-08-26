# heap data
A = [0, 16, 4, 10, 14, 7, 9, 3, 2, 8, 1]

# good result
Agood = [0, 16, 14, 10, 8, 7, 9, 3, 2, 4, 1]

# max heapify
def maxHeapify(A, i):
    left = 2 * i
    right = 2 * i + 1

    # no child
    if left >= len(A):
        return
    # biggest child
    if left == len(A) - 1:
        k = left
    elif A[left] <= A[right]:
        k = right
    else:
        k = left
    # parent bigger than the biggest child
    if A[i] >= A[k]:
        return
    # exchange
    temp = A[i]
    A[i] = A[k]
    A[k] = temp
    maxHeapify(A, k)
    
# Test
maxHeapify(A,2)
if A == Agood:
    print("테스트가 성공했습니다.")
    print("수행 전: " + str(A))
    print("수행 후: " + str(Agood))
else:
    print("테스트가 실패했습니다.")
    print("수행 전: " + str(A))
    print("수행 후: " + str(Agood))