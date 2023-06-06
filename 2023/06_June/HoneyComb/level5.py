class Hive:

    def __init__(self,hive):
        self.hive=hive
        self.rows=len(hive)
        self.cols=len(hive[0])
    
    def getWaspPosition(self):
        for i in range(self.rows):
            for j in range(self.cols):
                if self.hive[i][j]=='W':
                    return (i,j)
        return None

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
                
def method1(mat,neibors):
    for x,y in neibors:
        chars=[i for i in mat[x]]
        chars[y]='X'
        mat[x]=''.join(chars)

def method2(mat,hive,wasp,edges,barrier):
    freeNebors=hive.freeNeibors(*wasp)
    blocker=[]
    while escape(hive,wasp,edges,blocker) and barrier!=0:
        barrier-=1
        for point in blocker:
            fN=hive.freeNeibors(*point)
            nebors=set(fN).difference(set(freeNebors))
            if len(nebors)==1:
                method1(mat,[point])
                break
        blocker=[]

def applyBarrier(mat,barrier):
    hive=Hive(mat)
    wasp=hive.getWaspPosition()
    fNebors=hive.freeNeibors(*wasp)

    if len(fNebors)==barrier:
        method1(mat,fNebors)
        return

    edges=hive.getEdges()
    edgeNeibors=[]
    for point in fNebors:
        if point in edges:
            edgeNeibors.append(point)
    barrier-=len(edgeNeibors)
    method1(mat,edgeNeibors)
    if barrier==0: return
    method2(mat,hive,wasp,edges,barrier)

def escape(hive,wasp,edges,blocker,neibors=[]):
    if wasp in edges: return True
    nebors=hive.freeNeibors(*wasp)
    new_nebors=[]
    for nebor in nebors:
        if nebor not in neibors: 
            new_nebors.append(nebor)
    
    for nebor in new_nebors:
        if escape(hive,nebor,edges,blocker,neibors+new_nebors):
            blocker.insert(0,nebor)
            return True
    return False
        
data=open('level5/level5_example.in')
lines=data.read().split('\n\n')

str1=lines[0]+'\n\n'
for i in range(int(lines[0])):
    # print(i+1)
    que1=lines[i+1]
    mat=que1.strip().split('\n')
    noBariers=int(mat[0])
    mat=mat[1:]
    applyBarrier(mat,noBariers)
    for line in mat:
        str1+=line+'\n'
    str1+='\n'

file=open('output.txt','w')
file.write(str1.strip())
file.close()