# priority queue

## 개념
- queue
	- FIFO를 만족하는 자료구조, 가장 먼저 들어온 것이 가장 먼저 나간다.
- priority queue
	- queue 에 들어온 데이터 들이 **우선순위**를 가지고 있다.
	- 우선순위가 높은 것이 먼저나간다. 

## 지원하는 연산
- insert(x) : 새로운 원소 x를 삽입
- extract_max() : 최대값을 삭제하고 반환 -> 뭘 반환?

## insert 연산 구현
### 1. insert 연산
- 하나의 노드를 넣는 경우, max heap property가 깨지게 된다.
- max heap property 를 유지하는 방법	
	1. 삽입한 노드를 부모 노드와 비교 
	2. 부모 노드가 삽입한 노드보다 작을 경우, 자리 바꾸기
	3. 부모 노드가 자식노드보다 클때까지 1, 2 반복

### 2. pseudo code
```
max-heap-insert(A, key) {
	heap_size += 1
	A[heap_size] = key
	i = heap_size
	while(i > 1 and A[i] > A[parent(i)]) {
		exchange A[i] and A[parent(i)]
		i = parent(i)
	}
}
```

### 3. 알고리즘의 시간복잡도
- 대략적인 계산
	- 노드의 총 갯수를 n 이라고 할 때, 트리의 높이는 log2n 이다
	- 총 교환횟수는 최악의 경우 log2n 이 된다. 

## extract max
### 1. extract max 연산
- 배열의 가장 끝에 있는 값을 루트로 보낸다.
- 루트에 있는 값은 지워진다.
- max heap property를 만족하기 위해 max-hepify 연산을 수행한다.

```
heap-extract-max(A) {
	if heap-size[A] < 1
		then error "heap underflow"
	max <- A[1]
	A[1] <- A[heap_size]
	heap_size -= 1
	max-heapify(A, 1)
	return max
}
```