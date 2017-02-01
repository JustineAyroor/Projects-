package pkg;
import javax.swing.*;
import java.awt.*;
class Table extends JFrame
{
	Table()
	{
		String data[][]={
									{"101","Ram"},
									{"102","Shyam"}
								};
		String col[]={"ID","Name"};
		JTable jt=new JTable(data,col);
		JScrollPane jsp=new JScrollPane(jt);

//		getContentPane().setLayout(new FlowLayout());

		getContentPane().add(jsp);
	//	getContentPane().add(jt);
		setSize(100,100);
		setVisible(true);

	}
	public static void main(String a[])
	{
		new Table();
	}
}