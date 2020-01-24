class Faculty:
    def get(self):
        global sal
        #self.basesal=basesal
        basesal = int(input())
        sal=basesal
        
class CSE(Faculty):
    def cse(self):
        bonus = sal + 3000
        return bonus   

class IT(Faculty):
    def it(self):
        bonus = sal + 5000
        return bonus   

class ECE(Faculty):
    def ece(self):
        bonus = sal + 4500
        return bonus   

c=CSE()
c.get()
i=IT()
e= ECE()
print('Base Salary:  {}'.format(sal))
print('CSE Faculty:  {}'.format(c.cse()))
print('IT Faculty:  {}'.format(i.it()))
print('ECE Faculty:  {}'.format(e.ece()))