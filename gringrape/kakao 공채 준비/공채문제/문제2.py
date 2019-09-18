def check(p):
    stack = []
    for char in p:
        if char == '(':
            stack.append(char)
        else:
            try: 
                stack.pop()
            except IndexError:
                return False
    return len(stack) == 0

def findFirstBalacedIndex(p):
    for i in range(1, len(p), 2):
        balance = 0
        for char in p[0:i + 1]:
            if char == '(':
                balance += 1
            else:
                balance -= 1
        if balance == 0:
            return i
    return 0

def flip(p):
    resultArray = []
    for char in p:
        if char == '(':
            resultArray.append(')')
        else:
            resultArray.append('(')
    return ''.join(resultArray)
        
def solution(p):
    # base case 빈문자열, 올바른 괄호 문자열
    if len(p) == 0:
        return p
    if check(p):
        return p
    
    # recursive case 
    # 1 - 두 균형잡힌 문자열로 분리
    k = findFirstBalacedIndex(p)
    u = p[0:k + 1]
    v = p[k + 1:]
    print(u, v)
    # 2 - u 의 검사결과에 따라 분리
    if check(u):
        return solution(v)
    else:
        part = solution(v)
        # 뒤집기, 붙이기
        print(flip(u[1:len(u) - 1]))
        return '(' + flip(u[1:len(u) - 1]) + ')' + part

p = "()))((()"
print(solution(p))