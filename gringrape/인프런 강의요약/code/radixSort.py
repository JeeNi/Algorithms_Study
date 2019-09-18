# data
data = [329, 457, 657, 839, 436, 720, 355]
k = 9

# modification of data
stringData = [number for number in map(str, data)]

for d in range(2, -1, -1):
  # counting sort
  count = [0 for i in range(k + 1)]

  # counting numbers in data - o.k.
  for strNum in stringData:
    number = int(strNum[d])
    count[number] += 1 

  # accumulated sum of count - o.k.
  accCount = [0 for i in range(k + 1)]
  accCount[0] = count[0]
  for i in range(1, k + 1):
    accCount[i] = accCount[i - 1] + count[i]

  # sorting using accumulated sum of count - o.k.
  sortedArray = [0 for i in range(len(stringData))]
  for strNum in stringData[::-1]:
    target = int(strNum[d])
    newPos = accCount[target] - 1
    accCount[target] -= 1
    sortedArray[newPos] = strNum
  stringData = sortedArray