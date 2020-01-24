lst = []
num = int(input())
for n in range(num):
    numbers = int(input())
    lst.append(numbers)
x = int(input())
found = False
for i in range(len(lst)):
    if lst[i] == x:
        found = True
        break
if found == True:
  print("{} is present at location {}".format(x, i ))
else:
  print("Element is not found")
      
        
    