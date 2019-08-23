# 한명씩 자신이 기억하는 것대로 줄을 세운다.
# 자기 차례가 돌아온다.
# 자기 왼쪽에 큰 사람이 몇명 있었는지 확인한다.
# 큰 순서대로 그 사람을 데려와 세운다.
# 다음 차례로 넘어간다.

N = int(input())
biggers = list(map(int, input().split(' ')))
ordered = ['?' for i in range(1, N + 1)]

# concrete case 풀이를 통해 안보이는 조건 찾기
# [1, 2, 3, 4], [2, 1, 1, 0] 예시
# [?, ?, 1, ?] ->[?, 2, 1, ?] -> 비어있는 칸은 지금 놓는 수보다 크다. -> 비어있는 칸의 갯수를 세고 그 다음에 놓으면 된다.

i = 1
for bigger in biggers:
    j = 0
    for j in range(N):
        if ordered[j] == '?':
            bigger -= 1
            if bigger == -1:
                ordered[j] = i
    i += 1

for num in ordered:
    print(num, end=" ")


        
