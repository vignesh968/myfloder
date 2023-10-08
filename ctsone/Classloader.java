package ctsone;
class clsloader
{
	static {
		System.out.println("in static block without creating object it call static ");
	}
}
public class Classloader {
 public static void main(String a[]) throws ClassNotFoundException {
	Class.forName("clsloader");
}
}
