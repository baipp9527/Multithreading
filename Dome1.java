package zuoye_1972;

public class Dome1
{
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		dm1 num1 = new dm1(0);
		dm2 nu = new dm2(0);
		Thread th = new Thread(nu);
		th.start();
		num1.start();
	}

}
