# data
array = [2, 5, 3, 0, 2, 3, 0, 3]
k = 5

# counting sort
count = [0 for i in range(k + 1)]

# counting numbers in data - o.k.
for number in array:
  count[number] += 1 

# accumulated sum of count - o.k.
accCount = [0 for i in range(k + 1)]
accCount[0] = count[0]
for i in range(1, k + 1):
  accCount[i] = accCount[i - 1] + count[i]

# sorting using accumulated sum of count
sortedArray = [0 for i in range(len(array))]
for target in array[::-1]:
  newPos = accCount[target] - 1
  accCount[target] -= 1
  sortedArray[newPos] = target

# checking
# print(count)
# print(accCount)
