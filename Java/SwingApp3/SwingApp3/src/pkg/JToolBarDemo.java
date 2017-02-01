package pkg;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class JToolBarDemo {

	JFrame f1;
	JButton b1, b2, b3,b4;
	JToolBar tb1;
	JToolBarDemo()
	{
	tb1= new JToolBar();
	f1= new JFrame();
	b1= new JButton("Cut");
	b2= new JButton("Copy");	
	b3= new JButton("Paste");	
	b4= new JButton("Exit");	
	tb1.add(b1);tb1.add(b2);tb1.add(b3);tb1.add(b4);
	b1.setToolTipText("Click on this button!");
	f1.setLayout(new FlowLayout());
	f1.add(tb1);
	f1.setSize(200,200);
	f1.setVisible(true);
	}
	public static void main(String[] args) {
		
		JToolBarDemo jd= new JToolBarDemo();
	}

}
