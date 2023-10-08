package polymorphism;

//method overloading
class cal
{
	private int a;
	private int b;
	private int c;
	public void setFun()
	{
		a=3;
		b=5;
		//	System.out.println(2*3);
	}
	public int getFun()
	{
		return a*b;
	}
	public void setFun(int a,int b )
	{
		this.a=a;
		this.b=b;
		//	System.out.println(2*3);
	}
	
	
	public void setFun(int a , int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int getFun1()
	{
		return a*b*c;
	}
}

public class polymorphism3 {
	public static void main(String[] args) {
		cal nCal=new cal();
		nCal.setFun(2,3,7);
	System.out.println(nCal.getFun1());
	}

}
