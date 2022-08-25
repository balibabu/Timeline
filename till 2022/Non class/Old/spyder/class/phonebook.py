n=open('name.txt','a')
check=input('do you want to add contact [y/n] ')
while check[0]=='y':
    n.write(input('enter contact name '))
    n.write(' : ')
    n.write(input('enter phone number '))
    n.write('\n')
    check=input('do you want to add contact [y/n] ')
n.close()
n1=open('name.txt','r')
for i in n1:
    print(i,end='')
n1.close()
print('bye !  see you soon')