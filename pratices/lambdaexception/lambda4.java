package lambdaexception;
//Write a Java program to implement a
// lambda expression to sort a list of strings in alphabetical order.

import java.util.*;
public class lambda4 {
    public static void main(String a[])
    {
        List<String> st=Arrays.asList("red", "green", "blue", "black", "pink");
        st.stream()
            .sorted()
            .forEach(s-> System.out.print(s+"  "));
    }
}
