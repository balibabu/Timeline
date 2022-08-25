from math import *
class quadraticequation:
    a=0
    b=0
    c=0
    def __init__(self,a,b,c):
        self.a=a
        self.b=b
        self.c=c
    def getdescriminant(self):
        if self.b**2-4*self.a*self.c>=0:
            return 1
        return 0
    def getroot1(self):
        return (sqrt(self.b**2-4*self.a*self.c)-self.b)/(2*self.a)
    def getroot2(self):
        return (-sqrt(self.b**2-4*self.a*self.c)-self.b)/(2*self.a)

print('enter the value of a,b,c')
a=int(input())
b=int(input())
c=int(input())
eq1=quadraticequation(a, b, c)
if eq1.getdescriminant()==1:
    print('the two roots of equation {}x^2+{}x+{} are:'.format(a,b,c))
    print(eq1.getroot1(),eq1.getroot2())
else:
    print('the equation has no roots')