class Customer:
    def __init__(self,ac_no,acc_no):
        self.__ac_no=ac_no
        self.__acc_no=acc_no
        print('Customer Account Number : {}'.format(ac_no))

    def processAccount(self):
        if self.__ac_no in self.__acc_no:
            print('Processing Account')
        else:
            print('Account Not Found')
                

num = int(input())

lst = []
while True:
    n=int(input())
    if n==-1:
        break
    lst.append(n)

#for i in range(0,n):
    #lst.append(int(input()))
c=Customer(num,lst)
c.processAccount()

