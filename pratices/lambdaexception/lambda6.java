package lambdaexception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class lambda6 {
    public static void main(String a[]) 
  {
List<Integer> bin=Arrays.asList(4,3,2,3,5,67,8,9);
Function<Integer,Integer>fun=bn->Integer.toBinaryString(bn);
  
fun.forEach(K->System.out.print);
}
}
