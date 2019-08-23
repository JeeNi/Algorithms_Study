string = "00011000000000000000000000000000000000000000000000000010110111011100000000"

# compound string
comp = []
status = string[0]
comp.append(status)
for char in string:
    if status != char:
        status = char
        comp.append(status)

ct0 = 0
ct1 = 0
for num in comp:
    if num == "0":
        ct0 += 1
    else:
        ct1 += 1

if ct0 < ct1:
    print(ct0)
else:
    print(ct1)

print(comp)