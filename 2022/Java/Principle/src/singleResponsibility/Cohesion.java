package singleResponsibility;

public class Cohesion {
//	previous all methods given below was in single class
//	which was not following SRP, now they follow SRP
}

class Square{	// Responsibility Measurements Of Square
	int side=5;
	public int calculateArea() {
		return side*side;
	}
	public int calculatePerimeter() {
		return side*4;
	}
}

class SquareUI{	 // Responsibility: Rendering images of square
	public void draw() {
		// do some stuff
	}
	public void rotate() {
		// do rotation stuff
	}
}