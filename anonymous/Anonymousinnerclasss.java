package ctsone;

class SA
{
	public void show()
	{
		System.out.println("outer class");
	}
}
public class Anonymousinnerclasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SA ob=new SA()
				{
			public void show()//ANONYMOUS CLASS /// INNER CLASS
			{
				System.out.println("hy it's me inner class");
			}
		
			};
			ob.show();
				}

}
