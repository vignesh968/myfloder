package ctsone;
class animals{
	public void sound()
	{
		System.out.println("welcome to animal  sounds ---------------------");
	}
}
class pigs extends animals{
	public void sound()
	{
		System.out.println("pig sound---------------------");
	}
}
class dogs extends pigs{
	public void sound()
	{
		System.out.println("dog sound---------------------");
	}
}
class cows extends dogs{
	public void sound()
	{
		System.out.println("cow sound---------------------");
	}
}

public class Dynamicdispatch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animals n=new dogs();
		n.sound();
		n=new cows();
		n.sound();


	}

}
