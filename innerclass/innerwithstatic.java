package innerclass;


class innerss
{
	public void rt()
	{
		System.out.println("outer class");
	}
static	class fd{
		public void show()
		{
			System.out.println("--inner class ---");
		}
	}
}
public class innerwithstatic {

	public static void main(String[] args) {
		innerss kInner=new innerss();
		innerss.fd ob=new innerss.fd();
		ob.show();
	}

}
