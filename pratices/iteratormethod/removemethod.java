package iteratormethod;

import java.util.*;


public class removemethod {
    public static void main(String a[])
   {
List<String>names=new ArrayList<>();
names.add("vicky");
names.add("vijay");
names.add("ajith");
names.add("suriya");
Iterator<String> it = names.iterator();
it.next();
it.remove();
System.out.println("after remove first elements");
System.out.println(names);

}
}