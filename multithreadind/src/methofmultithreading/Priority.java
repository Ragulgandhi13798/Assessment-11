package methofmultithreading;

public class Priority extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		Priority p1 = new 	Priority();
		Priority p2 = new 	Priority();
		Priority p3 = new 	Priority();
		

		p1.start();
		p2.start();
		p3.start();  
		
		p1.setName("hi");
		p1.setPriority(MAX_PRIORITY);
		p2.setName("hello");
		p2.setPriority(MIN_PRIORITY);
		p3.setName("mmm");
		p3.setPriority(NORM_PRIORITY);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
