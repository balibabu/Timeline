def sumColumn(matrix,a):
    sum=0
    for i in range(3):
        sum+=matrix[i][a]
    return sum

matrix=[[0 for j in range(4)] for i in range(3)]
for i in range(3):
    print('enter values for row ',i+1)
    for j in range(4):
        matrix[i][j]=int(input())
for i in range(3):
    for j in range(4):
        print(matrix[i][j],end=' ')
    print()
for i in range(4):
    sum=sumColumn(matrix,i)
    print('Sum of the elements at column {} is {}'.format(i+1,sum))