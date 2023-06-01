trails=input()
steps=trails.split()

allSteps=''
for i in range(1,len(steps),2):
    allSteps+=steps[i]*int(steps[i+1])

direc=0
northSteps=[0]
eastSteps=[0]
for step in allSteps:
    if step in 'RL':
        direc+=1 if step=='R' else -1
    else:
        if direc%2==0:
            di=1 if direc%4==0 else -1
            northSteps.append(northSteps[-1]+di)
        else:
            di=1 if (direc-1)%4==0 else -1
            eastSteps.append(eastSteps[-1]+di)

area=(max(northSteps)-min(northSteps))*(max(eastSteps)-min(eastSteps))
print(allSteps.count('F'),area)