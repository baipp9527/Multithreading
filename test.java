package zuoye_1972;

public class test
{


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		test t = new test();
		test.Dome d = t.new Dome(0);
		test.Dome.Dome1 d1 = d.new Dome1(0);
		d.start();
		d1.start();
		
	}
	class Dome extends Thread{
		private double x;
		public Dome (double x) {
			this.x = x;
		}
		public void run() {
			
			while(true) {
				x = x + 1;
				try
				{
					Thread.sleep(300);
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("第一线程:"+x);
			}
		}
		class Dome1 extends Thread{
			private double x;
			public Dome1(double x) {
				this.x = x;
			}
			public void run() {
				while(true) {
					x = x +0.1;
					try
					{
						Thread.sleep(400);
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("第二个线程"+x);
				}
			}
		}
	}
}
