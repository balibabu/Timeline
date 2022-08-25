from abc import ABC,abstractclassmethod

class shape(ABC):
    @abstractclassmethod
    def area(self):
        pass
class square(shape):
    def __init__(self,length):
        self.length=length
    def area(self):
        print('area of square is ',self.length**2)
class triangle(shape):
    def __init__(self,base,height):
        self.base=base
        self.height=height
    def area(self):
        print('area of triangle is ',self.base*self.height)

        
sq=square(4)
tri=triangle(2, 5)
sq.area()
tri.area()

        