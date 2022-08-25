class Complex:
    def setData(self,real,imag):
        self.real=real
        self.imag=imag
    def display(self):
        print('{}+{}i'.format(self.real,self.imag))
    def add(self,num1,num2):
        self.real=num1.real+num2.real
        self.imag=num1.imag+num2.imag

num1=Complex()
num2=Complex()
num3=Complex()
num1.setData(5,6)
num2.setData(3,2)
print('first complex no. is')
num1.display()
print('second complex no. is')
num2.display()
num3.add(num1,num2)
print('and their sum is')
num3.display()
    