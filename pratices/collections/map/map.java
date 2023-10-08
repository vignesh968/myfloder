package collections.map;
import java.util.*;
public class map {
    public static void main(String A[])
    {
        Map<String,Integer>m=new HashMap<String,Integer>();
        m.put("vicky",22);
        m.put("vijay", 40);
        m.put("ram", 44);
        m.put("gokul", 34);
System.out.println("-----containsKey--------");
        if(m.containsKey("ram"))
        {
            System.out.println(m.get("ram"));
        }
        else{
            System.out.println("not found");
        }
        System.out.println("-------------------------");
        for(Map.Entry<String,Integer> e  :m.entrySet())
        {
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
