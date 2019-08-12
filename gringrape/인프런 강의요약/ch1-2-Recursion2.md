## Recursion

### Recursion의 활용

#### 1. 문자열의 길이 계산
```python
def length(str):
	if str == '':
		return 0
	else:
		return length(str[1:]) + 1

# python substring syntax
# - substring = string[start:end]
# - accesing element in string by index : string[index]
```

#### 2. 문자열을 거꾸로 출력
```python
def printReverse(str):
	if str == '':
		return
	else:
		printReverse(str[1:])
		print(str[0],end='')
```

#### 3. 이진수로 변환하여 출력
- 문제정의
	- 10진수 하나를 입력받아 2진수로 변환하여 출력하는 프로그램을 작성.
- 풀이계획
	1. recursive case 
  		- 입력값을 2로 나누고 버림하여 재귀호출의 새로운 입력값으로 사용
  		- mod2 를 출력
	2. base case
  		- 입력값이 0일 경우 return 
```python
def convertBinary(num):
    if num == 0:
        return
    else:
        convertBinary(int(num / 2))
        print(num % 2, end='')
```
#### 4. 파일로 부터 자료 읽어와서 출력
```python
def printContent(filename):
    text = open(filename, 'r')
    printContentRecur(text)
    
def printContentRecur(text):
    char = text.read(1)
    if char == '.':
        print(char)
    else:
        print(char, end='')
        printContentRecur(text)
```

### recursion vs iteration
- 모든 반복문은 재귀형식으로 변경가능 (역도 성립)
- recursion + : 복잡한 알고리즘을 단순하게 함
- recursion - : 매개변수전달, 액티베이션 프레임 생성등 추가적인 자원사용이 있음.