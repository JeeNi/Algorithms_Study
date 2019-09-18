s = "abcabcdede"
targetStep = 2

def findLengCompressed(s, targetStep):
  # 1 단계 - 자르기 o.k
  splitArray = []
  step = targetStep

  for i in range(0, len(s), step):
    seg = ''
    for j in range(step):
      if i + j < len(s):
        seg += s[i + j]
    splitArray.append(seg)

  # 2 단계 - 압축하기
  compressedArray = []
  repeatCount = 1
  length = len(splitArray)
  for i in range(length - 1):
    prev = splitArray[i]
    curr = splitArray[i + 1] # 단위 1
    if prev == curr:
      # 압축
      repeatCount += 1
      if i == length - 2:
        compressedArray.append(str(repeatCount) + prev)
    else:
      if i == length - 2:
        if repeatCount == 1:
          compressedArray.append(prev + curr)
        else:
          compressedArray.append(str(repeatCount) + prev + curr)
      else:# 압축 안함 -> prev 삽입
        if repeatCount == 1:
          compressedArray.append(prev)
        else:
          compressedArray.append(str(repeatCount) + prev)
        repeatCount = 1
  result = ''.join(compressedArray)
  return len(result)

min = findLengCompressed(s, 1)
for i in range(2, int(len(s) / 2) + 1):
  targetLen = findLengCompressed(s, i)
  if min >= targetLen:
    min = targetLen

print(min)