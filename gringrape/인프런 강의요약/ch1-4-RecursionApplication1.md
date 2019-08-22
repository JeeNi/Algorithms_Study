# 미로 찾기

## 알고리즘 설계
- 목표 : 출구까지 가는 경로를 찾는다.
- 현재 위치에서 출구까지 가는 경로가 존재한다. => 두가지 case로 분리
	- base case : 현재 위치가 출구
	- recursive case : 이웃한 셀들 중 하나에서 출구까지 가는 경로가 존재한다.	

## Pseudo code
```
boolean findPath(x,y)
	/* BASE CASE */
	if (x,y) is the exit
		return true;
	/* RECURSIVE CASE */
	else
		for each neighboring cell (x', y') of (x, y) do
			if (x', y') is on the pathway
				if findPAth(x', y')
					return true;
		return false;
	
```

- x', y' is on the pathway : x', y' 가 통로 위에 있는 경우

- 고려할 사항
	- 무한 loop 에 빠지지 않는가?
		- 이미 방문된 셀을 다시 방문 하는 경우에는 무한 loop에 빠질 수 있다. -> 서로를 번갈아가면서 무한히 호출하는 상황이 발생한다. 

- 무한 loop를 고려한 pseudo code의 수정
	- 1. 셀을 방문했을때, 방문 사실을 셀에 표시
	- 2. 이웃한 셀에서 출구까지 경로가 있는지 검사할때, 이미 방문한적이 있는 셀인 경우 제외 

## Pseudo code (改)
```
boolean findPath(x,y)
	/* BASE CASE */
	if (x,y) is the exit
		return true;
	/* RECURSIVE CASE */
	else
		mark(x, y) as visited // 1. marking
		for each neighboring cell (x', y') of (x, y) do
			if (x', y') is on the pathway and not visited // 2. not visited
				if findPAth(x', y')
					return true;
		return false;
```
- 조건문이나 반복문의 경우, 중첩 되는 횟수가 늘어날 수 록 읽기 어려운 코드가 된다.
	- 가독성을 위해서 중첩의 횟수를 줄여보자.

## Pseudo code (읽기 쉬운 version)
```
boolean findPath(x,y)
	if (x,y) is not on the pathway or visited
		return false;
	else if (x,y) is the exit
		return true;
	else
		mark (x,y) as visited
		for each neighboring cell (x',y') of (x,y)
			if findPath(x,y) is true
				return true;
     	return false;
```

## 알고리즘의 구현
- 셀의 종류를 구분
	- 통로, 벽, 방문
	- 방문된 셀을 두가지로 분류
		- 통로가 있는 경우
		- 통로가 없는 경우 		