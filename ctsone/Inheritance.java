package ctsone;
 class supcls
{

final public void name()
	{
		System.out.println("we come you all ");
	}
}
class subcls extends supcls{
	public void name()
	{
		System.out.println("we come you all at my show ");
	}
}
public class Inheritance {

	public static void main(String[] args) {

		subcls n=new subcls();
		n.name();
	}

}
