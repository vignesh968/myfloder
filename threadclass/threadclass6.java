package threadclass;
//we can use multithread without extends of thread or implement thread 
//by below methods 

public class threadclass6 {

	public static void main(String[] args) throws InterruptedException {

		Thread t2=new Thread(()->
				{
			
				for(int i=0;i<10;i++)
				{
				System.out.println("hello");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {	e.printStackTrace();}
			}	
				});
				Thread t1=new Thread(()->
		{
			for(int i=0;i<10;i++)
			{
			System.out.println("hi");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {	e.printStackTrace();}

		}
			});
	
		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {e.printStackTrace();
		}
		t2.start(); 
		System.out.println(t1.isAlive());
		t1.join();// it used  for balance process to wait
		t2.join();//while thread complete then it execute.
	System.out.println("bye");
	}

}
