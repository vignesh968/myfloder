package methodcollinterface;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllMethod {
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


        ls.removeAll(list);

        System.out.println("after remove all of list2 in list 1:\n"+ls);
    }
}
