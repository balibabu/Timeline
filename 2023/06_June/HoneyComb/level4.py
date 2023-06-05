class Hive:

    def __init__(self,hive):
        self.hive=hive
        self.rows=len(hive)
        self.cols=len(hive[0])

    def getNeibors(self,i,j):
        neibors=[(i-1,j-1),(i+1,j-1),(i-1,j+1),(i+1,j+1),(i,j-2),(i,j+2)]
        i=0
        while i<len(neibors):
            x,y=neibors[i]
            if x<0 or x>=self.rows or y<0 or y>=self.cols:#checking validity
                neibors.pop(i)
            else:
                i+=1
        return neibors

    def freeNeibors(self,i,j):
        neibors=self.getNeibors(i,j)
        fNeibors=[]
        for x,y in neibors:
            if self.hive[x][y]=='O': fNeibors.append((x,y))
        return fNeibors

    def getEdges(self):
        edges=[]
        for i in range(0,self.cols,2):
            edges.append((0,i))
            edges.append((self.rows-1,i+1))
        for i in range(1,self.rows-1):
            edges.append((i,int(i%2==1)))
            edges.append((i,self.cols-int(i%2==0)-1))
        return edges
                
def escape(hive,wasp,edges,neibors=[]):
    if wasp in edges: return True
    nebors=hive.freeNeibors(wasp[0],wasp[1])
    new_nebors=[]
    for nebor in nebors:
        if nebor not in neibors: 
            new_nebors.append(nebor)
    
    for nebor in new_nebors:
        if escape(hive,nebor,edges,neibors+new_nebors):
            return True
    return False
        
def getPosition(matrix):
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j]=='W':
                return (i,j)
    return None


data=open('level4/level4_5.in')
lines=data.read().split('\n\n')

str1=''
for i in range(int(lines[0])):
    que1=lines[i+1]
    mat=que1.strip().split('\n')
    hive=Hive(mat)
    wasp=getPosition(mat)
    edges=hive.getEdges()
    trap='FREE' if escape(hive, wasp, edges) else 'TRAPPED'
    str1+='%s\n'%(trap)

file=open('output.txt','w')
file.write(str1.strip())
file.close()