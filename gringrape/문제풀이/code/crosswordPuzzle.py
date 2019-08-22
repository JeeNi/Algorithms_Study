# input data 읽어오기
fo = open("input.txt", "r")
dataStrings = fo.read().splitlines()

wordsData = dataStrings[10]
words = wordsData.split(';')

dataStrings.remove(wordsData)
puzzle = [[char for char in string] for string in dataStrings]



# # input data Test -> words, puzzle
# print(words)
# for row in puzzle:
#     print(row)