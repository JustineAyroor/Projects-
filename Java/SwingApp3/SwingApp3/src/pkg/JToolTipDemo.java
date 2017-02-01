package pkg;
import javax.swing.*;  
import java.awt.event.*;
public class JToolTipDemo {
	JFrame f1;
	JButton b1;
	JToolTipDemo()
	{
	f1= new JFrame();
	b1= new JButton("Click");	
	b1.setToolTipText("Click on this button!");
	f1.add(b1);
	f1.setSize(200,200);
	f1.setVisible(true);
	}
	public static void main(String[] args) {
		
		JToolTipDemo jd= new JToolTipDemo();
		
	}

}
