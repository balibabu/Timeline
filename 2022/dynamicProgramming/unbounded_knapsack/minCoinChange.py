# the main problem is with the initialization because its ini. is different than others
# here first 2 rows and 1st column are initialized 
# if we can not make the change with given coins then we put infinity
def minCoinChangeTD(coins,change):
    import sys
    table=[[-1 for _ in range(change+1)] for _ in coins+[1]]

    # filling the 1st column first becoz of its table(see screenshot of its table)
    for i in range(len(table)):
        table[i][0]=0 #minimum no of coin req. for sum=0 is 0 except when we have no coins
    
    for i in range(len(table[0])):
        table[0][i]=sys.maxsize-1   # for first row its infinity
    
    for i in range(1,len(table[0])):    # for 2nd row excluding 1st element
        table[1][i]=i//coins[0] if i%coins[0]==0 else sys.maxsize-1 # here coins[0] means first coin we are using

    for i in range(2,len(table)):
        for j in range(1,len(table[0])):
            if coins[i-1]<=j:
                table[i][j]=min(table[i][j-coins[i-1]]+1,table[i-1][j])
            else:
                table[i][j]=table[i-1][j]
    # printer(table)
    return table[-1][-1]


def main():
    coins=[1,2,3]
    change=10
    minCoinChangeTD(coins,change)

if __name__ == '__main__':
    main()