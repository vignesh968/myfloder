package methodcollinterface;

import java.util.ArrayList;
import java.util.List;

public class RetainAll {
    // it check present or not
    
     public static void main(String a[])
    {
        List<Integer>ls=new ArrayList<>();
        ls.add(34);
        ls.add(45);
        ls.add(32);
        ls.add(98);

        List<Integer>list=new ArrayList<>();
        list.add(45);
        list.add(32);

        boolean res=ls.retainAll(list);
System.out.println("list 1: "+ls);
System.out.println("list 2: "+list);
System.out.println("result of RetainAll "+res);


    }
}
