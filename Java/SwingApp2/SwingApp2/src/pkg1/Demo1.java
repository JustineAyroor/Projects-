package pkg1;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class Demo1 implements ActionListener {
	JFrame f1;
	JMenuBar mb;
	JMenu m1, msub1, msub2;
	JMenuItem mi1, mi2, mi3, mi4, mi5,mi6;
	JTextField txt1;
	JPopupMenu pm;
	
	Demo1(){
		f1= new JFrame();
		f1.setLayout(new FlowLayout());
		mb= new JMenuBar();
		m1= new JMenu("Color");
		pm= new JPopupMenu();
		msub1= new JMenu("Background");
		msub2= new JMenu("Foreground");
		mi1= new JMenuItem("Red");
		mi2= new JMenuItem("Blue");
		mi3= new JMenuItem("Green");
		mi4= new JMenuItem("Orange");
		mi5= new JMenuItem("Yellow");
		mi6= new JMenuItem("darkGray");
		txt1= new JTextField(20);
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		mi6.addActionListener(this);
				
		msub1.add(mi1);msub1.add(mi2);msub1.add(mi3);
		msub2.add(mi4);msub2.add(mi5);msub2.add(mi6);
		m1.add(msub1);pm.add(msub2);
		mb.add(m1);
		f1.add(txt1);
		f1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				if(arg0.isPopupTrigger())
					pm.show(arg0.getComponent(), arg0.getX(), arg0.getY());
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		f1.setJMenuBar(mb);
		
		f1.setSize(300, 300);
		f1.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d= new Demo1();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String caption= arg0.getActionCommand();
		if(caption.equals("Red")){
			//Color c=JColorChooser.showDialog(f1, null, null);
			txt1.setBackground(Color.red);
		}
		else if(caption.equals("Blue")){
			//Color c=JColorChooser.showDialog(f1, null, null);
			txt1.setBackground(Color.blue);
		}
		else if(caption.equals("Green")){
			//Color c=JColorChooser.showDialog(f1, null, null);
			txt1.setBackground(Color.green);
		}
		else if(caption.equals("Orange")){
			//Color c=JColorChooser.showDialog(f1, null, null);
			txt1.setForeground(Color.orange);
		}
		else if(caption.equals("Yellow")){
			//Color c=JColorChooser.showDialog(f1, null, null);
			txt1.setForeground(Color.yellow);
		}
		else if(caption.equals("darkGray")){
			//Color c=JColorChooser.showDialog(f1, null, null);
			txt1.setForeground(Color.darkGray);
		}
		
	}

}
