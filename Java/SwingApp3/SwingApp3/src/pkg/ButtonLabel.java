package pkg;
import javax.swing.*;
import java.awt.*;
class ButtonLabel extends JFrame
{
	JButton b;
	
     ButtonLabel()
	{
		  Container con=getContentPane();
	       JButton b= new JButton("I'm a Swing button!");
           b.setMnemonic('S'); 
		   con.add(b);
       	   setSize(200,200);
		   con.setLayout(new FlowLayout());
		   setVisible(true);
	 }
	 public static void main(String a[])
	 {
			ButtonLabel bl=new ButtonLabel();
	 }

  
};