def display(arr):
    print()
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            print("{:.1f}".format(arr[i][j]),end='\t')
        print()
    print()

def enter(arr):
    for i in range(len(arr)):
        print('enter value for row ',i+1)
        for j in range(len(arr[i])):
            arr[i][j]=float(input())
    return arr