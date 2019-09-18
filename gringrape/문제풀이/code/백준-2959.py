numbers = [number for number in map(int, input().split(' '))]
numbers.sort()
print(numbers[0] * numbers[2])