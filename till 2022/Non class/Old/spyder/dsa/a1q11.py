from math import *
class point:
    def setpoint(self,x,y):
        self.x=x
        self.y=y
    def findDistance(point1,point2):
        return sqrt((point1.x-point2.x)**2+(point1.y-point2.y)**2)
    
p1=point()
p2=point()
p1.setpoint(1,3)
p2.setpoint(1,1)
print(point.findDistance(p1,p2))