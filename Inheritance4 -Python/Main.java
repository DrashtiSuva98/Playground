
class base:
    def cal(self,p,y,r):
        return (p*y*r)/100

class child(base):
    def disp(self,p,y,r):
        c=self.cal(p,y,r)
        print('Principle amount: {}'.format(p))
        print('No.Of.Years: {}'.format(y))
        print('Rate of interest: {}'.format(r))
        print('Simple Interest: {}'.format(float(c)))

p =int(input())
y=int(input())
r=int(input())
c =child()
c.disp(p,y,r)