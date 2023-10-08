	package sort;
	import java.util.*;
	class vicky
	{
		 int rollno;
		 String name;
		int age;
		public vicky(int rollno,String name,int age)
		
		{
			this.rollno=rollno;
			this.name=name;
			this.age=age;
		}
		
		public String toString() {
			
			return "Student["+"rollno="+rollno+"name="+name+"age="+age+"]";
		}
	}
	public class comp {
	public static void main(String[] args) {
		Comparator<vicky> con=(p,f)->p.age>f.age?1:-1;
		
		List<vicky>p=new ArrayList<vicky>();
		p.add(new vicky(12, "vicky", 6));
		p.add(new vicky(123, "ram", 34));
		p.add(new vicky(13, "radsm", 32));
	Collections.sort(p,con.reversed());
	System.out.println(p);
	}
	}
