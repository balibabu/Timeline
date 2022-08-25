class rectangle:
    width=1
    height=1
    def __init__(self,width,height):
        self.width=width
        self.height=height
    def getarea(self):
        area=self.width*self.height
        return area
    def getperimeter(self):
        peri=2*(self.width+self.height)
        return peri
    
rect1=rectangle(4,40)
rect2=rectangle(3.5,35.9)
print('for first rectangle')
print("width: {}\t height: {}".format(rect1.width,rect1.height))
print("area: {}\t perimeter: {}".format(rect1.getarea(),rect1.getperimeter()))
print('\nfor second rectangle')
print("width: {}\t height: {}".format(rect2.width,rect2.height))
print("area: {:.2f}\t perimeter: {}".format(rect2.getarea(),rect2.getperimeter()))
