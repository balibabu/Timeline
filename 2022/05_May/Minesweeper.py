from time import sleep
import cv2
import numpy as np
import pyautogui as pg

class MatchPics:
    def setImage1(self,img):
        self.img1=img
    def setImage2(self,img):
        self.img2=img
    def match(self):
        img_gray = cv2.cvtColor(self.img1, cv2.COLOR_BGR2GRAY)
        template = cv2.cvtColor(self.img2, cv2.COLOR_BGR2GRAY)
        res = cv2.matchTemplate(img_gray,template,cv2.TM_CCOEFF_NORMED)
        threshold = 0.8
        loc = np.where( res >= threshold)
        for pt in zip(*loc[::-1]):
            return 1
        return 0

class Rule:
    def __init__(self):
        self.unrevealedBox=0
        self.revealedBlankBox=9
        self.bomb=6
    def set_matrix(self,matrix):
        self.matrix=matrix
    def rule_1(self,augMat):
        locs=set()
        for i in range(len(self.matrix)):
            for j in range(len(self.matrix[0])):
                if self.matrix[i][j]==1:
                    loc=self.ruler(1,(i,j))
                    if loc:
                        locs.union(loc)
                        # self.surroundIt(augMat,loc)
                        # for r,c in loc:
                        #     augMat[r][c]=self.bomb
                        # print(loc)
        print(locs)


    def rule_2(self):
        pass
    def ruler(self,rule_no,location):
        sur_by_mask=0
        r,c=location
        bombLoc=set()
        borders=[(r-1,c-1),(r-1,c),(r-1,c+1),(r,c-1),(r,c+1),(r+1,c-1),(r+1,c),(r+1,c+1)]
        for r,c in borders:
            if not (r<0 or c<0 or r>=len(self.matrix) or c>=len(self.matrix[0])):
                if self.matrix[r][c]==self.unrevealedBox:
                    bombLoc.add((r,c))
                    # sur_by_mask+=1
                    # r1,r2=r,c
        if len(bombLoc) == rule_no:
            return bombLoc
        return False
    
    def surroundIt(self,mat,loc):
        for p in loc:
            r,c=p
            borders=[(r-1,c-1),(r-1,c),(r-1,c+1),(r,c-1),(r,c+1),(r+1,c-1),(r+1,c),(r+1,c+1)]
            for r1,c1 in borders:
                if not (r1<0 or c1<0 or r1>=len(mat) or c1>=len(mat[0])):
                    mat[r1][c1]+=1
        # print(mat)

            

        

class Board:
    def __init__(self):
        self.RowCol=(10,6)
        self.augmentedMatrix=[[0 for i in range(6)] for j in range(10)]
        self.TopLeftCorner=(3,114)
        self.BottomRightCorner=(575,1070)
        self.matrix=[[0 for i in range(6)] for j in range(10)]
    def setRowCol(self,rc:tuple):
        self.RowCol=rc
    def setTopLeftCorner(self,tlc:tuple):
        self.TopLeftCorner=tlc
    def setBottomRightCorner(self,brc:tuple):
        self.BottomRightCorner=brc

    def _getSteps(self):
        x1,y1=self.TopLeftCorner
        x2,y2=self.BottomRightCorner
        r,c=self.RowCol
        xStep=(x2-x1)/c
        yStep=(y2-y1)/r
        return xStep,yStep

    def takeSS(self):
        x1,y1=self.TopLeftCorner
        x2,y2=self.BottomRightCorner
        width=x2-x1
        height=y2-y1
        pg.screenshot('ss.png',region=(*self.TopLeftCorner, width, height))

    def execute(self):
        pass

    def extractArray(self,img):
        matrix=[]
        x,y=self.TopLeftCorner
        xStep,yStep=self._getSteps()
        for i in range(self.RowCol[0]):
            col=[]
            for j in range(self.RowCol[1]):
                image=img[int(xStep*i):int(xStep*(i+1)), int(yStep*j):int(yStep*(j+1))]
                # cv2.imshow('win name',image)
                # cv2.waitKey(0)
                # cv2.destroyAllWindows()
                # print(self.getNumber(image))
                # cv2.imwrite(f'img/{i,j}.png',image)
                col.append(self.getNumber(image))
            matrix.append(col)
        return matrix

    def getNumber(self,image):
        # print(image.shape)
        m=MatchPics()
        m.setImage1(image)
        for i in range(0,7):
            m.setImage2(cv2.imread(f'img/{i}.png')) 
            try:
                if m.match():
                    return  i
            except:
                pass
        return 9

    def clickAt(self,row,col):
        xStep,yStep=self._getSteps()
        start=(int(self.TopLeftCorner[0]+xStep/2+col*xStep),int(self.TopLeftCorner[1]+yStep/2+row*yStep))
        pg.click(start[0],start[1],duration=1)