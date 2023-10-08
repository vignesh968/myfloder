package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student 
{
	int age;
	String name;
	public student(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "student [age=" + age + ", name=" + name + "]";
	}
	
}
public class classcompare {

	public static void main(String[] args) {

//		Comparator<student>com=new Comparator<student>() {
//		public int compare(student t1,student t2)
//		{
//			if(t1.age>t2.age)
//			{
//				return 1;
//			}
//			else {
//				return -1;
//			}
//		}
//		};		both are same 
		Comparator<student>com=( o1,  o2)-> o1.age>o2.age?1:-1;
			
			
	List<student>stud=new ArrayList<student>();
		stud.add(new student(34, "vicky"));
		stud.add(new student(23, "ram"));
		stud.add(new student(22, "priya"));
		stud.add(new student(37, "raja"));
		Collections.sort(stud,com.reversed());
		for(student s:stud)
		System.out.println(s);
	}

}
