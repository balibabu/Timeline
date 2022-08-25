def move(n,t1,t2,t3):
    if n==1:
        print('Disk 1 from ',t1,' to ',t3)
    else:
        move(n-1,t1,t3,t2)
        print('Disk {} from {} to {}'.format(n,t1,t3))
        move(n-1,t2,t1,t3)


n=int(input('enter no. of beads '))
move(n,'A','B','C')