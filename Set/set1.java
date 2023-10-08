package Set;

import java.util.*;
public class set1 {

	public static void main(String[] args) {
System.out.println("------hashset------");
		Set <Integer>set=new HashSet<Integer>();
		set.add(56);
		set.add(78);
		set.add(90);
		set.add(45);
		set.add(90);

		set.add(78);
set.add(45);
		System.out.println(set);
		for(int h:set)
		{
			System.out.println(h);
		}
		System.out.println("------treeset----");
		Set <Integer>s=new TreeSet<Integer>();
		s.add(526);
		s.add(758);
		s.add(940);
		s.add(904);
		s.add(45);
		s.add(4556);
		System.out.println(s);
		for(int h:s)
		{
			System.out.println(h);
		}
	}
	

}
