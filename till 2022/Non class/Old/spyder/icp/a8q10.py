from random import *
def checkrow(arr):
    r=0
    sm=sum(matrix[0])
    for i in range(4):
        if sm<sum(matrix[i]):
            sm=sum(matrix[i])
            r=i
    return r
def checkcol(arr):
    lst=[0 for i in range(4)]
    for i in range(4):
        for j in range(4):
            lst[j]+=arr[i][j]
    for i in range(4):
        if max(lst)==lst[i]:
            return i
        
        
matrix=[[0 for i in range(4)] for i in range(4)]
for i in range(4):
    for j in range(4):
        matrix[i][j]=int(random()*10)%2

for i in range(4):
    for j in range(4):
        print(matrix[i][j],end='\t')
    print()
print()

print('The largest row index:',checkrow(matrix))
print('The largest column index:',checkcol(matrix))
