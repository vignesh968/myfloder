package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamMethods {

	public static void main(String[] args) { 
		//filter
		List<Integer>ls=Arrays.asList(34,35,22,45,67);
		ls.stream()
		.filter(l->l%2==0)
		.map(l->l*l)
		.forEach(l->System.out.println(l));
		
		
		
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
System.out.println("---fil------");
		// Using a stream to filter names starting with 'A'
		names.stream()
		     .filter(name -> name.startsWith("A"))
.forEach(name->System.out.println(name));
		System.out.println("----------------");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Using a stream to calculate the sum of all numbers
		int sum = numbers.stream()
		                 .reduce(0,(c,e)->c+e);
		System.out.println("Sum: " + sum);
		System.out.println("------------------");
		List<String>pl=Arrays.asList("vicky","ram","hari","gokul");
		pl.stream()
		.sorted()
		.forEach(k->System.out.println(k));
	}
}
