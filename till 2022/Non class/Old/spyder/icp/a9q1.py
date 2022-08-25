class student:
    name=''
    roll=0
    mark=0
    def setdata(self,name,roll,mark):
        self.name=name
        self.roll=roll
        self.mark=mark
    def display(self):
        print()
        print('name : ',self.name)
        print('roll no.:',self.roll)
        print('marks obtained : ',self.mark)
        print()

s1=student()
s2=student()
s3=student()
s1.setdata('raju',1,99)
s2.setdata('bishal',2,95)
s3.setdata('bali',3,88)
s1.display()
s2.display()
s3.display()