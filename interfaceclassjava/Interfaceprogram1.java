package interfaceclassjava;

interface writer// decalre method type-1
{
	int a=5;
	void show();
	
}
interface reader //define method by using static 
{
	void show();

	public static void eat()
	
	{
		System.out.println("hey it eat");
	}
}
interface sleep //define method by using default 
{
	void show();

	public default void slepper()
	
	{
		System.out.println("hey it me");
	}
}class pen implements writer, sleep {
    public void show() {
        System.out.println("it is interface");
    }
    
    public void slepper() {
        System.out.println("hey it's me");
    }
}

public class Interfaceprogram1 {
    public static void main(String[] args) {
        writer nWriter = new pen();
        nWriter.show(); // from pen class
        
        reader.eat(); // from reader interface directly using interface name
        
        sleep sp = new pen(); // Now, pen implements the sleep interface, so this works
        sp.slepper();
    }
}
