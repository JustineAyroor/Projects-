package pkg1;
import java.awt.*;

public class FrameThreads extends Frame implements Runnable{
	private Thread t1, t2;
	private int t1_x, t2_x;
	
	public FrameThreads()
	{
		t1 = new Thread(this,"t1");
		t2 = new Thread(this,"t2");
		t1.start();
		t2.start();
		t2_x=550;
		t1_x=0;
	}
	
	public synchronized void run()
	{
		while(true)
		{
			if(Thread.currentThread() == t1)
				t1_x++;
			if(Thread.currentThread() == t2)
				t2_x--;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}		
	}
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.setFont(new Font("Lucida Handwriting",Font.BOLD,36));
		g.drawString("SEED",t1_x,300);
		g.drawString("Infotech",t2_x,300);
		
	}

	public static void main(String[] args) {
		FrameThreads t1 = new FrameThreads();
		t1.setSize(600,600);
		t1.setVisible(true);
		System.out.println("In Main");
	}
}
