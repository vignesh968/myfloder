package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student implements Comparable<student>
{
	int age;
	String name;
	public student(int age,String name)
	{
		this.age=age;
		this.name=name;
	}

	
	public String toString() {
		return "student [age=" + age + ", name=" + name + "]";
	}


	
	public int compareTo(student t1) {
		if(this.age>t1.age)
		{
			return 1;
		}
		return -1;
	}

	
	
}
public class classcompare2 {

	public static void main(String[] args) {

		Comparator<student>com=( o1,  o2)-> o1.age>o2.age?1:-1;
			
			
	List<student>stud=new ArrayList<student>();
		stud.add(new student(34, "vicky"));
		stud.add(new student(23, "ram"));
		stud.add(new student(22, "priya"));
		stud.add(new student(37, "raja"));
		Collections.reverse(stud);
		for(student s:stud)
		System.out.println(s);
	}

}
