package polymorphism;
class animal{
	public void sound()
	{
		System.out.println("welcome to animal  sounds ---------------------");
	}
}
class pig extends animal{
	public void sound()
	{
		System.out.println("pig sound---------------------");
	}
}
class dog extends pig{
	public void sound()
	{
		System.out.println("dog sound---------------------");
	}
}
class cow extends dog{
	public void sound()
	{
		System.out.println("cow sound---------------------");
	}
}

public class Polymorphism2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal n=new animal();

		animal n1=new pig();
		animal n2=new cow();

		n.sound();
		n1.sound();

		n2.sound();

	}

}
