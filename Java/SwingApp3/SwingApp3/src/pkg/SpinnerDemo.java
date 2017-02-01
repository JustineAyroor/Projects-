package pkg;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;

public class SpinnerDemo {

	/**
	 * @param args
	 */
	static JSpinner dd,mm,yy;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("JSpinner Sample");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Calendar cal = Calendar.getInstance();
	    Date date = cal.getTime();
	    
	    dd = new JSpinner(); mm = new JSpinner(); yy = new JSpinner();
	    dd.setModel(new SpinnerDateModel(date, null, null, cal.DAY_OF_MONTH));
	    dd.setEditor(new JSpinner.DateEditor(dd, "dd"));	    
	    mm.setModel(new SpinnerDateModel(date, null, null, cal.MONTH));
        mm.setEditor(new JSpinner.DateEditor(mm, "MM"));
        yy.setModel(new SpinnerDateModel(date, null, null, cal.YEAR));
        yy.setEditor(new JSpinner.DateEditor(yy, "yyyy"));
	    
	    //JLabel label1 = new JLabel("Dates/Date");
	    JPanel panel1 = new JPanel(new FlowLayout());
	   // panel1.add(label1, BorderLayout.WEST);
	    //panel1.add(dd, BorderLayout.WEST);panel1.add(mm, BorderLayout.CENTER);panel1.add(yy, BorderLayout.EAST);
	    panel1.add(dd);panel1.add(mm);panel1.add(yy);
	    frame.add(panel1, BorderLayout.CENTER);

	    frame.setSize(200, 90);
	    frame.setVisible(true);

	}

}
