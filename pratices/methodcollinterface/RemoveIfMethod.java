package methodcollinterface;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfMethod {
    public static void main(String a[])
    {
        List<Integer>ls=new ArrayList<>();
        ls.add(33);
        ls.add(45);
        ls.add(33);
         ls.add(31);
        ls.add(48);
        ls.add(39);
        ls.add(91);
        ls.add(98);
        ls.removeIf(e->e%10==3 );
         ls.removeIf(e->e%10==1 );
        System.out.println(ls);
    }  
}

//output
//[45, 48, 39, 98]