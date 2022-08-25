from numpy import *
arr=array([])
print('enter the values in array')
for i in range(5):
    arr=append(arr,int(input()))
print(arr)
a=True
while a:
    a=False
    for i in range(4):
        if arr[i]>arr[i+1]:
            arr[i],arr[i+1]=arr[i+1],arr[i]
            a=True

print(arr)