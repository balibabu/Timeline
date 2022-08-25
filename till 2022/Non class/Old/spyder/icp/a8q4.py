mat1=[[4],[7,6,5],[6,7]]
#mat2=[[0] for i in range(len(mat1))]
mat2=[]
for i in range(len(mat1)):
    mat2.append([0 for i in range(len(mat1[i]))])
print('matrix 1 is')
for i in range(len(mat1)):
    for j in range(len(mat1[i])):
        print(mat1[i][j],end=' ')
    print()
    
for i in range(len(mat1)):
    for j in range(len(mat1[i])):
        mat2[i][j]=mat1[i][j]
print('\nmatrix 2 is')
for i in range(len(mat1)):
    for j in range(len(mat1[i])):
        print(mat2[i][j],end=' ')
    print()
    
