from numpy import *
n=int(input('enter the size array '))
arr=array([])
print('enter the values in array')
for i in range(n):
    arr=append(arr,float(input()))
s=sum(arr)
av=s/n
sm=0
for i in arr:
    sm+=(i-av)**2
dev=sqrt(sm/(n-1))
print('the mean is ',av)
print('deviation is ',dev)
