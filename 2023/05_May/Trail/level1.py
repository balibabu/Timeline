trails=input()
steps=trails.split()
distance=0
for i in range(1,len(steps),2):
    n=steps[i].count('F')
    distance+=int(n)*int(steps[i+1])
print(distance)