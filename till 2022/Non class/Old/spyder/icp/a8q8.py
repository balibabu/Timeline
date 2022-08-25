from myFun import *
def relprime(a,b):
    for i in range(2,a+1):
        if b%i==0 and a%i==0:
            return False
    return True

n=int(input('enter the size of sq matrix '))
matrix=[[0 for i in range(n)] for i in range(n)]
matrix=enter(matrix)
display(matrix)
matrix2=[[True for i in range(n)] for i in range(n)]
for i in range(n):
        for j in range(n):
            matrix2[i][j]=relprime(matrix[i][j],matrix[j][i])

display(matrix2)