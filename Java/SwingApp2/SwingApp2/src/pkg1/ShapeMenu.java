package pkg1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class ShapeMenu extends JFrame implements ActionListener{
	JMenuItem clr;
	JCheckBoxMenuItem rect,circle, arc;
	JMenu shape, color;
	JMenuBar mb;
	JColorChooser jc1= new JColorChooser();
	
	ShapeMenu(){			
		
		//--------JMenuItem
		rect= new JCheckBoxMenuItem("Rect");
		circle= new JCheckBoxMenuItem("Circle");
		arc= new JCheckBoxMenuItem("Arc");
		clr= new JMenuItem("Color");
		
		//--------JMenu
		shape= new JMenu("Shapes");
		color= new JMenu("Color");
		
		//--------Add menu item in menu
		shape.add(rect);
		shape.add(circle);
		shape.add(arc);
		color.add(clr);
		
		//--------Add menu in menu bar
		mb= new JMenuBar();
		mb.add(shape);
		mb.add(color);
		
		//---Listeners
		rect.addActionListener(this);
		circle.addActionListener(this);
		arc.addActionListener(this);
		clr.addActionListener(this);
		//------JFrame		
		setLayout(new BorderLayout());
		setJMenuBar(mb);
		//f1.add(txt);
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeMenu sm= new ShapeMenu();
	}
		
	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1=(String)e.getActionCommand();
		Graphics g= getGraphics();
		 Color c;
		if(s1.equals("Rect")){
			circle.setSelected(false);
			arc.setSelected(false);
			update(g);			
			g.fillRect(100, 100, 50, 50);			
		}
		if(s1.equals("Circle")){
			rect.setSelected(false);
			arc.setSelected(false);
			update(g);
			g.fillOval(100,100, 50, 50);			
		}
		if(s1.equals("Arc")){
			circle.setSelected(false);
			rect.setSelected(false);
			update(g);
			g.drawArc(100, 100, 200, 200,50,50);
		
		}
		if(s1.equals("Color")){
			System.out.println("This is for color.");
			c=jc1.showDialog(null, "Color Dialog",Color.BLACK);
						
			if(rect.isSelected())
			{
				update(g);
				g.setColor(c);
				g.fillRect(100, 100, 50, 50);				
			}
			
			if(circle.isSelected()){
				update(g);
				g.setColor(c);
				g.fillOval(100,100, 50, 50);				
			}
			if(arc.isSelected()){
				update(g);
				g.setColor(c);
				g.drawArc(100, 100, 200, 200,50,50);
				
			}
			
		}
	}

}
