package interfaceclassjava;
//it prefer just to understand need of interface
class laptop{
	public void code()
	{
		System.out.println("code. complie .. run");
	}
}
class developer
{
	public void devapp(laptop lap)
	{
		lap.code();
	}
}
public class needofInterface {

	public static void main(String[] args) {
		laptop lp=new laptop();
		developer dv=new developer();
		dv.devapp(lp);
	}

}
