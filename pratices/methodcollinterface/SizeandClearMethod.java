package methodcollinterface;

import java.util.ArrayList;
import java.util.List;

public class SizeandClearMethod {
       public static void main(String a[])
    {
        List<Integer>ls=new ArrayList<>();
        ls.add(34);
        ls.add(45);
        ls.add(32);
        ls.add(98);
        int len=ls.size();

        System.out.println("length of list : "+ len);
        ls.clear();
        System.out.println("print after clear method used: ");
    }
}
