class node:
    data=0
    nxt=None

head=node()
head.nxt=None
n=int(input('enter a number '))
temp=node()
temp.nxt=None
temp.data=n
head=temp
while True:
    n=int(input('enter 0 to terminate '))
    if n!=0:
        temp2=node()
        temp2.nxt=None
        temp2.data=n
        temp.nxt=temp2
        temp=temp2
    else:
        break

store=head

while store!=None:
    print(store.data)
    store=store.nxt


        
        