package List;

import java.util.Arrays;
import java.util.List;
public class streamapi1 {
//type 1;
	public static void main(String[] args) {

		List<Integer> numsIntegers=Arrays.asList(4,2,9,45);
		int even=0,odd=0;
		for(int f:numsIntegers)
		{
			if(f%2==0)
			{
			
			even+=f*2;
			}
			if(f%2!=0)
			{
				odd+=f*2;
			}
			
		}
	System.out.println("even: "+even+" odd : "+odd);
	}

}
