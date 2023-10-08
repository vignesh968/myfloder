package collections.Listinterface;
import java.util.*;
public class list {
    public static void main(String a[])
    {
System.out.println("----------Arraylist-------------");
System.out.println("insertion order and allow dulipcate");
List<Integer>ls=new ArrayList<>();
ls.add(34);
ls.add(43);
ls.add(34);
ls.add(98);
ls.add(63);

Iterator<Integer>iter=ls.iterator();
while(iter.hasNext())
{
    System.out.println(iter.next());
}
System.out.println("----------Linkedlist-------------");
System.out.println("reverse order and allow dulipcate");
LinkedList<Integer>lk=new LinkedList<>();

lk.add(34);
lk.add(43);
lk.add(34);
lk.add(98);
lk.add(63);

Iterator iter2=lk.descendingIterator();
while(iter2.hasNext())
{
    System.out.println(iter2.next());
}


System.out.println("----------Vector-------------");
System.out.println("insertion order and allow dulipcate");
List<Integer>v=new Vector<>();
v.add(34);
v.add(43);
v.add(34);

v.add(98);

v.add(63);

Iterator<Integer>iter3=v.iterator();
while(iter3.hasNext())
{
    System.out.println(iter3.next());
}
}
}