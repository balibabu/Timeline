import cv2
import numpy
class Extraction:
    
    def extract(imgObj):
        matrix=[]
        x_step=(imgObj.height-imgObj.xstart)//9
        y_step=(imgObj.width-imgObj.ystart)//9
        for i in range(9):
            row=[]
            for j in range(9):
                num=Extraction._matchNumber(imgObj.img[(imgObj.xstart+x_step*i):(imgObj.xstart+(i+1)*x_step), (imgObj.ystart+y_step*j):(imgObj.ystart+(j+1)*y_step)])
                row.append(num)
            matrix.append(row)
        return matrix
        
    def _matchNumber(cell_img):
        for i in range(1,10):
            template=cv2.imread(f'digitsImg/s{i}.jpg',0)
            gray=cv2.cvtColor(cell_img,cv2.COLOR_BGR2GRAY)
            res=cv2.matchTemplate(gray,template,cv2.TM_CCOEFF_NORMED)
            threshold=0.9
            loc=numpy.where(res>=threshold)
            w,h=template.shape[::-1]
            for pt in zip(*loc[::-1]):
                return i
        return 0

        