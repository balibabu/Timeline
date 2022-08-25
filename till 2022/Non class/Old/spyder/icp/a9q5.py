class fan:
    speed=1
    on=False
    radius=5
    color='blue'
    def setspeed(self,speed):
        self.speed=speed
    def seton(self,on):
        self.on=on
    def setradius(self,radius):
        self.radius=radius
    def setcolor(self,color):
        self.color=color
    def toString(self):
        
        if self.on==True:
            spd='slow'
            if self.speed==2:
                spd='medium'
            if self.speed==3:
                spd='fast'
            return 'speed='+spd+'  radius='+str(self.radius)+'  color:'+str(self.color)
        else:
            return 'fan is off.'+'  radius='+str(self.radius)+'  color:'+str(self.color)
fan1=fan()
fan2=fan()
fan1.setspeed(3)
fan1.setradius(10)
fan1.setcolor('yellow')
fan1.seton(True)
print('for first fan info')
print(fan1.toString(),'\n')
fan2.setspeed(2)
print('\nfor second fan info')
print(fan2.toString())
