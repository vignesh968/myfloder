package ctsone;
class typ{
	public void add()
	{
		System.out.println("byeee--------");
	}
}
class cast extends typ{
	public void add1()
	{
		System.out.println("welcome");
	}
}
public class typecasting {

	public static void main(String[] args) {
		typ nA=new typ();
		nA.add();
		
		
		cast p=(cast)nA;
		p.add1();
		
	}

}
