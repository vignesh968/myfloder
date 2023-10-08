package ctsone;

public class Clonemethod  implements Cloneable{

	protected Object  clone()
throws CloneNotSupportedException
{
	return super.clone();
}
String name="vicky";

	public static void main(String a[])
	{
		Clonemethod ob=new Clonemethod();
		try {
			Clonemethod ob2=(Clonemethod)ob.clone();
			System.out.println(ob2.name);
		} catch (CloneNotSupportedException e) {
e.printStackTrace();
}
	}
}
