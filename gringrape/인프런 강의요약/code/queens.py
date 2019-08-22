N = 5 
COL = 5
cols = [1 for i in range(N)]

# 0 ~ (level - 1) 행 까지는 충돌이 없다.
# 0 ~ (level - 1) 행 에 놓여진 각각의 말과 level 번째의 말이 충돌되지 않도록 해야한다.
def promising(level):
    for i in range(level):
        # 같은 열에 있는지 확인
        if cols[i] == cols[level]:
            return False
        # 같은 대각선에 있는지 확인
        elif (level - i) == abs(cols[i] - cols[level]):
            return False
    return True

def queens(level):
    # base case
    if promising(level) == False:
        return False
    elif level == N - 1:
        return True
    # recursive case
    for i in range(COL):
        cols[level + 1] = i
        if queens(level + 1) == True:
            return True
    return False

print(queens(0))
print(cols)