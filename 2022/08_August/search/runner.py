from fileHandler import File
from pathsHandler import Paths
from secretChamber import Customize
import pyperclip


class Runner:
    matchedFilesPath=[]

    def __init__(self):
        try:
           Customize.providePaths()
        except Exception as e:
            print('No default path found',e)
            Customize.addPath()
            Customize.providePaths()
    
    
    def match(self,regex):
        count=0
        for i in Paths.filesList:
            try:
                if File.isPresent(regex,File.readFile(i)):
                    self.matchedFilesPath.append(i)
                    count+=1
                    print(count,'=>',Paths.shortPath(i))
            except:
                pass
        File.insights(count,len(Paths.filesList))
        return count
    
    def run(self):
        regex=input('enter keyword:')
        if regex in '1234':
            Customize.analyzer(regex)
            regex=input('enter keyword:')
        pyperclip.copy(regex)
        Paths.getFilesList()
        count=self.match(regex)
        if count==0:
            print('No matching found')
        elif count==1:
            File.openInNotepad(self.matchedFilesPath[0])
        else:
            while(1):
                choice = int(input('enter an option number or 0 to quit:'))
                if choice == 0: break
                File.openInNotepad(self.matchedFilesPath[choice-1])



def main():
    instance = Runner()
    instance.run()

if __name__ == '__main__':
    main()