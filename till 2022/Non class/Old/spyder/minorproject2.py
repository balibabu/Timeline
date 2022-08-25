def data(p):
    print('enter coff 0 to terminate',end='')
    while True:
        n=int(input('enter cofficient of x '))
        if n==0:
            break
        p[0].append(n)
        p[1].append(int(input('enter power of x ')))
    return p
        
def display(p):
    pwr=[8304,185,178,179,8308,8309,8310,8311,8312,8313]
    for i in range(len(p[0])-1):
        if p[1][i]==0:
            print('{}'.format(p[0][i]),end='')
        elif p[1][i]==1:
            print('{}x'.format(p[0][i]),end='')
        else:
            print('{}x{}'.format(p[0][i],chr(pwr[p[1][i]])),end='')
        if p[0][i+1]>=0:
            print('+',end='')
    if p[1][len(p[0])-1]==0:
        print('{}'.format(p[0][len(p[0])-1]))
    elif p[1][len(p[0])-1]==1:
        print('{}x'.format(p[0][len(p[0])-1]))
    else:
        print('{}x{}'.format(p[0][len(p[0])-1],chr(pwr[p[1][len(p[0])-1]])))
    
def addpoli(add,poli1,poli2):
    add[0]=poli1[0]+poli2[0]
    add[1]=poli1[1]+poli2[1]
    for i in range(len(add[0])):
        for j in range(i,len(add[0])):
            if add[1][i]<add[1][j]:
                add[0][i],add[0][j]=add[0][j],add[0][i]
                add[1][i],add[1][j]=add[1][j],add[1][i]
    temp=[[],[]]
    temp[0].append(add[0][0])
    temp[1].append(add[1][0])
    c=0
    n=add[1][0]
    for i in range(1,len(add[0])):
        if n==add[1][i]:
            temp[0][c]+=add[0][i]
        else:
            c+=1
            n=add[1][i]
            temp[0].append(add[0][i])
            temp[1].append(add[1][i])
    return temp
    
poli1=[[],[]]
poli2=[[],[]]
add=[[],[]]
print('enter first polinomial')
poli1=data(poli1)
print('\nenter second polinomial')
poli2=data(poli2)
add=addpoli(add,poli1,poli2)
display(poli1)
display(poli2)
display(add)
