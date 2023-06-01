def isPointInside(point,edgePoints):
    x=max(edgePoints)[0]
    count=0
    for i in range(point[0],x+1):
        if (i,point[1]) in edgePoints:  count+=1
    if count==1: return True
    if count==0: return False

    y=max([y for _,y in edgePoints])
    count=0
    for i in range(point[1],y+1):
        if (point[0],i) in edgePoints:  count+=1
    return count%2==1

def calculateArea(edgePoints,enclosedPoints):
    points=edgePoints+enclosedPoints
    points.sort()
    area=0
    while len(points)!=0:
        x,y=points.pop()
        possibleAreaPoints=[(x+1,y),(x,y+1),(x+1,y+1),(x-1,y),(x,y-1),(x-1,y-1)]
        c=0
        for i in possibleAreaPoints:
            if i in points: c+=1
        if c>=3: area+=1
    return area

trails=input()
steps=trails.split()

allSteps=''
for i in range(1,len(steps),2):
    allSteps+=steps[i]*int(steps[i+1])

direc=0
northSteps=[0]
eastSteps=[0]
edgePoints=[]
for step in allSteps:
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

area=(max(northSteps)-min(northSteps))*(max(eastSteps)-min(eastSteps))

enclosedPoints=[]
for i in range(min(eastSteps),max(eastSteps)+1):
    for j in range(min(northSteps),max(northSteps)+1):
        if ((i,j) not in edgePoints) and isPointInside((i,j),edgePoints): enclosedPoints.append((i,j))


print(allSteps.count('F'),area,calculateArea(edgePoints,enclosedPoints))