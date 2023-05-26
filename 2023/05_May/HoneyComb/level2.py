def getPosition(matrix):
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j]=='W':
                return (i,j)
    return None

def countSpace(matrix):
    count=0
    i,j=getPosition(matrix)
    list1=[(i-1,j-1),(i-1,j+1),(i,j-2),(i,j+2),(i+1,j-1),(i+1,j+1)]
    for i,j in list1:
        try:
            if i>=0 and j>=0 and matrix[i][j]=='O': count+=1
        except:
            pass
    return count 
    
def getMatrix(que1):
    matrix=que1.split('\n')
    return matrix

data=open('level2/level2_example.in')
lines=data.read().split('\n\n')

str1=''
for i in range(int(lines[0])):
    que1=lines[i+1]
    mat=getMatrix(que1)
    str1+='%d\n'%(countSpace(mat))

file=open('output.txt','w')
file.write(str1)
file.close()