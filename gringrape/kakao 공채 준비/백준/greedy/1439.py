string = "1001100001100111"
ct0 = 0
ct1 = 0
for char in string:
    if char == "1":
        ct1 += 1
    else:
        ct0 += 1

tar = "0"
if ct1 < ct0:
    tar = "1"

count = 0
status = string[0]
if tar == status:
    count += 1

for i in range(len(string)):
    if status != string[i]:
        status = string[i]
        if tar == status:
            count += 1

print(count)