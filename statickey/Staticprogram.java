package statickey;

// when  you use static you can direct use classname.methodname and classname.set  or .get  instant of obj.methodname
public class Staticprogram {
	static int num;
	static String  name;
	static  void set(int b, String c)
	{
		num=b;
		name=c;
	}
	static  void get()
	{
		System.out.println("my rollno : "+num+" \n"+ "my name : "+name);
	}
	public static void main(String[] args) {
		int a=5;
		int b=10;
		String c="vicky";
		Staticprogram.set(b,c);
		Staticprogram.get();
		
	}

}
