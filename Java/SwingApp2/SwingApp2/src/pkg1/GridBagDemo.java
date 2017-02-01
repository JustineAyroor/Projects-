package pkg1;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class GridBagDemo {

	JFrame f1;
	JButton b1,b2,b3,b4,b5;
	Container c;
	GridBagConstraints gbc;
	GridBagDemo()
	{
		f1= new JFrame();
		c= f1.getContentPane();
		c.setLayout(new GridBagLayout());
		gbc= new GridBagConstraints();
		boolean shouldFill = false;
		if(shouldFill)
		{
			gbc.fill= GridBagConstraints.HORIZONTAL;
		}
		
		b1= new JButton("Create");
		
		boolean shouldWeightX = false;
		if(shouldWeightX)
		{
			gbc.weightx=0;			
		}
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=0;
		c.add(b1, gbc);
		
		/*b2= new JButton("Update");
		gbc.fill= GridBagConstraints.FIRST_LINE_END;
		gbc.weightx=0.5;	
		gbc.gridx=1;
		gbc.gridy=0;
		c.add(b2, gbc);*/
		
		b3= new JButton("Delete");
		gbc.fill= GridBagConstraints.NORTHEAST;
		gbc.weightx=0.5;	
		gbc.gridx=2;
		gbc.gridy=1;
		c.add(b3, gbc);
		
		b4= new JButton("what else can be done");
		gbc.fill= GridBagConstraints.CENTER;
		gbc.ipady=25;
		gbc.weightx=0.0;
		gbc.gridwidth=3;
		gbc.gridx=0;
		gbc.gridy=3;
		c.add(b4, gbc);
		
		b5= new JButton("Retrieve");
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.ipady=0;
		gbc.weighty=1.0;
		gbc.anchor=gbc.PAGE_END;
		gbc.insets=new Insets(10,0,0,0);
		gbc.gridx=1;
		gbc.gridwidth=2;
		gbc.gridy=3;
		c.add(b5, gbc);
		
		f1.setSize(500,500);
		f1.setVisible(true);
	}
	
	public static void main(String[] args) {
		GridBagDemo gbd= new GridBagDemo();
		
	}

}
