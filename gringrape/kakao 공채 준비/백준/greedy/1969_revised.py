fo = open("input1969.txt", "r")
N, l = map(int, fo.readline().split())
strings = fo.read().splitlines()

dnaType = ['G', 'A', 'T', 'C']

ans = []
s = 0

for ch in range(l):
    selType = dnaType[0]
    disMin = 0
    for st in range(N):
        if strings[st][ch] != selType[0]:
            disMin += 1

    for typ in range(1, len(dnaType)):
        dis = 0
        for st in range(N):        
            if strings[st][ch] != dnaType[typ]:
                dis += 1
        
        if dis == disMin:
            if dnaType[typ] < selType:
                selType = dnaType[typ]
        elif dis < disMin:
            disMin = dis
            selType = dnaType[typ]
    
    s += disMin
    ans.append(selType)

print("".join(ans))
print(s)

                
            