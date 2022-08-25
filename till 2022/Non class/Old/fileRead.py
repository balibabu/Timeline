import os
def textfiles():
    for x in os.listdir("C://Users//Balibabu//Desktop//New folder//"):
        if x.endswith(".py"):
            readfiles(x)
def readfiles(fname):
    f=open(fname)
    print(f.read())
    print('\n')

print(os.listdir())
textfiles()

