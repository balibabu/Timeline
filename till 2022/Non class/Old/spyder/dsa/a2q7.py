from abc import ABC,abstractclassmethod
class interface(ABC):
    @abstractclassmethod
    def display(self):
        pass
    @abstractclassmethod
    def count(self):
        pass

class implement(interface):
    maxcount=0
    def __init__(self,name):
        self.name=name
    def count(self):
        for i in self.name:
            if ord(i)>=65 and ord(i)<=122:
                self.maxcount+=1
    def display(self):
        print('NAME:',self.name)
        print('no. of char.:',self.maxcount)

person=implement('bali babu chauhan')
person.count()
person.display()