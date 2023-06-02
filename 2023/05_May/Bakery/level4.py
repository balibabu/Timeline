def find_combination(target, nums):
    def backtrack(start, curr_sum, path):
        if curr_sum == target:
            return path[:]
        if curr_sum > target or len(path) >= 4:
            return None

        for i in range(start, len(nums)):
            path.append(i)
            result = backtrack(i + 1, curr_sum + nums[i], path)
            if result:
                return result
            path.pop()

    return backtrack(0, 0, [])

def removeValue(num,nums,startPos,stopPos):
    while startPos in nums.keys() and startPos<stopPos:
        if num in nums[startPos]:
            nums[startPos].remove(num)
            return
        startPos+=1

data=input().split()
earning={}
payment={}
while len(data)!=0:
    intension=data.pop(0)
    date=int(data.pop(0))
    if intension=='F':
        duration=int(data.pop(0))
        amt=int(data.pop(0))
        earning[date]=[duration,amt]
    else:
        amt=int(data.pop(0))
        if date in payment.keys(): payment[date].append(amt)
        else: payment[date]=[amt]

for day in earning:
    eligibleList=[]
    j=day
    while j in payment.keys() and j<(day+earning[day][0]):
        eligibleList+=payment[j]
        j+=1
    pos=find_combination(earning[day][1],eligibleList)
    if pos:
        for p in pos:
            removeValue(eligibleList[p],payment,day,day+earning[day][0])
    else:
        print(day,end=' ')