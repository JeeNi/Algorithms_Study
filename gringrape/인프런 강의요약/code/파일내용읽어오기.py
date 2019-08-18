def printContent(filename):
    text = open(filename, 'r')
    printContentRecur(text)
    
def printContentRecur(text):
    char = text.read(1)
    if char == '.':
        print(char)
    else:
        print(char, end='')
        printContentRecur(text)

# recursion test
printContent('some.txt')

# # file read test
# text = open('some.txt', 'r')
# print(text.read(1))