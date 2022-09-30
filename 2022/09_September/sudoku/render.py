import cv2
class Render:
    def render(imgObj,mat1,mat2):
        x_step=(imgObj.height-imgObj.xstart)//9
        y_step=(imgObj.width-imgObj.ystart)//9
        for i in range(9):
            for j in range(9):
                if mat1[i][j]==0:
                    loc=(y_step//3+y_step*j,int(x_step*2/3)+x_step*i)
                    cv2.putText(imgObj.img,f'{mat2[i][j]}',loc,cv2.FONT_HERSHEY_SCRIPT_COMPLEX,1.5,(255,0,0),2)
    