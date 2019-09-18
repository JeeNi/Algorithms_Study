## 동적 프로그래밍

### 동적 프로그래밍의 필요성 - 예시
#### 1.  Fibonacci Numbers
- fibonacci numbers -> 계산의 중복 -> memoization을 통한 해결
- bottom up 방식으로 초기값 부터 계산해 올라와서 K항의 값을 구할때, K-1, K-2항을 알고 있으므로 덧셈에 의해서 구할 수 있다.

#### 2. Binomial Coefficient
- nCk = ?
	- nCk = n-1Ck-1 + n-1Ck 이용
	- 많은 계산이 중복된다. 
	- bottom up, top down + memoization 을 사용해서 구현할 수 있다.

- memoization vs dynamic programming
