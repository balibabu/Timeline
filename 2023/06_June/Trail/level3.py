def getDistance(steps):
    return steps.count('F')
def getSteps(data):
    steps=''
    for i in range(1,len(data),2):
        steps+=data[i]*int(data[i+1])
    return steps
def getMaxArea(xyRanges):
    min_x=xyRanges[0][0]
    min_y=xyRanges[0][1]
    max_x=xyRanges[1][0]
    max_y=xyRanges[1][1]
    return (max_x-min_x)*(max_y-min_y)
def getXYranges(edges):
    xyRanges=[]
    x_points=[x for x,_ in edges]
    y_points=[y for _,y in edges]
    max_x=max(x_points)
    min_x=min(x_points)
    max_y=max(y_points)
    min_y=min(y_points)
    xyRanges.append((min_x,min_y))
    xyRanges.append((max_x,max_y))
    return xyRanges
def getEdges(steps):
    direc=0
    northSteps=[0]
    eastSteps=[0]
    edgePoints=[]
    for step in steps:
        if step in 'RL':
            direc+=1 if step=='R' else -1
        else:
            edgePoints.append((eastSteps[-1],northSteps[-1]))
            if direc%2==0:
                di=1 if direc%4==0 else -1
                northSteps.append(northSteps[-1]+di)
            else:
                di=1 if (direc-1)%4==0 else -1
                eastSteps.append(eastSteps[-1]+di)
    return edgePoints
def getCrossSection(edges,xyRanges):
    xMin,yMin=xyRanges[0]
    xMax,yMax=xyRanges[1]
    csa=[]
    for x in range(xMin,xMax+1):
        aCsa=[]
        for y in range(yMin,yMax+1):
            if (x,y) in edges:
                aCsa.append((x,y))
        csa.append(aCsa)
    return csa 
def getSegments(edges,csa):
    segments=[]
    for i in range(len(csa)-1):
        x=edges.index(csa[i])
        if csa[i+1] in [edges[x-1],edges[(x+1)%len(edges)]]:
            segments.append([csa[i],csa[i+1]])
    return segments
def xorSegments(window,segments):
    for segment in segments:
        if segment in window:
            window.remove(segment)
        elif ([segment[1],segment[0]]) in window:
            window.remove([segment[1],segment[0]])
        else:
            window.append(segment)
def moveWindow(window):
    for i in range(len(window)):
        [(x1,y1),(x2,y2)]=window[i]
        window[i]=[(x1+1,y1),(x2+1,y2)]
def getArea(edges,xyRanges):
    csa=getCrossSection(edges,xyRanges)
    window=[]
    area=0
    for cs in csa:
        xorSegments(window,getSegments(edges,cs))
        # print(window)
        moveWindow(window)
        area+=len(window)
    return area 
trails=input()
data=trails.split()
steps=getSteps(data)
edges=getEdges(steps)
xyRanges=getXYranges(edges)

d=getDistance(steps)
ma=getMaxArea(xyRanges)
a=getArea(edges,xyRanges)

print(d,ma,a)