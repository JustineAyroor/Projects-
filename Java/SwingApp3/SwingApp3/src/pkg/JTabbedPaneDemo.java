package pkg;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneDemo {

	JFrame f1;
	JButton b1, b2, b3,b4;
	JPanel p,p1,p2,p3,p4;
	JTabbedPane tp1;
	JTabbedPaneDemo(){
		f1= new JFrame();
		b1= new JButton("First");
		b2= new JButton("Second");	
		b3= new JButton("Third");	
		b4= new JButton("Fourth");	
		p= new JPanel();p1= new JPanel();
		p2= new JPanel();p3= new JPanel();p4= new JPanel();
		p.setLayout(new BorderLayout());
		tp1= new JTabbedPane();
		p1.add(b1);p2.add(b2);p3.add(b3);p4.add(b4);
		tp1.addTab("First", p1);
		tp1.addTab("Second",p2);
		tp1.addTab("Third", p3);
		tp1.addTab("Fourth", p4);
		tp1.setSize(100,100);
		p.add(tp1, BorderLayout.CENTER);
		f1.add(p);
		f1.setSize(200,200);
		f1.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		JTabbedPaneDemo jd = new JTabbedPaneDemo();
	}

}
