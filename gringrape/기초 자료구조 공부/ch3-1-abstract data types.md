## ch3 목표: singly linked list 를 활용하여 stack 과 queue 를 구현.

### List

- 무작위적인 자료를 하나의 정돈된 형식으로 저장.
- 가장 쉽게 적용할 수 있는 것이 선형적으로 저장하는 것. 

### ADT

- 어떤 데이터가 저장되는지 정의
- 저장된 데이터에 대해 어떤 연산이 일어나는지 정의
- Error condition을 정의
- abstract 이므로 세세한 구현을 정해주지는 않는다

#### ADT의 예

- 저장되는 **자료**는 구매, 판매 주문들이다.
- 자료에 대한 **연산**은 다음과 같다.
	- order buy(stock, shares, price) : order를 반환하는 buy method 
	- order sell(stock, shares, price) 
	- void cancel(order)
- 예상되는 **오류 조건**은 다음과 같다.
	- 존재하지 않는 stock에 대해서 buy , sell
	- 존재하지 않는 order를 취소  	
