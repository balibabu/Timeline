from datetime import *
from random import *
class StopWatch:
    def __init__(self):
        self.startTime=datetime.now().microsecond
    def start(self):
        self.startTime=datetime.now().microsecond
    def stop(self):
        self.endTime=datetime.now().microsecond
    def getElapsedTime(self):
        return self.endTime-self.startTime
    
work=StopWatch()
arr=[0 for i in range(100)]
for i in range(100):
    arr[i]=int(random()*100)
print(arr)
print('\n')
work.start()
a=True
while a:
    a=False
    for i in range(99):
        if arr[i]>arr[i+1]:
            arr[i],arr[i+1]=arr[i+1],arr[i]
            a=True
work.stop()
print(arr)
print('\n')
print('time taken in microsecond to sort only is \n',work.getElapsedTime())
