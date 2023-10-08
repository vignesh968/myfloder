package ctsone;
class demo{
	
}
abstract class human extends demo{
	abstract public void add();
	public void behave()
	{
		System.out.println("bye men");
	}
}
class men extends human{
	public void add()
	{
		System.out.println("welcome you all ");
	}
}



public class Abstract1 {

	public static void main(String[] args) {
		human n=new human() {
			
			@Override
			public void add() {
			System.out.println("bye vicky");
			}
		};
		n.add();
		n.behave();
	}

}
