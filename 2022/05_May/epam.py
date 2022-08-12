from sys import stdin
lines=stdin.read().splitlines()

def canBeArranged(aGroup):
    aGroup.sort()
    for i,j,k in zip(aGroup[0],aGroup[1],aGroup[2]):
        if not (i<=j<=k):
            return 'no'
    return 'yes'

t=int(lines[0])
for i in range(t):
    aGroup=[]
    for j in range(i*3+1,i*3+4):
        row=[]
        line=lines[j].split()
        for k in line:
            row.append(int(k))
        aGroup.append(row)
    print(canBeArranged(aGroup))

