package ctsone;

public class wrapperclass {

	public static void main(String[] args) {
		int a=1;
		Integer b=a;
		Integer n=new Integer(a);
		char s='a';
		Character v=s; 
		
		System.out.println("autoboxing");
		System.out.println();
		Character vp=new Character(s);
		System.out.println("Integer : "+b+"\n"+"Integer : "+n);
		System.out.println("Character : "+v+"\n"+"Character : "+vp);
		System.out.println();
		System.out.println("unboxing");
		System.out.println();
		int d=b;
		char g=v;
		System.out.println("int : "+d+ "char : "+g);
	}

}
