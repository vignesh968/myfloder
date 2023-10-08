package ctsone;
class a extends Object{
	    public a()
	    {
	    	System.out.println("in a");
	    }
	    public a(int b) {
	    	super();
	    	System.out.println("in a int");

	    }
}
class b extends a  {
	public b()
	{
		System.out.println("in B");
	}
	public b(int h)
	{
		System.out.println("in B int ");
	}
	
}

public class Thisandsuper {

	public static void main(String[] args) {
		a obj=new a(43);
		System.out.println("------------------------below it  call by default super key word");
		b obj2=new b(5);

	}

}
