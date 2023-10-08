package threadclass;

//class f implements Runnable
//{
//	
//}
//class h implements Runnable
//{
//	}
//}
public class threadclass4 {

	public static void main(String[] args) {

		Runnable ob1=new aa()
				{
			public void run()
			{
				for(int i=0;i<6;i++)
				{
				System.out.println("hello");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {	e.printStackTrace();}
			}	}
				};
	Runnable ob2=()->
		{
			for(int i=0;i<6;i++)
			{
			System.out.println("hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {	e.printStackTrace();}

		}
			};
	Thread t1=new Thread(ob1);
	Thread t2=new Thread(ob2);
		t1.start();
		t2.start(); 
	}

}
