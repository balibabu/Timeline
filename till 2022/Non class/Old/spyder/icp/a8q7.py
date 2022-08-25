from prnt import *
matrix=[[1,2,3],[1,4,9],[1,8,27]]
print('original martix is')
prnt(matrix)
for i in range(len(matrix)):
    for j in range(i,len(matrix[i])):
        matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]

print('transpose matrix')
prnt(matrix)