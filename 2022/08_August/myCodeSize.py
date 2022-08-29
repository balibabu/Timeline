import re
import os
import sys

def getListOfFiles(dirName):
    fTypes=['java','py','c','ipynb','cpp']
    listOfFile = os.listdir(dirName)
    allFiles = list()
    for item in listOfFile:
        if re.search('^\.|^djangorest',item):
            continue #djangorest
        fullPath = os.path.join(dirName, item)
        if os.path.isdir(fullPath):
            allFiles = allFiles + getListOfFiles(fullPath)
        else:
            if not os.path.splitext(item)[1][1:] in fTypes:
                continue
            allFiles.append(fullPath)
    return allFiles

def readIpynb(filename):
    import codecs
    import json
    f = codecs.open(filename, 'r')
    source = f.read()
    y = json.loads(source)
    pySource = '##Python .py code from .jpynb:\n'
    for x in y['cells']:
        for x2 in x['source']:
            pySource = pySource + x2
            if x2[-1] != '\n':
                pySource = pySource + '\n'
    return pySource


def getAllSize(files):
    content=''
    size1=0
    for i in files:
        try:
            if i[-5:]=='ipynb':
                content+='\n'+readIpynb(i)
            else:
                size1 += os.path.getsize(i)
        except:
            pass
    with open('temp.txt','w') as f:
        f.write(content)
    print(f'size of program files except ipynb:{round(size1/1024,3)} KB')
    size2=os.path.getsize('temp.txt')
    print(f'size of only programs in notebook file:{round(size2/1024,3)} KB')
    os.remove("temp.txt")
    print('Total code size is',round((size1+size2)/1024,3),'KB')
            

path=''
try:
    path=sys.argv[1]
    print('using default path')
except:
    print('using default path')
    path=r'D:\Works_Space\Timeline\2022\08_August'

print(path)
lists=getListOfFiles(path)
print(f'total program files:{len(lists)}')
getAllSize(lists)
# print('done execution')


# D:\Works_Space\SOA_University\Semester_6\ID\assignment 6\jdbc\database\src

# path=''
# try:
#     path=sys.argv[1]
#     print(len(path))
#     if len(path)<12:
#         path=r'D:\Works_Space\Timeline\2022\08_August'
#         print('using default path')
#     else:
#         print('using custom path')
# except:
#     print('using default path')
#     path=r'D:\Works_Space\Timeline\2022\08_August'