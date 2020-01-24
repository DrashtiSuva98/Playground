a = input().lower()
b =[ord(j) for j in a]
#print(b)
c = [97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122]
for i in c:
    if i not in b:
        print(chr(i),end=",")
    else:
        pass