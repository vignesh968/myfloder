package methodcollinterface;

import java.util.ArrayList;
import java.util.List;

public class ContainandAll {
        public static void main(String a[])
    {
        List<Integer>ls=new ArrayList<>();
        ls.add(34);
        ls.add(45);
        ls.add(32);
        ls.add(98);
        List<Integer>list=new ArrayList<>();
        list.add(34);
        ls.add(45);

        // contain method
        System.out.println("list contain : "+ls.contains(45));
        // contain all method
        boolean res=ls.containsAll(list);
        System.out.println("list containsAll : "+res);
        //        
        }
}
