package threadclass;

class counter{
	 int c;
	public synchronized void increment()
	{
		c++;
	}
}
public class threadclass5 {

	public static void main(String[] args) throws InterruptedException {

		counter aCounter=new counter();
		Runnable ob1=()->
				{
			
				for(int i=0;i<6000;i++)
				{
				aCounter.increment();
				}
				};
	Runnable ob2=()->
		{
			for(int i=0;i<6000;i++)
			{
				aCounter.increment();		
			}
		};
	Thread t1=new Thread(ob1);
	Thread t2=new Thread(ob2);
		t1.start();
		t2.start(); 
		t1.join();
		t2.join();
		System.out.println(aCounter.c);
	}

}
