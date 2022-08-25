def smd(mat):
    s=0
    for i in range(4):
        s+=mat[i][i]
    return s
matrix=[[0 for j in range(4)] for i in range(4)]

for i in range(4):
    print('enter values for row ',i+1)
    for j in range(4):
        matrix[i][j]=int(input())

for i in range(4):
    for j in range(4):
        print(matrix[i][j],end=' ')
    print()
    
print('sum of diagonal is ',smd(matrix))