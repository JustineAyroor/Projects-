package pkg;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class JSplitPaneDemo {
	JFrame f1;
	JButton b1, b2, b3,b4;
	JPanel p1,p2;
	JSplitPane sp;
	JSplitPaneDemo(){
		f1= new JFrame();
		b1= new JButton("First");
		b2= new JButton("Second");	
		b3= new JButton("Third");	
		b4= new JButton("Fourth");	
		p1= new JPanel();
		p2= new JPanel();
		p1.add(b1);p1.add(b2);p2.add(b3);p2.add(b4);
		//sp= new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		sp= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		sp.setTopComponent(p1);
		sp.setBottomComponent(p2);
		f1.add(sp);
		//f1.setSize(200,200);
		f1.setSize(350,200);
		f1.setVisible(true);
	}
	public static void main(String[] args) {
		
		JSplitPaneDemo jd= new JSplitPaneDemo();
		
	}

}
