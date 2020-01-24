
class Rectangle():
	def __init__(self,length,breadth):
		self.length = length
		self.breadth = breadth
	def area(self):
		print('Area of Rectangle: {}'.format(self.length*self.breadth))
        
class Square(Rectangle):
	def __init__(self,side):
		self.side = side
		Rectangle.__init__(self,side,side)
	def area(self):
   		print('Area of Square: {}'.format(self.side*self.side))

l = int(input())
b = int(input())
s = int(input())
s = Square(s)
r = Rectangle(l,b)
r.area()
s.area()