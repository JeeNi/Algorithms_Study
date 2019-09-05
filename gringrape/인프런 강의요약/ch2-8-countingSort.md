## Counting sort
### 전제조건
- 어떤 배열에 들어있는 원소의 범위가 정해져 있다. -> **사전지식**

### 정렬방법
- 방법1. 종류에 따라 숫자의 갯수를 센다 -> 결과 배열에서 각 숫자를 갯수 만큼 출력한다.
    - 새로운 배열을 만든다.
    - 새로운 배열에서, 등장횟수를 원소의 값, 숫자의 종류를 index로 한다.(논리적)
    - 원래 배열의 각 원소를 순회한다.
    - 특정 숫자 종류가 나올 경우, 새로운 배열에서, 그 종류의 값을 1 증가 시킨다.
    - 결과 배열을 만든다.
    - 결과 배열에서 각 종류의 숫자를 갯수 만큼 만들어 넣는다. 

- 방법1의 문제점
    - 실제 데이터는 key와 record(value)로 구성
    - 실제 데이터 상에서 정렬할때는, key의 순서가 바뀌면 record의 순서도 key를 따라 바뀌어야 한다. 

- 방법2.  
    - 새로운 배열을 만든다.
    - 새로운 배열에서, 등장횟수를 원소의 값, 숫자의 종류를 index로 한다.(논리적)
    - 원래 배열의 각 원소를 순회한다.
    - 특정 숫자 종류가 나올 경우, 새로운 배열에서, 그 종류의 값을 1 증가 시킨다.
    - 등장 횟수의 누적합을 저장하는 배열을 만든다.
    - 원래배열을 순회하면서 누적합의 위치에 저장한다.

### counting sort의 구현
```python
# data
array = [2, 5, 3, 0, 2, 3, 0, 3]
k = 5

# count array
count = [0 for i in range(k + 1)]

# counting numbers in data - o.k.
for number in array:
  count[number] += 1 

# accumulated sum of count - o.k.
accCount = [0 for i in range(k + 1)]
accCount[0] = count[0]
for i in range(1, k + 1):
  accCount[i] = accCount[i - 1] + count[i]

# sorting using accumulated sum of count
sortedArray = [0 for i in range(len(array))]
for target in array[::-1]:
  newPos = accCount[target] - 1
  accCount[target] -= 1
  sortedArray[newPos] = target
```

### 시간복잡도 및 속성
- 시간복잡도
	- O(n + k) -> k가 n 보다 커질 경우 시간복잡도상의 이득이 작아진다. 
- stable 속성
	- 입력에 먼저 나온 값이 출력에서도 먼저 나온다.  	