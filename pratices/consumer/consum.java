package consumer;

import java.util.*;

public class consum {
public static void main(String a[])
{
    List<Integer> l=Arrays.asList(23,45,56,78,54,2,45,78);
    l.stream()
    .filter(h->h%2==0)
    .allMatch(n->)
    .sorted()
    .forEach(k-> System.out.println(k));

}
    
}
