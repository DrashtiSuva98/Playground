import math
class Compute:
    def area(self,s,l,b):
        print('Area of Circle = {}'.format(math.ceil(3.142*s*s)))
        print('Area of Rectangle = {}'.format(l*b))

r=int(input())
l=int(input())
b=int(input())
c=Compute()
c.area(r,l,b)