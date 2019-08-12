# 풀이계획
# 1. printReverse 함수 선언
# 2. recursive case 에서 함수를 콜하고, 그 후에 첫글자를 출력

def printReverse(str):
    if str == '':
        return
    else:
        printReverse(str[1:])
        print(str[0], end='')
        
# test
testString = "angel"
printReverse(testString)