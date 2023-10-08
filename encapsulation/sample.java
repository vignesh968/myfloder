package encapsulation;
class vicky
{
	private int rollno;
	private String name;
	private int age;
	public vicky(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getRollno()
	{
		return rollno;
	}
}
public class sample {
public static void main(String[] args) {
	vicky n=new vicky(101,"vicky",22);
	System.out.println(n.getRollno()+ " : "+n.getName()+" : "+n.getAge());
	n.setAge(12);
	n.setName("ram");
	n.setRollno(102);
	System.out.println("------------");
	System.out.println(n.getRollno()+ " : "+n.getName()+" : "+n.getAge());

	
}
}
