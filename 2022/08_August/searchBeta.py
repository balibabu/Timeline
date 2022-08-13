from threading import Thread
import re

class FilesPath(Thread):
    def setPath(self,path1):
        self.path=path1
    def run(self):
        def getListOfFiles(dirName):
            fTypes=['java','py','c','txt','inpynb','cpp']
            listOfFile = os.listdir(dirName)
            allFiles = list()
            for item in listOfFile:
                if re.search('^\.',item):
                    continue
                fullPath = os.path.join(dirName, item)
                if os.path.isdir(fullPath):
                    allFiles = allFiles + getListOfFiles(fullPath)
                else:
                    if not os.path.splitext(item)[1][1:] in fTypes:
                        continue
                    allFiles.append(fullPath)
                    # f.write(item+"\n")
            return allFiles
        # dirName=r'D:\Works_Space\SOA_University'
        self.allFiles=getListOfFiles(self.path)

class Search:
    def readFile(self,fname):
        with open(fname,'r') as f:
            temp= f.read()
            return temp
        return ''

    def isPresent(self,regex,string):
        x=re.search(regex,string,re.IGNORECASE)
        return x!=None

    def showMatch(self,regex,files):
        count=0
        outcome=list()
        for file in files:
            try:
                content=self.readFile(file)
                if self.isPresent(regex,content):
                    outcome.append(file)
                    count+=1
                    print(count,'=>',file)
            except:
                pass
        print('found match:',count)
        print('Total file searched:',len(files))
        self.nofMatch=count
        self.matchedFiles=outcome
        if count==0:
            print('no match found')
        elif count==1:
            print(readFile(self,outcome[0]))
        return count

    def showMatchPos(self,choice):
        print(self.readFile(self.matchedFiles[choice-1]))
            

def getMetaFiles()->list:
    with open('metadata.bb','r') as f:
        content=f.read()
        return content.split('\n')

def updateMetaData(metaFiles,allFiles):
    # print('size of metafiles',len(metaFiles),'all files',len(allFiles))
    if len(metaFiles)-1==len(files):
        False
    c=0
    with open('metadata.bb','a') as f:
        for file in allFiles:
            if not file in metaFiles:
                c=1
                f.write(file+'\n')
        
    return True if c==0 else False

path1=r'D:\Works_Space\SOA_University'
path2=r'D:\Works_Space\Timeline'
thread1=FilesPath()
thread2=FilesPath()
thread1.setPath(path1)
thread2.setPath(path2)
thread1.start()
thread2.start()

files=getMetaFiles()
if not files[0]:
    thread1.join()
    files=thread1.allFiles

regex=input('enter keyword ')
search=Search()
search.showMatch(regex,files)
while(1):
    choice=int(input('enter your choice or 0 to exit '))
    if not choice:break
    search.showMatchPos(choice)
    if not (Thread.is_alive(thread1) and Thread.is_alive(thread2)):
        print('========================================inside is alive')
        tempFiles=thread1.allFiles+thread2.allFiles
        if updateMetaData(getMetaFiles(),tempFiles):
            print('=========================================if changes')
            search.showMatch(regex,files)
            # files=tempFiles

thread1.join()
thread2.join()
updateMetaData(getMetaFiles(),thread1.allFiles+thread2.allFiles)
print('program exits')