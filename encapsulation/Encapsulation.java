package encapsulation;
class Encap{
private String name;

public void set(String name)
{
	this.name=name;
}
public String get() {
	return name;
}
}
public class Encapsulation {

	public static void main(String[] args) {

		Encap n=new Encap();
		n.set("dssd");
		
		
System.out.println(n.get());
	}

}
