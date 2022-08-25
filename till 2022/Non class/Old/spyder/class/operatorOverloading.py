class student:
    def __init__(self,m1,m2):
        self.m1=m1
        self.m2=m2
    def __add__(a,b):
        x=a.m1+b.m1
        y=a.m2+b.m2
        s3=student(x,y)
        return s3
    def  __gt__(ob1,ob2):
        if (ob1.m1+ob1.m2)>(ob2.m1+ob2.m2):
            return True
        else:
            return False
    def __str__(self):
        return '{}  {}'.format(self.m1,self.m2)

s1=student(55,66)
s2=student(78, 76)
s3=s1+s2
print(s3)
if s1>s2:
    print('s1 wins')
else:
    print('s2 wins')
print(s1)
    