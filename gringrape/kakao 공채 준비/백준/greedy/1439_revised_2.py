string = "00011001"
status = ''
ct = 0
for char in string:
    if char != status:
        status = char
        ct += 1
print(int(ct / 2))