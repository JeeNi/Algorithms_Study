# Linked List
index 구조가 아닌 **reference 구조**로 동작해서 중간에 공간을 만들어줄수 있음.

## 1. reference 구조 이해
### reference란?
- 위키 피디아 
	- a reference is a value that enables a program to indirectly access a particular datum
	- 특정한 데이터를 저장하고 있는 위치라고 생각

### reference와 value
- == , is 연산자의 차이
- 전자는 reference가 가리키는 value를 비교
- 후자는 reference를 비교 -> 같은 곳에 저장되어 있는지 비교
- [ ] 실험적으로 비교
![](../images/isVersus==.png)

## 2. singly linked list
- 하나의 노드의 구성
	- 다음 노드의 reference를 갖는 변수
	- 해당 노드의 값의 reference를 갖는 변수
- 특별한 노드(Head, Tail)

### 노드 클래스의 구현
- 멤버 변수
	- 다음 노드의 reference를 갖는 변수
	- 노드 객체가 head 인지 확인하는 변수
	- 노드 객체가 tail인지 확인하는 변수
- 멤버 함수  
	- 값을 저장하고 가져오는 함수 