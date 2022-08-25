def abc():
    n=1
    while n<10:
        yield n
        n+=1
top10=abc() 
print(next(top10))
print(next(top10))