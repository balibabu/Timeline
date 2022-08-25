from myFun import *
mat1=[[0 for i in range(3)]for i in range(3)]
mat2=[[0 for i in range(3)]for i in range(3)]
mat3=[[0 for i in range(3)]for i in range(3)]
mat1=enter(mat1)
mat2=enter(mat2)
for i in range(3):
    for j in range(3):
        for k in range(3):
            mat3[i][j]+=mat1[i][k]*mat2[k][j]

display(mat1)
display(mat2)
display(mat3)

