package methodcollinterface;

import java.util.ArrayList;
import java.util.List;

public class addallmethod {
     public static void main(String a[])
    {
        List<Integer>ls=new ArrayList<>();
        ls.add(34);
        ls.add(45);
        ls.add(32);
        ls.add(98);
        List<Integer>list=new ArrayList<>();
          list.addAll(ls);
        System.out.println(list);
    }
}
