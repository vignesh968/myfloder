package Set;

import java.util.*;
public class set2 {

	public static void main(String[] args) {

		
		Set <Integer>s=new TreeSet<Integer>();
		s.add(526);
		s.add(758);
		s.add(940);
		s.add(904);
		s.add(45);
		s.add(4556); 
		
	Iterator<Integer>value=	s.iterator();
	while (value.hasNext()) {
		System.out.println(value.next());

	}
	}
	

}
