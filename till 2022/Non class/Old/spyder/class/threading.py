from threading import *
from time import sleep
class hello(Thread):
    def run(self):
        for i in range(5):
            print('hello')
            sleep(0.5)
            
class hi(Thread):
    def run(self):
        for i in range(5):
            print('hi')
            sleep(0.5)
t1=hello()
t2=hi()
t1.start()
sleep(0.2)
t2.start()
t1.join()
t2.join()
print('bye')