## knapsack dynamic programming using recursion and memoization


def knapsack(weight:list,value:list,W:int,n:int)->int:
    global array,c
    c+=1
    if n==0 or W==0:    # base condition: minimum valid input
        return 0

    if array[W][n]!=-1:
        return array[W][n]

    if weight[n-1]<=W:
        array[W][n]=max(value[n-1]+knapsack(weight,value,W-weight[n-1],n-1),knapsack(weight,value,W,n-1))
        return array[W][n]
    else:
        array[W][n]=knapsack(weight,value,W,n-1)
        return array[W][n]
    

# weight=[7,9,5,12,14,6,12]
# profits=[3,4,2,6,7,3,5]
# maxWeight=15

# c=0
# array=[[-1 for _ in range(len(weight)+1)] for _ in range(maxWeight+1)]
# print(knapsack(weight,profits,maxWeight,len(weight)))
# print('no. of iterations',c)