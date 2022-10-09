package assignment3;

import java.awt.Rectangle;

import javax.swing.JFrame;

public class Problem1 {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.setBounds(30, 30, 600, 600); 
		
		window.getContentPane().add(new MyCanvas());

		window.setVisible(true); 
		System.out.println("i'm done");
	}

}
