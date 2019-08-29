def solution(s):
    inWord = False
    wordStart = -1
    answer = ''
    print("%s" %(inWord))
    for index in range(len(s)):
        # inWord check
        if inWord == False and s[index] != ' ':
            inWord = True
            wordStart = index
        elif inWord == True and s[index] == ' ':
            inWord = False
        # change
        if (index - wordStart) % 2 == 1:
            answer += s[index].lower()
        else:
            answer += s[index].upper()
        print("%d, %s" %(index, inWord))
    return answer

print(solution("  this   miss"))