package pkg1;

import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsDemo extends JFrame{
	public void paint(Graphics g){
		g.drawString("hello!", 100, 100);
		
	}
	public static void main(String d[]){
		GraphicsDemo gd= new GraphicsDemo();
		gd.setSize(200, 200);
		gd.setVisible(true);
		
		
	}
}
