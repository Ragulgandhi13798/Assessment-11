package methofmultithreading;

public class Sleepmeth extends Thread{
	
	public void run()
	{
	     for(int i=1; i<8; i++)
		{
	
			try {
				Thread.sleep(1000);
			}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		System.out.println(i);
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Sleepmeth s1 = new Sleepmeth();
		Sleepmeth s2 = new Sleepmeth();
		
		s1.start();
		s2.start();
	}

}
