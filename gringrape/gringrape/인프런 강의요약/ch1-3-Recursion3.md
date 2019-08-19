## Recursion

### recursive algorithm 설계
1. 암시적 매개변수를 명시적 매개변수로 바꿔라.
	- 재귀적인 호출을 위해 일반적인 형태로 함수 선언(매개변수 생략, 암시 최소화)
	- 순차검색 method 선언 예시
```	java
// implicit 
int search(int[] data, int end, int target)
// explicit
int search(int[] data, int begin, int end, int target)
```

### 최대값 찾기
```python
def findMax(data, begin, end):
    if begin == end:
        return data[begin]
    else:
        return max(data[begin], findMax(data, begin + 1, end))
```

