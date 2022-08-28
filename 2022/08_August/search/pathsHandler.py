import os
import re

class Paths:
    fTypes=['java','py','c','txt','cpp','ipynb']
    parentPaths=[]
    filesList=[]

    def __init__(self):
        pass
    def getFilesList():
        def getListOfFiles(dirName):
            listOfFile = os.listdir(dirName)
            allFiles = list()
            for item in listOfFile:
                if re.search('^\.|^djangorest',item):
                    continue #djangorest
                fullPath = os.path.join(dirName, item)
                if os.path.isdir(fullPath):
                    allFiles = allFiles + getListOfFiles(fullPath)
                else:
                    if not os.path.splitext(item)[1][1:] in Paths.fTypes:
                        continue
                    allFiles.append(fullPath)
            return allFiles
        
        list1=[]
        for i in Paths.parentPaths:
            list1+=getListOfFiles(i)
        Paths.filesList=list1

    def setFileType(fextension,action):
        if action=='only':
            Paths.fTypes=[fextension]
        elif action=='except':
            Paths.fTypes.remove(fextension)

    def shortPath(path):
        if len(path)>70:
            return path[:26]+'....'+path[-40::1]
        else:
            return path