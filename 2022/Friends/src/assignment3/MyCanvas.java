package assignment3;

import java.awt.Graphics;

import javax.swing.JComponent;

public class MyCanvas extends JComponent{
	public void paint(Graphics g) {
//		g.drawLine(100, 200, 100, 100);
		g.drawOval(100, 100, 300, 300);
		g.drawOval(150, 150, 50, 50);
	}
}
