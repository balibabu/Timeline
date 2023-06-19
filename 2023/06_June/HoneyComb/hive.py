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

    def blockedNeibors(self,i,j):
        neibors=self.getNeibors(i,j)
        fNeibors=[]
        for x,y in neibors:
            if self.hive[x][y]=='X': fNeibors.append((x,y))
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