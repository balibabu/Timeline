data=input().split()
shape=data[0]
length=int(data[1].split('=')[1])
iterations=int(data[2].split('=')[1])

if shape=='tri':
    print(int(3*pow(4,iterations)*length/(pow(3,iterations))))
elif shape=='sq':
    print(int(4*pow(5,iterations)*length/(pow(3,iterations))))
