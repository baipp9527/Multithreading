package zuoye_1972;

public class dm1 extends Thread

{
	private double x = 0;
	public dm1(double x) {
		this.x = x;
	}
	public void run() {
		while(true) {
			x = x + 1.00d;
			try
			{
				Thread.sleep(300);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("第一个线程:"+x);
		}
	}
}
