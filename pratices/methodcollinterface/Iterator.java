package methodcollinterface;

import java.util.*;
  // Import Iterator from java.util

public class Iterator {
    public static void main(String a[])
    {
        List<Integer>ls=new ArrayList<>();
        ls.add(34);
        ls.add(45);
        ls.add(32);
        ls.add(98);
Iterator<Integer>its=ls.iterator();
while(its.hasNext())
{
    System.out.print(its.next()+" ");
}
    }
}

