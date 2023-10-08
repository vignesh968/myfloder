package threadclass;
// we can implement multi interface by using implement
interface abc{

void run();
}
class f implements Runnable,abc
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
}
class h implements Runnable
{
	public void run()
	{
		for(int i=0;i<6;i++)
		{
		System.out.println("hi");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {	e.printStackTrace();}

	}}
}
public class threadclass3 {

	public static void main(String[] args) {

		Runnable ob1=new aa();
	Runnable ob2=new bb();
	Thread t1=new Thread(ob1);
	Thread t2=new Thread(ob2);
		t1.start();
		t2.start();
	}

}
