## Recursion

### 정의

- 자기 자신을 호출
	- 자기 자신을 호출 하는 예시 -> 무한 루프
	- 자기 자신을 호출 하면서 무한 루프에 빠지지 않는 경우.

### 무한루프에 빠지지 않는 Recursion

- case 분류
	- base case
	- recursive case 

- 조건
	- 적어도 하나의 base case가 존재
	- recursive case를 반복했을때 base case로 수렴. 

### 수학적 귀납법과 재귀

- 예시
	- base: s1 = 1
	- recursive: sn = sn-1 + n

### Factorial 계산 
```java
public int factorial(n) {
	if (n == 0) {
		return 1;
	}
	else {
		return factorial(n - 1) * n;
	}
}
```

### 최대 공약수

- Euclead method
	- 두 자연수 m, n에 대하여 m > n 일때, m이 n의 배수라면 두수의 최대공약수는 n이 되고, 그렇지 않다면 두수의 최대공약수는 n 과 m%n 의 최대공약수와 같다. 
```java
public int gcd(int m, int n) {
	if (m < n) {
		temp = m;
		m = n;
		n = temp;
	}
	if (m % n == 0)
		return n;
	else
        return gcd(n, m % n);
}
```

- 생각해보기
	- [x] 왜 Euclead method를 이용한 재귀는 무한루프에 빠지지 않을까? 
		- 증명해야 할 것
			- recursive case 가 base case 로 수렴한다.
	- Euclead method 에 대한 생각
		- m = n의 배수  + m % n
		- m이 n으로 나누어 떨어지지 않을때,
			- n 의 배수가 아닌 부분에서 공약수 결정.
			- m 과 n 의 공약수는 m % n 과 n 의 공약수로 생각 할 수 있음.
	- Euclead method의 수렴
		- n > m % n
		- m % n >= 0
		- gcd(a, b) -> gcd(b, c) -> gcd(c, d) ...
		- a > b > c > d ... > x >= 0
		- x -> 0    	 