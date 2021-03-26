package methofmultithreading;

public class Joinmeth extends Thread {
	
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
		
		Joinmeth j1 = new Joinmeth();
		Joinmeth j2 = new Joinmeth();
		Joinmeth j3 = new Joinmeth();
		
		j3.start();
		try
		{
			j3.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		j1.start();
		j2.start();
		
	}
		// TODO Auto-generated method stub

	
}
