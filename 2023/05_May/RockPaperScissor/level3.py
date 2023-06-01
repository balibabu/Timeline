def getStyles(terms):
    rock=int(terms[0][:-1])
    paper=int(terms[1][:-1])
    scissor=int(terms[2][:-1])
    str1=''
    if paper>=rock:
        str1='RP'*rock+'P'*(paper-rock)+'S'*scissor
    else:
        r=rock//3
        r2=rock%3
        str1='RRRP'*r
        if r2==0: str1+='P'*(paper-r)
        elif r2==1: str1+='R'+'P'*(paper-r)
        else: str1+='RPR'+'P'*(paper-r-1)
        str1+='S'*scissor
    return str1
        
data=open('Inputs/level3_5.in')
lines=data.readlines()
numOfInputs=int(lines[0].split()[0])

output=''
for i in range(1,len(lines)):
    terms=lines[i].split()
    output+=getStyles(terms)+'\n'
file1=open('output.txt','w')
file1.write(output)
file1.close()
