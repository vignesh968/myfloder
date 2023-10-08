package collections.Qeque;
import java.util.*;
public class queuecollection {
    public static void main(String a[])
    {
        System.out.println("-----PriorityQueue by string-------");
     Queue<String>q=new PriorityQueue<>();

    
    q.add("VIJAYA");
     q.add("VIKRAM"); q.add("VICKY");
     q.add("VIJAY");
    System.out.println(q);
    System.out.println("----- PriorityQueue by integer ------");
Queue<Integer>f=new PriorityQueue<>();
// order by priority
        f.add(54);
        f.add(34);
        f.add(59);
        f.add(21);
        f.add(34);
   

        f.add(76);    
         f.poll();
        System.out.println(f);

        System.out.println("-----ArrayDeque-----");
    Queue<Integer>aq=new ArrayDeque<>();
        aq.add(54);
        aq.add(34);
        aq.add(59);
        aq.add(21);
        aq.add(54);
        aq.add(76);
        System.out.println(aq);

        System.out.println("-----Qeque -LinkedList-----");
      Queue<Integer> t=new LinkedList<>();
        t.add(54);
        t.add(34);
        t.add(59);
        t.add(21);
        t.add(54);
        t.add(76);
        System.out.println(t);
        Iterator<Integer> it=t.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
