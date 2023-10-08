package statickey;
// we can access the  non static variable inside static method only in indirectly 

class staticwithnonstatic{
	String brand;
	int prize;
	static String name;
	static {
		name="vickyty";
	}
	public void show()
	{
		System.out.println(" brand : "+brand +" prize : "+prize+" name : "+name);
	}
	public static void showss(staticwithnonstatic ob)
	{
		System.out.println(" brand : "+ob.brand +" prize : "+ob.prize+" name : "+name);
	}
}

public class Staticpro3 {	
	public static void main(String[] args) {
		staticwithnonstatic ob=new staticwithnonstatic();
		staticwithnonstatic	ob1=new staticwithnonstatic();
		ob.brand="redmi";
		ob.prize=23;
		staticwithnonstatic.name="vicky";

		ob1.brand="samsung";
		ob1.prize=27;
		staticwithnonstatic.name="vijay";

		//ob.show();
		staticwithnonstatic.showss(ob);

	}

}
