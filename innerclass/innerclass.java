package innerclass;

class inner
{
	public void rt()
	{
		System.out.println("outer class");
	}
	class fd{
		public void show()
		{
			System.out.println("--inner class ---");
		}
	}
}
public class innerclass {

	public static void main(String[] args) {
		inner kInner=new inner();
		inner.fd ob=kInner.new fd();
		ob.show();
	}

}
