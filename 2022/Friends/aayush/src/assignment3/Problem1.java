package assignment3;

import java.awt.Rectangle;

import javax.swing.*;
import javax.swing.GroupLayout.Group;
import javax.swing.JFrame;

public class Problem1 {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.setBounds(30, 30, 600, 600); 
		
		window.getContentPane().add(new MyCanvas());
		
		
				

		window.setVisible(true); 
		System.out.println("i'm done");
//		Rectangle rect=new Rectangle();
//		rect.height=100;
//		rect.width=200;
//		rect.x=10;
//		rect.y=10;
//		Group root = new Group();   
//	    root.getChildren().add(rect);
	}

}
