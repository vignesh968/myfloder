package encapsulation;


class vy{
	private int age;
	private String name; 

public void setage(int n)
{
	age=n;
}public void setname(String name)
{
	this.name=name;
}
public int getage() {
	return age;
}
public String getname() {
	return name;
}
}


public class Encapsulation2 {

	public static void main(String[] args) {
vy n=new vy();
n.setage(23);
n.setname("vicky");
System.out.println(n.getage() +  "   "+n.getname());
	}

}
