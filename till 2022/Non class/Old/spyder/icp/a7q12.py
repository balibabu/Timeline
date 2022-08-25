from numpy import *
arr=array([])
for i in range(5):
    arr=append(arr,int(input()))
print(arr)
for i in range(5):
    for j in range(i,5):
        if arr[i]>arr[j]:
            arr[i],arr[j]=arr[j],arr[i]
            
print(arr)