def getPosition(matrix):
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j]=='W':
                return (i,j)
    return None

def uniDirEscape(mat,xstep,ystep):
    i,j=getPosition(mat)
    while True:
        i,j=i+xstep,j+ystep
        if i<0 or i>=len(mat) or j<0 or j>=len(mat[0]): break
        if mat[i][j]=='X': 
            return False
    return True

def canEscape(mat):
    if uniDirEscape(mat,-1,-1): return True
    if uniDirEscape(mat,1,-1): return True
    if uniDirEscape(mat,-1,1): return True
    if uniDirEscape(mat,1,1): return True
    if uniDirEscape(mat,0,-2): return True
    if uniDirEscape(mat,0,2): return True
    return False

data=open('level3_5.in')
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