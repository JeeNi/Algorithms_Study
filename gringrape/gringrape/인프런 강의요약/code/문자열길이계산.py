# 문자열의 길이를 recursion을 사용해서 구해보자.
# 풀이계획
# - 함수를 선언한다.
# - base case 와 recursive case를 나눈다.
# 새롭게 알게 된것
# - python에서 substring을 구하는 방법.
#   - subString = string[startIndex:endIndex]
def length(str):
    if str == '':
        return 0
    else:
        return length(str[1:]) + 1

# test
string = 'hello this is my first example to calculate the length of a string I made'

if length(string) == len(string):
    print("결과가 옳습니다")