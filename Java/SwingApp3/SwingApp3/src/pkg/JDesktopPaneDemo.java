package pkg;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class JDesktopPaneDemo {
	JFrame f1;
	JDesktopPane dpd;
	static int openFRameCount=0;
	JInternalFrame internalFrame1, internalFrame2 ;
	JDesktopPaneDemo(){
		f1= new JFrame();
		dpd= new JDesktopPane();
		internalFrame1 = new JInternalFrame("Can Do All", true, true, true, true);
		internalFrame2 = new JInternalFrame("Can Do All", true, true, true, true);
		internalFrame1.setBounds(25, 25, 100, 100);
		internalFrame2.setBounds(50, 50, 125, 125);
		dpd.add(internalFrame1);
		dpd.add(internalFrame2);
		
		JLabel label = new JLabel(internalFrame1.getTitle(), JLabel.CENTER);
	    internalFrame1.add(label, BorderLayout.CENTER);
	    JLabel label1 = new JLabel(internalFrame2.getTitle(), JLabel.CENTER);
	    internalFrame2.add(label1, BorderLayout.CENTER);

	    internalFrame1.setVisible(true);
		internalFrame2.setVisible(true);

	    f1.add(dpd, BorderLayout.CENTER);
	    f1.setSize(500, 300);
	    f1.setVisible(true);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDesktopPaneDemo d1= new JDesktopPaneDemo();
	}

}
