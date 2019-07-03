package zuoye_1972;

public class dm2 implements Runnable
{
	private double x;
	public dm2(double x) {
		this.x = x;
	}
	public void run() {
		
		//double num  = new Dome1().x;
		while(true) {
			x = x+0.1;
			try
			{
				Thread.sleep(400);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("第二线程:"+x);
		
		}
		
	}
}
