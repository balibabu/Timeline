#from numpy import *
m=int(input('enter no. of rows '))
n=int(input('enter no. of columns '))
arr=[[0 for j in range(n)]for i in range (m)]

for i in range(m):
    print('enter values for row ',i+1)
    for j in range(n):
        arr[i][j]=int(input())

for i in range(m):
    for j in range(n):
        print(arr[i][j],end=' ')
    print()