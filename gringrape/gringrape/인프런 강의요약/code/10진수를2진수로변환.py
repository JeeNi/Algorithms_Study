# 문제정의
# - 10진수 하나를 입력받아 2진수로 변환하여 출력하는 프로그램을 작성.
# 풀이계획
# - 1. recursive case 
#   - 입력값을 2로 나누고 버림하여 재귀호출의 새로운 입력값으로 사용
#   - mod2 를 출력
# - 2. basecase
#   - 입력값이 0일 경우 return 

def convertBinary(num):
    if num == 0:
        return
    else:
        convertBinary(int(num / 2))
        print(num % 2, end='')

# test
convertBinary(9)
