## 동적 프로그래밍의 일반적인 요소
- 주로 최적화, 카운팅 등 **값**을 구하는 문제에 적용된다.
- 순환식(점화식)을 세운다.
- 순환식을 memoization이나 bottom-up 방식으로 해결한다.



## 동적계획법의 추상화
#### 1. 순환식을 세운다:  original problem 을 sub-problem으로 나누어서 해결한다 
 순환식을 세운다는 것은 원래 구하고자 하는 것을 나누어서, 나누어진 것의 해답을 구하는것으로 원래의 것을 구하는 것이다. 

#### 2. divide and conquer(분할정복법) 와의 차이점
 분할정복법과의 공통점은 원래의 해를 구하는 대신 대상을 나누어서, 나누어진 것들의 해를 구한다는 것이다. 차이점은, 분할정복법의 경우 나누어진 것들은 일반적으로 서로 중복되지 않지만, 동적계획법의 경우 나누어진 것들 간의 중복이 일어난다는 것이다.

#####                                  "동적 계획법은 subproblem 들 간의 overlapping이 존재한다." 



## 동적계획법과 최적화
A problem is said to have **optimal substructure** if an **optimal solution** can be constructed efficiently from optimal solutions of its **subproblems**.

-> 즉, 최적화 문제를 동적 계획법으로 풀기 위해서는, 해당 문제가 optimal substructure를 가졌는지를 먼저 확인해야 한다. 

#### -> 어떤 문제가 optimal substructure를 가졌는지 확인하기 위한 질문.

** -> 최적해의 일부분이 그 부분에 대한 최적해인가? **

- 순환식을 세우는 요령

```

d(u) = (about every adjacent v) min(d(v) + m(u, v))

u 까지 오는 최단경로는, u 에 인접한 모든 v 까지 오는 최단경로에, 가중치를 더한 값의, 
최솟값이라고 볼 수 있다 
```

