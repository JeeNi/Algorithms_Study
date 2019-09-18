# 단위 1 압축 성공
s = "aaaabbbbaccab"
resultArray = []
repeatCount = 1

for i in range(0, len(s) - 3, 2):
  prev = s[i] + s[i + 1]
  next = s[i + 2] + s[i + 3] # 단위 2
  if prev == next:
    # 압축
    repeatCount += 1
    if i == len(s) - 4:
      resultArray.append(str(repeatCount) + prev)
  else:
    if i == len(s) - 4 or i == len(s) - 5:
      if repeatCount == 1:
        resultArray.append(prev + next)
      else:
        resultArray.append(str(repeatCount) + prev + next)
    else:# 압축 안함 -> prev 삽입
      if repeatCount == 1:
        resultArray.append(prev)
      else:
        resultArray.append(str(repeatCount) + prev)
      repeatCount = 1

result = ''.join(resultArray)
print(result)