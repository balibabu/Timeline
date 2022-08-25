package chapter_1;


class Rectangle{
	int x,y,w,h;
	Rectangle(int x,int y,int w,int h){
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
}

public class rectangles {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(0, 0, 4,4 );
		Rectangle r2=new Rectangle(1, 1, 2, 1);
		if(intersect(r1, r2) || intersect(r2, r1)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
	
	public static boolean intersect(Rectangle r1,Rectangle r2) {
		if(encloses(r1.x,r1.y,r1.x+r1.h,r1.y+r1.h,r2.x,r2.y)) {
			return true;
		}else if(encloses(r1.x,r1.y,r1.x+r1.h,r1.y+r1.h,r2.x+r2.w,r2.y)) {
			return true;
		}else if(encloses(r1.x,r1.y,r1.x+r1.h,r1.y+r1.h,r2.x,r2.y+r2.h)) {
			return true;
		}else if(encloses(r1.x,r1.y,r1.x+r1.h,r1.y+r1.h,r2.x+r2.w,r2.y+r2.h)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean encloses(int x1,int y1,int x2,int y2,int x,int y) {
		if(((x1<=x)&&(x<=x2))&&((y1<=y)&&(y<=y2))) {
			return true;
		}
		return false;
	}

}
