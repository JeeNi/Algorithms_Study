# Linked List 구현

## Head and Tail
- list 의 경계(처음과 끝)을 알려주는 두개의 노드
- 값을 포함하지 않는다. 
- iteration을 편하게 할 수 있도록 도움을 준다.	 

## Search operation
- 노드를 따라가면서 특정 값의 포함 여부를 검사
- 순서
	- 1. head node 를 찾는다.
	- 2. 다음 노드로 이동한다.
		- 2-1. 다음 노드가 tail 일 경우 종료한다.
		- 2-2. 다음 노드가 tail 이 아닐 경우 값을 검사한다.
			- 2로 돌아간다. 
- 연산횟수 최악의 경우 n 회 

## insert operation
- Nodeprev, Nodenew, Nodenext
- Nodenew()
- Nodeprev.next = Nodenew
- Nodenew.next = Nodenext
- 연산횟수 3회

## delete operation
- Nodeprev.next = Nodenext