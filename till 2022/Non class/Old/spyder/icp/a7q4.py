def lowest(arr):
    a=arr[0]
    for i in range(10):
        if arr[i]<a:
            a=arr[i]
    print('lowest value is ',a)
from numpy import *
arr=array([])
print('enter value in the array')
for i in range(10):
    arr=append(arr,float(input()))
lowest(arr)

