import cv2
class Image:
    def setImage(self,path):
        self.img=cv2.imread(path,1)
        self.xstart,self.ystart=0,0
        self.height,self.width,_=self.img.shape
    def setTopLeft(self,x,y):
        self.xstart=x
        self.ystart=y
    def setBottomRight(self,x,y):
        self.height=x
        self.width=y
    def display(self,duration=0):
        cv2.imshow('windows',self.img)
        cv2.imwrite('ansImg/solution.png',self.img)
        print('saving the solution in ansImg folder')
        cv2.waitKey(duration)
        cv2.destroyAllWindows()