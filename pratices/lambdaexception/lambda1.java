package lambdaexception;
//Write a Java program to implement a lambda expression to
// check if a given string is empty.
import java.util.function.Predicate;

interface str1{
public void stremp(String emp);
}
public class lambda1 {
    public static void main(String a[])
    {
Predicate<String>p=emp->emp.isEmpty();
String str1 = ""; // empty string
String str2 = "Java lambda expression!"; 
System.out.println(p.test(str1));
System.out.println(p.test(str2));

    }
    
}
