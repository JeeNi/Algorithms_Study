### python list(array)

#### 검색 연산
- array의 index를 따라가며 특정원소(x)의 존재 여부 탐색.
	
	```
	for i in range(len(array)) :
		if array[i] == x
		print(hit)
	```

	- x 가 array의 원소로 존재하지 않는 경우
		- 존재하지 않는다는 것을 확정하기 위해서 len(array) 번 만큼 비교를 수행하여야 한다.
	- x 가 array의 원소로 존재하는 경우
		- 존재한다는 것을 확정하기 위해서 **최악의 경우** len(array) 번 만큼 비교를 수행하여야 한다.    

#### insert 연산
- step1. 새로운 list 생성
- step2. insert 되는 index 이전까지 reference 복사(동일한 자료를 가리키도록)
- step3. insert 되는 index 에 새로운 원소의 reference 삽입
- step4. insert 되는 index 이후부터 reference 복사
- step5. 새로운 list의 reference 복사
- insert 연산의 총 기본연산 횟수는 n 회.

#### delete 연산
- step1. 새로운 list 생성 (하나 줄어든 길이)
- step2. delete 되는 index 이전까지 reference 복사
- step3. delete 되는 index 부터 reference 복사
- step4. 새로운 list를 가리키는 reference를 복사
- delete 연산의 총 기본연산 횟수는 n회
