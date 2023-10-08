package lambdaexception;
//Write a Java program to implement a lambda expression to
// filter out even and odd numbers from a list of integers.
import java.util.*;
import java.util.stream.Collectors;
public class lambda3 {
  public static void main(String a[]) 
  {
List<Integer> ls=Arrays.asList(4,3,2,3,5,67,8,9);

System.out.println("----- even numbers-----");
ls.stream()
		.filter(l->l%2==0)
    //    .collect(Collectors.toList())
        .forEach(l->System.out.print(l+" "));
        System.out.println();
System.out.println("----- odd numbers-----");
ls.stream()
		.filter(l->l%2!=0)
  //      .collect(Collectors.toList())
        .forEach(l->System.out.print(l+" "));


  } 
}
