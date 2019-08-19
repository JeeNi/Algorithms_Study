# Array의 연산
# insert 연산 - '3 과 4 사이에 7을 삽입'
x = [1, 2, 3, 4, 5]

# step1. 새로운 list y의 생성
y = [0 for i in range(len(x) + 1)]
# step2. insert 이전까지 reference 복사
for i in range(3) :
    y[i] = x[i]
# step3. insert
y[3] = 7
# step4. insert 이후 부터 reference 복사
for i in range(3, len(x)) :
    y[i + 1] = x[i]
# step5. y 의 reference를 x에 복사
x = y

print(x)