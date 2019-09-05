abcArray = input().split(' ')
abcArray.sort()
prtOrder = input()
for char in prtOrder:
    idx = ord(char) - ord('A')
    print(abcArray[idx], end=" ")
