package interfaceclassjava;

//it prefer just to understand need of interface

class computer{
	public void code() {
		
	}


}
class lap extends computer{
	public void code()
	{
		System.out.println("code. complie .. run");
	}
}
class desktop extends computer{
	public void code()
	{
		System.out.println("code. complie .. run---- faster");
	}
}
class dev
{
	public void devapp(computer lap)
	{
		lap.code();
	}
}
public class needofInterface2 {

	public static void main(String[] args) {
		computer lp=new lap();
		computer dv=new desktop();
		dev dever=new dev();
		dever.devapp(lp);
	}

}
