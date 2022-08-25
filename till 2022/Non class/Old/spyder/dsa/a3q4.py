class box:
    def getData(self,a,b):
        self.a=a
        self.b=b
    def display(self):
        print(self.a,self.b)

obj1=box()
obj1.getData('bali','babu')
obj1.display()
obj2=box()
obj2.getData(6,'abc')
obj2.display()