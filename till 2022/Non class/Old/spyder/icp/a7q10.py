from numpy import *
n=int(input('enter the size of array '))
arr=array([])
print('enter the value in array')
for i in range(n):
    arr=append(arr,int(input()))

arr.sort()
print(arr)
temp=arr[0]
arr1=array([temp])
for i in range(n):
    if temp!=arr[i]:
        temp=arr[i]
        arr1=append(arr1,temp)
print(arr1)