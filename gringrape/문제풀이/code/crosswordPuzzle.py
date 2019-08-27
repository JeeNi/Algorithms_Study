# input data 읽어오기
fo = open("input.txt", "r")
dataStrings = fo.read().splitlines()

wordsData = dataStrings[10]
words = wordsData.split(';')

dataStrings.remove(wordsData)
puzzle = [[char for char in string] for string in dataStrings]

# # input data Test -> words, puzzle -> success!
# print(words)
# for row in puzzle:
#     print(row)

# 풀이 계획 1.
# - backtracking 활용
#   - 단어를 넣을 line을 분류한다.
#   - base case 를 설정한다.  
#     - line 에 넣을 단어가 없거나, 길이가 안맞을 경우 fail
#     - 단어 list에 단어가 한 개도 없을 경우 success
#   - recursive case 를 설정한다.   