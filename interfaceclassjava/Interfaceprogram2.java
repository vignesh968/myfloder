package interfaceclassjava;
interface writer
{
	void show();
	public default void eat()
	
	{
		System.out.println("it from writer");
	}
}
interface reader
{
	void run();
	public default void eat()
	
	{
		System.out.println("it from reader");
	}
}
class pepole implements writer,reader
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		reader.super.eat();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("runner");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("shower");
	}
	
}
public class Interfaceprogram2 {

	public static void main(String[] args) {

		pepole n=new pepole();
		n.eat();
		n.show();
		n.run();
	}

}
