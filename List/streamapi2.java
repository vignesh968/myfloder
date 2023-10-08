package List;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//it show the for loop of different type and which will execute fast and reduce code
public class streamapi2 {
	public static void main(String[] args) {

		List<Integer> numsIntegers=Arrays.asList(4,2,9,45);
		int even=0,odd=0;
		System.out.println("enhance for loop");
		for(int f:numsIntegers)
		{
			System.out.println(f);
			
		}
	
		
		System.out.println("normal for loop");
		
		for(int i=0;i<numsIntegers.size();i++)
		{
			System.out.println(numsIntegers.get(i));
		}
		System.out.println("(nums.forEach) it take object of consumer ");
		Consumer< Integer>con=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		
		};
		numsIntegers.forEach(con);
	//or
		numsIntegers.forEach(c->System.out.println(c));

		
		System.out.println("redue above consumer by using lambda expression");
		Consumer<Integer>consumer=n->System.out.println(n); 
		numsIntegers.forEach(consumer);
		
		System.out.println("(foreach loop) it reduce from lambda expression");
		
		numsIntegers.forEach(n->System.out.println(n));
		
		
		
	}

}
