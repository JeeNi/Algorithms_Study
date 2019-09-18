s = "aabbacca"
resultArray = []
repeatCount = 1

for i in range(len(s) - 1):
  prev = s[i]
  next = s[i + 1] # 단위 1
  if prev == next:
    # 압축
    repeatCount += 1
    if i == len(s) - 2:
      resultArray.append(str(repeatCount) + prev)
  else:
    if i == len(s) - 2:
      resultArray.append(str(repeatCount) + prev + next)
    else:# 압축 안함 -> prev 삽입
      if repeatCount == 1:
        resultArray.append(prev)
      else:
        resultArray.append(str(repeatCount) + prev)
      repeatCount = 1

result = ''.join(resultArray)
print(result)