package collections.sort;
import java.util.*;

class stud implements Comparable<stud>
{
 String name;
    public stud(String string) {
        name=string;
    }
    public int compareTo(stud o) {
return this.name.compareTo(o.name);
    }


}
public class collectionsort {
    public static void main(String a[])
    {
        List<stud>name=new ArrayList<stud>();
        name.add(new stud("vicky"));
       name.add(new stud("vijay"));
        name.add(new stud("ajay"));
Collections.sort(name);
for(stud k:name)
{
    System.out.println(k.name);
}
    }
}
