# Stack and Queue
singly linked list를 사용하는 자료구조

## Stack
- 스택의 예시
	- 한 쪽 문으로만 내릴 수 있는 택시 뒷좌석
	- 입출구가 같은 비행기 화물칸
- 스택의 구조
	- singly linked list의 변형
	- 한쪽 끝에서만 insert와 delete 가 이루어지도록 한다.
- 스택의 연산
	- pop
		- linked list에서 첫번째 것을 제거한다.  
	- push
		- linked list에서 첫번째에 삽입한다. 
- 스택 자료구조를 활용하는 예제
	- balancing symbols
		- 괄호의 여닫는 구조가 서로 잘 호응하는지 판단        

## Queue
- 큐의 실생활 예시
	- 공항에서 사람들이 기다리는 줄
	- 제품들이 올라가있는 생산라인
- 큐의 구조
	- 한쪽 끝에서 들어온다
	- 다른 쪽 끝에서 나간다.
	- 중간에서 입출이 없다. 
- 큐의 연산
	- enqueue
		- linked list의 첫번째에 삽입한다. 
	- dequeue 
		- linked list의 마지막 것을 제거한다. 