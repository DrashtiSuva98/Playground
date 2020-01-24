class Compute:
    def calculate(self,a = None,b=None,c=None):
        if a != None and b != None and c != None:
            return (a**b)**c
        elif a != None and b != None:        
            return a % b
        

a=int(input())
b=int(input())
c=int(input())
ca =Compute()
print('Modulus = {}'.format(ca.calculate(a,b)))
print('Power = {}'.format(ca.calculate(a,b,c)))
