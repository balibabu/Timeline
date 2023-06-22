def isPointInsideRectangle(point,rectangle):
    x,y=point 
    x1,y1,x2,y2=rectangle
    if not (x1<x<x2 or x1>x>x2): return False
    if not (y1<y<y2 or y1>y>y2): return False
    return True

data=open('level1/level1-4.in')
lines=data.readlines()
rectCo=list(map(float,lines[0].split(',')))
nofPoints=int(lines[1])
points=[tuple(map(float,point.split(','))) for point in lines[2:2+nofPoints]]
c=0
for i in range(nofPoints):
    if isPointInsideRectangle(points[i],rectCo):
        c+=1
print(c)