package threadclass;

import innerclass.innerclass;

public class threadpriority {

	public static void main(String[] args) {
		
Thread t1=new Thread(()->
{int c=0;
	for(int i=0;i<20;i++)
	{
		System.out.println(c++);
		try {
			Thread.sleep(10);
		} catch (Exception e) {e.printStackTrace();		}
	}
},"ceb thread");

Thread t2=new Thread(()->
{int c=0;
for(int i=0;i<20;i++)
{
System.out.println(c++);
try {
	Thread.sleep(10);
} catch (Exception e) {e.printStackTrace();		}
}
},"vicky thread");

System.out.println(t1.getName());
System.out.println(t2.getName());
t1.start();
t2.start();
	}

}
