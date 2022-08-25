from numpy import *
n=int(input('enter the size of array '))
arr=array([])
print('enter the value in array')
for i in range(n):
    arr=append(arr,float(input()))
print('the entered array is\nnote: indexing starts from zero')
for i in arr:
    print(i, end='  ')

m=int(input('enter the postion to insert at '))
x=float(input('enter the value '))
for i in range(m,n):
    temp=arr[i]
    arr[i]=x
    x=temp
arr=append(arr,x)
print('inserted')
for i in arr:
    print(i, end='  ')