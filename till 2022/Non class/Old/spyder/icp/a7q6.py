from numpy import *
arr=array([1,2,3,4,5,6,7])
for i in range(len(arr)//2):
    arr[i],arr[len(arr)-i-1]=arr[len(arr)-i-1],arr[i]
    
for i in arr:
    print(i,end='  ')