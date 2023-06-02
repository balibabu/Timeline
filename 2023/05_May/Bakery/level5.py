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
        driver=int(data.pop(0))
        duration=int(data.pop(0))
        amt=int(data.pop(0))
        if date in earning.keys(): earning[date].append([driver,duration,amt])
        else: earning[date]=[[driver,duration,amt]]
    else:
        amt=int(data.pop(0))
        if date in payment.keys(): payment[date].append(amt)
        else: payment[date]=[amt]

notPaidDay={}
for day in earning:
    for driver, duration, paidAmt in earning[day]:
        pDay=day
        eligibleList=[]
        while pDay in payment.keys() and pDay<(day+duration+1):
            eligibleList+=payment[pDay]
            pDay+=1
        pos=find_combination(paidAmt,eligibleList)
        if pos:
            for p in pos:
                removeValue(eligibleList[p],payment,day,day+duration+1)
        else:
            if day in notPaidDay.keys(): notPaidDay[day].append(driver)
            else: notPaidDay[day]=[driver]
 
for _day in range(min(notPaidDay),max(notPaidDay)+1):
    if _day in notPaidDay.keys():
        for _driver in notPaidDay[_day]:
            print(f'{_day}:{_driver}',end=' ')