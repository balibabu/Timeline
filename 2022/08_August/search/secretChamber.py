from pathsHandler import Paths
from fileHandler import File
class Customize:
    def addPath(intention='a'):
        with open('parentPaths',intention) as file:
            file.write(input('enter a path:')+'\n')
        Customize.providePaths()
        
    def providePaths():
        contents=File.readFile('parentPaths')
        if(contents==''):
            Customize.addPath('w')
        f=contents.split('\n')[:-1]
        Paths.parentPaths=f
        print(f)

    def analyzer(text):
        if text=='1':
            Paths.setFileType('py', 'only') # search only in python file
        elif text=='2':
            Paths.setFileType('java', 'only') # only java file
        elif text=='3':
            Paths.setFileType('ipynb', 'only') # only python notebook file
        else:
            Customize.secretChamber()

    def secretChamber():
        menu='''1. Search specific file type\n2.Search all except ..file type\n3.Add parent path\n4.Remove all parent paths and add new one'''
        print(menu)
        choice=input('enter your choice:')
        if choice=='1':
            Paths.setFileType(input('enter file type:'), 'only')
        elif choice=='2':
            Paths.setFileType(input('enter file type:'), 'except')
        elif choice=='3':
            Customize.addPath()
        elif choice=='4':
            Customize.addPath('w')
