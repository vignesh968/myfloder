package threadclass;
// while using thread to execute simatiniously of two thread 
class aa extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("hello");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {	e.printStackTrace();}
	}	}
}
class bb extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("hi");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {	e.printStackTrace();}

	}}
}
public class threadclass2 {

	public static void main(String[] args) {

		aa nA=new aa();
	bb na=new bb();
		nA.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {	e.printStackTrace();}

		na.start();
	}

}
