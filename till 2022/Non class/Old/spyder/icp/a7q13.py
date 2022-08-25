from numpy import *
arr=array([])
n=int(input('enter the size of array'))
print('enter value in array')
for i in range(n):
    arr=append(arr,int(input()))
    
for i in range(n-1):
    if arr[i]>arr[i+1]:
        print('not sorted')
        break
else:
    print('sorted')