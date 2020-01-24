class item:
    def price(self,p):
        return p

class Customer:
    def product(self,pro,qty):
        return qty

class Bill(item,Customer):
    def tot(self,p,pro,q):
        tot=self.price(p) * self.product(pro,q)
        print('Total Price is: {}'.format(tot))

b= Bill()
n = input()
p=int(input())
qty = int(input())
b.tot(p,n,qty)
   