from numpy import *
def sec(arr):
    first=arr[0]
    second=arr[1]
    for i in arr  :
        if first<i:
            second=first
            first=i
        elif second<i:
            second=i
    print('second largest no. is ', second, first)
    
n=int(input('enter the size of array '))
arr=array([])
for i in range(n):
    arr=append(arr,float(input()))
for i in range(n):
    print(arr[i])
sec(arr)    