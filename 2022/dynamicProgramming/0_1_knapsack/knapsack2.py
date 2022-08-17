## knapsack dynamic programming using top down approach

weight=[7,9,5,12,14,6,12]
profits=[3,4,2,6,7,3,5]
maxWeight=15

n=len(weight)
array=[[None for _ in range(maxWeight+1)] for _ in weight+[1]] 
for i in range(len(weight)+1):
    for j in range(maxWeight+1):
        if i==0 or j==0: array[i][j]=0 # we are filling with zero for base condition


for i in range(1,len(weight)+1): # n : no of items          (rows)
    for j in range(1,maxWeight+1): # W : maximum weight     (columns)
        if weight[i-1]<=j:
            array[i][j]=max(profits[i-1]+array[i-1][j-weight[i-1]],array[i-1][j])
        else:
            array[i][j]=array[i-1][j]

print(array[-1][-1])