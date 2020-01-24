l=[]
class operation:
    def append1(self):
        ele = int(input())
        l.append(ele)

    def detete(self):
        ele = int(input())
        l.remove(ele)

    def disp(self):
        print('List:  {}'.format(l))
        
o =operation()
while True:
    print('0. Exit')
    print('1. Add')
    print('2. Delete')
    print('3. Display')
    n=int(input())
    if n == 1:
        o.append1()
        print('Enter number to append: List:  {}'.format(l))
    if n==2:
        o.detete()
        print('Enter number to remove: List:  {}'.format(l))
    if n==3:
        o.disp()
    if n==0:
        print('Exiting!')
        break    
    