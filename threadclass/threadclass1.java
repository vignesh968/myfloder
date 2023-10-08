package threadclass;


// without using sleep it not get waited for 
//another thread to get waited
class a extends Thread
{
	public void run()
	{
		for(int i=0;i<30;i++)
		{
		System.out.println("hello");
	}	}
}
class b extends Thread
{
	public void run()
	{
		for(int i=0;i<30;i++)
		{
		System.out.println("hi");
	}}
}
public class threadclass1 {

	public static void main(String[] args) {

		a nA=new a();
	b na=new b();
		nA.start();
		na.start();
	}

}
