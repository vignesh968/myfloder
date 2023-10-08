package iteratormethod;

import java.util.*;

public class nextmethod {
    public static void main(String a[])
   {
List<String>names=new ArrayList<>();
names.add("vicky");
names.add("vijay");
names.add("ajith");
names.add("suriya");
Iterator<String> it = names.iterator();
    while(it.hasNext())
    {
        String element=it.next();
        System.out.println("Next Element : "+element);
    }

}

}