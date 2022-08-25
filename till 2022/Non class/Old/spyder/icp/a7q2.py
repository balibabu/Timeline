from numpy import *
n=array([0])
for i in range(100):
    n=append(n,[0])
print('enter zero or more than 100 to stop') 
x=int(input())
while x>0 and x<=100:
    n[x]=n[x]+1
    x=int(input())
     
for i in range(101):
    if n[i]==1:
        print('{} occurs {} time'.format(i,n[i]))
    elif n[i]>1:
        print('{} occurs {} times'.format(i,n[i]))
