def canEscape(mat):
    i,j=getPosition(mat)
    check=0
    for ii in range(min(i,j)):
        if mat[i-ii-1][j-ii-1]=='X':
            check=1
            break
    if check==0: return True
    
    check=0
    for ii in range(min(len(mat)-i,len(mat[0])-j)):
        if mat[i+ii][j+ii]=='X':
            check=1
            break
    if check==0: return True

    check=0
    for ii in range(min(i,len(mat[0])-j-1)):
        if mat[i-ii-1][j+ii+1]=='X':
            check=1
            break
    if check==0: return True

    check=0
    for ii in range(1,min(len(mat)-i,j)):
        if mat[i+ii][j-ii]=='X':
            check=1
            break
    if check==0: return True

    check=0
    for ii in range(2,j+1,2):
        if mat[i][j-ii]=='X':
            check=1
            break
    if check==0: return True

    check=0
    for ii in range(j+2,len(mat[0]),2):
        if mat[i][ii]=='X':
            check=1
            break
    if check==0: return True
    
    return False

def getPosition(matrix):
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j]=='W':
                return (i,j)
    return None
    
def getMatrix(que1):
    matrix=que1.split('\n')
    return matrix

data=open('level3/level3_5.in')
lines=data.read().split('\n\n')

str1=''
for i in range(int(lines[0])):
    que1=lines[i+1]
    mat=que1.split('\n')
    trap='FREE' if canEscape(mat) else 'TRAPPED'
    str1+='%s\n'%(trap)

file=open('output.txt','w')
file.write(str1)
file.close()