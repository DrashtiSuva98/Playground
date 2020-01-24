import math

class Circle:

    def __init__(self, radius):
        self.__radius = radius

    def setRadius(self, radius):
        self.__radius = radius

    def getRadius(self):
        return self.__radius

    def area(self):
        self.d= math.pi * self.__radius ** 2
        return self.d  

    def __add__(self, another_circle):
        return Circle( self.__radius + another_circle.__radius )    
m = int(input())
c1 = Circle(m)
print(c1.getRadius())
f = c1.area()
#print(f)

n = int(input())
c2 = Circle(n)
print(c2.getRadius())
d = c2.area()
#print(d)

c3 = c1 + c2 # This became possible because we have overloaded + operator by adding a    method named __add__
print("Radius of Two Circle: {}".format(c3.getRadius()))
print("Area:",f+d)

