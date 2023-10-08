package lambdaexception;

import java.util.*;

public class lambda2 {
    public static void main(String a[])
    {
    List<String>ls=Arrays.asList("vicky","vijay","ajith","suriya");
  List<String>h=Arrays.asList("VICKY","VIJAY","AJITH","SURIYA");

  System.out.println("-------to toUpperCase-----\n");
    ls.forEach(l->System.out.println(l.toUpperCase()));
    System.out.println("--------to toLowerCase-----\n");
    h.forEach(k->System.out.println(k.toLowerCase()));
    }
}
