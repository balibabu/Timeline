import cv2
import numpy as np
import copy

class Visualize:

    def __init__(self,mat):
        self.mat=mat
        self.row=len(mat)
        self.col=len(mat[0])
        self.image=np.zeros((self.row*50,2*(self.col*50)//3, 1), dtype="uint8")
        self.radius=28
        self.drawHexArray()
    
    def show(self,wait=0):
        cv2.imshow('imaging',self.image)
        cv2.waitKey(wait)
        cv2.destroyAllWindows()

    def drawHexagone(self,center):
        vertices = []
        for i in range(6):
            x = int(center[0] + self.radius * np.cos(np.radians(i * 60 + 30)))
            y = int(center[1] + self.radius * np.sin(np.radians(i * 60 + 30)))
            vertices.append((x, y))
        pts = np.array(vertices, np.int32)
        pts = pts.reshape((-1, 1, 2))
        cv2.polylines(self.image, [pts], isClosed=True, color=150, thickness=2)

    def refactorPoint(self,i,j):
        gap=25 if i%2==0 else 50
        center=(gap+50*j,self.radius+i*40)
        return center

    def drawHexArray(self):
        newMat=[]
        for row in self.mat:
            col=row.split('-')
            while '' in col: col.remove('')
            newMat.append(col)
        n,m=len(newMat),len(newMat[0])
        for i in range(n):
            for j in range(m):
                center=self.refactorPoint(i,j)
                self.drawHexagone(center)
                org=center[0]-12,center[1]+7
                cv2.putText(self.image, newMat[i][j], org, cv2.FONT_HERSHEY_SIMPLEX, fontScale=.8, color=200, thickness=2)

    def showPath(self,list1,speed=200):
        copied_image = copy.deepcopy(self.image)
        for i in range(len(list1)-1):
            x1,y1=list1[i][0],list1[i][1]//2
            x2,y2=list1[i+1][0],list1[i+1][1]//2
            start=self.refactorPoint(x1,y1)
            end=self.refactorPoint(x2,y2)
            cv2.line(self.image, start, end, color=250, thickness=4)
            cv2.imshow('imaging',self.image)
            cv2.waitKey(speed)
        self.image=copied_image
        cv2.destroyAllWindows()


if __name__ == '__main__':
    mat=['X-X-O-O-X-X-X-X-X-O-', '-O-X-O-X-O-W-O-X-O-O', 'O-O-O-O-O-O-O-O-O-X-', '-O-O-O-O-O-O-X-O-O-O', 'O-X-X-O-O-X-O-X-O-O-']
    v=Visualize(mat)
    path=[(0, 10), (0, 8), (1, 7), (1, 5), (1, 3), (0, 2), (0, 0)]
    v.showPath(path)
    # v.show()
