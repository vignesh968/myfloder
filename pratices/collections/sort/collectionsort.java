package collections.sort;

import java.util.*;
public class collectionsort {
    public static void main(String s[])
    {
        List<Integer>ls=new ArrayList<>();
ls.add(34);
ls.add(43);
ls.add(34);
ls.add(98);
ls.add(63);
Collections.sort(ls, Collections.reverseOrder());
Iterator<Integer>it=ls.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }  
    }
}
