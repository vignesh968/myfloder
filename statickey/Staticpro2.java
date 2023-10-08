package statickey;


class calling {
	static int a;
	public calling() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}
	static void Name()
	{
		 a=5;
		System.out.println("static block"+" \n"+"value of a : "+a);
	}
}
public class Staticpro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calling n=new calling();
		calling n2=new calling();	
calling.Name();
	}

}
