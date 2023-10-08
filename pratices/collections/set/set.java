package collections.set;

import java.util.*;

public class set {
    public static void main(String a[])
    {
        System.out.println("-----------HashSet---=----");
      Set<Integer> sk=new HashSet<>();
        sk.add(45);
        sk.add(28);
        sk.add(null);
        sk.add(34);
        sk.add(27);
        sk.add(34);
        Iterator<Integer> it=sk.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
System.out.println();
        System.out.println("-----------LinkedHashSet---=----");
      Set<Integer> lset=new LinkedHashSet<>();
           lset.add(45);
        lset.add(28);
        lset.add(null);
        lset.add(34);
        lset.add(27);
        lset.add(34);

        Iterator<Integer> lh=lset.iterator();
        while (lh.hasNext())
        {
            System.out.print(lh.next()+" ");
        }
    }
}
