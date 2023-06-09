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
        neibors=[(i,j-2),(i-1,j-1),(i-1,j+1),(i,j+2),(i+1,j+1),(i+1,j-1)]
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
            edges.append((self.rows-1,i+(self.rows-1)%2))
        for i in range(1,self.rows-1):
            edges.append((i,int(i%2==1)))
            edges.append((i,self.cols-int(i%2==0)-1))
        return edges
                
def escape(hive,wasp,edges,paths,path=[],oldNebors=[]):
    if wasp in edges: 
        paths.append(path[:])
        return True

    nebors=hive.freeNeibors(*wasp)
    new_nebors=[x for x in nebors if x not in oldNebors]
    
    for nebor in new_nebors:
        path.append(nebor)
        escape(hive,nebor,edges,paths,path,oldNebors+new_nebors)
        path.pop()
    return False
        
def isUniquePath(path1,path2):
    for step in path1:
        if step in path2:
            return False
    return True

def getUniquePaths(paths):
    paths=sorted(paths, key=len)
    uniPaths=[paths[0]]
    for path in paths:
        c=0
        for uniPath in uniPaths:
            if not isUniquePath(uniPath,path): 
                c=1
                break
        if c==0:
            uniPaths.append(path)
    return uniPaths

def blockPath(mat,i,j):
    chars=[ch for ch in mat[i]]
    chars[j]='X'
    mat[i]=''.join(chars)

def getCommonPoint(path,paths):
    commonStep=None
    for step in path:
        c=0
        for path in paths:
            if step not in path:
                c=1
                break
        if c==0:
            commonStep=step 
            break
    return commonStep

def getGroup(mainPaths,paths):
    group=[]
    for mPath in mainPaths:
        group1=[]
        for path in paths:
            if getCommonPoint(mPath,[path])!=None:
                group1.append(path)
        group.append(group1)
    return group

def method1(mat,neibors):
    for x,y in neibors:
        chars=[i for i in mat[x]]
        chars[y]='X'
        mat[x]=''.join(chars)

def applyBarrier(mat,barrier):
    hive=Hive(mat)
    wasp=hive.getWaspPosition()
    fNebors=hive.freeNeibors(*wasp)
    edges=hive.getEdges()

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


    paths=[]
    escape(hive,wasp,edges,paths)
    uniPaths=getUniquePaths(paths)
    gp=getGroup(uniPaths,paths)

    for i in range(len(uniPaths)):
        point=getCommonPoint(uniPaths[i],gp[i])
        if point:
            blockPath(mat,*point)


data=open('level5/level5_3.in')
lines=data.read().split('\n\n')

str1=lines[0]+'\n\n'
for i in range(int(lines[0])):
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