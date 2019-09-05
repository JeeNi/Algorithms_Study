## 강의 주제
- comparison sort의 시간복잡도는 n(logn) 보다 작아질 수 없다. 

### comparison vs non-comparison
- 전자는 데이터들의 상대적 크기만을 사용해서 정렬하는 알고리즘
- 후자는 사전지식을 이용 -> 실제 데이터의 특성을 이용

- <그림> 사전지식을 이용하는 bucket sort의 예시
	- 이 경우의 사전지식: 모든 숫자들은 0 ~ 49 범위에 속한다.  	
![img](https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/Bucket_sort_1.svg/1920px-Bucket_sort_1.svg.png)

### 모든 comparison sort의 공통과정을 추상화
#### decision tree
- 추상화 도구
	- comparison sort의 종류와 관계없이 decision tree를 그려서 비교상황을 그릴 수 있다.

- 특징
	- 모든 decision tree 의 leaf node 갯수는 n! 개이다 -> **모든 가능한 배열의 경우의 수**
	- 최악의 경우 시간 복잡도는 **tree의 높이**에 비례

- 시간복잡도의 하한값(lower bound)
	- 높이가 가장 작아지는 경우는 decision tree가 **full binary tree** 가 되는 경우 
```
n! = n * (n - 1) * (n - 2) * ... * 1
	< n ^ n
lowerBound = n * log2(n)
```