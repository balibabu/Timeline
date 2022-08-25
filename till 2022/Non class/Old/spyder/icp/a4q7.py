from random import *
c=0
n=int(input('enter no. of trials'))
for i in range(n):
    x=randint(0,10)/10
    c+=x
    print(x)
print("average is ",c/n)