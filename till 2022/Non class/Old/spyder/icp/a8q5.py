m=int(input('enter no. of student '))
n=int(input('enter no. of tests '))
mat=[[0 for i in range(n+1)]for i in range(m+1)]
avtm=[0 for i in range(n)]
for i in range(0,m):
    print('enter the marks of student no.',i+1)
    avsm=0
    for j in range(0,n):
        marks=int(input())
        mat[i][j]=marks
        avtm[j]=avtm[j]+marks
        avsm+=marks
    mat[i][n]=avsm/n
    
for i in range(n):
    mat[m][i]="{:.2f}".format(avtm[i]/m)

for i in range(m+1):
    for j in range(n+1):
        print(mat[i][j],end='\t')
    print()
        