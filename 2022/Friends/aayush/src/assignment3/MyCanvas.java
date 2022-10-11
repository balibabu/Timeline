package assignment3;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class MyCanvas extends JComponent{
	public void paint(Graphics g) {
//		g.drawLine(100, 200, 100, 100);
		g.drawOval(100, 100, 300, 300);
		g.drawOval(160, 175, 50, 50);
		g.drawOval(260, 175, 50, 50);
		g.fillOval(165, 180, 40, 40);
		g.fillOval(265, 180, 40, 40);
		g.drawLine(210, 220, 170, 250);
//		Rectangle rect=new Rectangle();
//		rect.height=100;
//		rect.width=200;
//		rect.x=10;
//		rect.y=10;
	}
}
