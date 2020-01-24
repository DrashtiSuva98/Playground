class Account:
    def __init__(self,account_number,name, secret_code, amount_debited,amount_credited):
        self.__account_number=account_number
        self.__name= name
        self.__secret_code = secret_code
        self.__amount_debited= amount_debited
        self.__amount_credited=amount_credited

    def display(self):
        print('****Statement****')
        print('Account Number : {}'.format(self.__account_number))
        print('Holder Name : {}'.format(self.__name))
        print('Number of Debits : {}'.format(self.__amount_debited))
        print('Number of Credits : {}'.format(self.__amount_credited))

    def generateStatement(self,sc):
        if sc == self.__secret_code:
            self.display()
        else:
            print('Invalid Login')
    
accno= int(input())        
nm = input()
code = int(input())
debit = int(input())
credit = int(input())
se = int(input())     
a=Account(accno,nm,code,debit,credit)   
a.generateStatement(se)      
