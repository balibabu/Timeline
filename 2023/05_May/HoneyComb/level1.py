data=open('level1/level1_1.in')
lines=data.readlines()
num=0
for line in lines:
    num+=len(line)//2
file=open('output.txt','w')
file.write(str(num))
file.close()