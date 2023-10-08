package interfaceclassjava;

//it prefer just to understand need of interface

interface computer{
	public void code();


}
class laptop implements computer{
	public void code()
	{
		System.out.println("code. complie .. run");
	}
}
class desktop implements computer{
	public void code()
	{
		System.out.println("code. complie .. run---- faster");
	}
}
class developer
{
	public void devapp(computer lap)
	{
		lap.code();
	}
}
public class needofinterface3 {

	public static void main(String[] args) {
		computer lp=new laptop();
		computer dv=new desktop();
		developer dever=new developer();
		dever.devapp(dv);
	}

}
