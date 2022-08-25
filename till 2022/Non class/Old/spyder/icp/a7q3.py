from numpy import *
arr=array([])
print('enter value in array')
for i in range(10):
    arr=append(arr,int(input()))

x=int(input('enter a nuber to be searched'))
c=0
for i in range(10):
    if arr[i]==x:
        c+=1
if c!=0:
    print('occurence of {} is '.format(x),c)
else:
    print('not found')