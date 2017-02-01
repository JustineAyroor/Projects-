package pkg;
import javax.swing.*; 
import java.awt.*; 

class ButtonImg
{
	JFrame f1;
	ButtonImg()
	{
		f1= new JFrame();
		f1.setLayout(new FlowLayout()); 

	    JButton button = new JButton(new ImageIcon("D:\\Shital\\SCTS33\\CoreJava\\SwingApp3\\src\\pkg\\smallsuccess.gif")); 

      f1.add(button);
      f1.setSize(200,200);
		f1.setVisible(true);
     
      
	 }
	public static void main(String args[])
	{
		ButtonImg img=new ButtonImg();
	}

}
