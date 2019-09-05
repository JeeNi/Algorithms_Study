## radix sort
### 정렬 알고리즘
- n 개의 d 자리 정수들
- 가장 낮은 자리수부터 d회 정렬
- 제한조건) 매 단계에서 사용하는 sort 알고리즘은 stable 해야 한다.

### 정렬 알고리즘의 이해
<세 자리숫자들의 정렬>
![1567657206584](C:\Users\user\AppData\Roaming\Typora\typora-user-images\1567657206584.png)

- 1의 자리를 정렬한다 -> **1의 자리에 대하여 정렬되어 있다.**
- 10의 자리를 정렬한다 -> **10의 자리에 대하여 정렬되어 있다.**
- 위의 두 정렬 결과 -> **전체에 대하여 정렬되어 있다.** 

- 분석
	- 어떤 두 수 -> 10의 자리를 정렬한다
		- 10의 자리가 같다
			- stable 특성 -> 정렬하기 전 순서를 따른다.
			- 두 수는 옳게 정렬된다. 
		- 10의 자리가 다르다
			- 두 수는 옳게 정렬된다

### 구현과 시간 복잡도
- 구현
	- 각 자리에 대해서 정렬
	- 정렬을 자릿수 만큼 반복
```python
# data
data = [329, 457, 657, 839, 436, 720, 355]
k = 9

# modification of data
stringData = [number for number in map(str, data)]

for d in range(2, -1, -1):
  # counting sort
  count = [0 for i in range(k + 1)]

  # counting numbers in data - o.k.
  for strNum in stringData:
    number = int(strNum[d])
    count[number] += 1 

  # accumulated sum of count - o.k.
  accCount = [0 for i in range(k + 1)]
  accCount[0] = count[0]
  for i in range(1, k + 1):
    accCount[i] = accCount[i - 1] + count[i]

  # sorting using accumulated sum of count - o.k.
  sortedArray = [0 for i in range(len(stringData))]
  for strNum in stringData[::-1]:
    target = int(strNum[d])
    newPos = accCount[target] - 1
    accCount[target] -= 1
    sortedArray[newPos] = strNum
  stringData = sortedArray
```

- 시간복잡도
	- d 자리 자연수들, counting sort 알고리즘을 사용한 경우. 	
	- O(d(n + k)) 