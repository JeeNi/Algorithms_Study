## merge sort
### 1. 분할정복법 - merge sort의 주된 idea
![](./images/divideAndConquer.png)

- 원래 문제를 **동일한** 작은 문제들로 **분할**한다.
- **분할**된 작은 문제들을 계산(해결)한다.
- 계산(해결)된 결과를 **병합**한다.

### 2. merge sort algoritm pseudo code
![](./images/mergeSortPseudo.png)

- step1. 반으로 쪼갠다. 
- step2. 각각에 대하여 정렬 함수를 호출한다.(recursive)
- step3. 결과를 합병한다.

