class student:
    def getdata(self):
        self.name=input('enter your name ')
        while True:
            try:
                self.mark=int(input('enter your mark <=100  '))
                if self.mark>100 or self.mark<0:
                    raise Exception('invalid mark...try again..')
            except Exception as e:
                print(e)
            else:
                break
    def display(self):
        print('name:',self.name)
        print('mark:',self.mark)

s1=student()
s1.getdata()
s1.display()