package List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//doublle the even number and sum 
public class streamapi3 {
	//type 2
// for loop ->stream <Integer> -> .stream() -->it get optimise of code
	public static void main(String[] args) {

		List<Integer> nums=Arrays.asList(4,2,9,45);// it can use more time no limits
	Stream<Integer>s1=nums.stream();//it can only one time useable 	
	Stream<Integer>s2=s1.filter(n->n%2==0);//so we create each time for each operator
	Stream< Integer>s3=s2.map(n->n*2);
	s3.forEach(n->System.out.println(n));
	
	System.out.println("reduce method it doesn't create new stream");
	List<Integer> n=Arrays.asList(2,3,4,6,7,8);// it can use more time no limits
Stream<Integer>st1=n.stream();//it can only one time useable 	
Stream<Integer>st2=st1.filter(m->m%2==0);//so we create each time for each operator
Stream< Integer>st3=st2.map(m->m*2);
int result=st3.reduce(0,(c,e)->c+e );
System.out.println(result);
// type 3

List<Integer> ns=Arrays.asList(2,3,4,6,7,8);// it can use more time no limits

System.out.println("it more simple and fast ");
int res=ns.stream()
		.filter(p->p%2==0)
		.map(p->p*2)
		.reduce(0,(c,e)->c+e);
	System.out.println(res);
	}
 
}
