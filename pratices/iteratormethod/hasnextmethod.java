package iteratormethod;
import java.util.*;
public class hasnextmethod {
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
        System.out.println("has next element : "+it.hasNext());
        System.out.println("next elements : "+it.next());
    }
   } 
}
