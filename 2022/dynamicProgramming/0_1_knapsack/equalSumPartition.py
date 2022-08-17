from subSetSum import subsetSum2
def isEqualSumPart(array):
    sum1=sum(array)
    if sum1%2!=0:
        return False
    
    return subsetSum2(array,sum1//2)

# print(isEqualSumPart([12,3,4,5]))
# print(isEqualSumPart([12,3,4,15]))