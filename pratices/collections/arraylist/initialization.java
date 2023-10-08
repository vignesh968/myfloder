package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class initialization
{

    public static void main(String a[])
    {
        System.out.println("--initialization with add----");
        List<Integer>ls=new ArrayList<>();
ls.add(34);
ls.add(43);
ls.add(34);
ls.add(98);
ls.add(63);

System.out.println(ls);

System.out.println("-----using shorth and version of this method----");
List<Integer>l=new ArrayList<>()
{
{
    add(45);
    add(67);
    add(78);
    add(90);
}
};
System.out.println(l);

System.out.println("--- using asList----");
List<Integer> h=Arrays.asList(32,43,567,889,978);
System.out.println(h);
System.out.println("----- using List.of----------");
List<String> gfg = new ArrayList<>(List.of
("vicky","vijay","ajith"));
List<Integer> gf = new ArrayList<>(List.of
(7,8,89));
System.out.println(gf);
System.out.println("--- ArrayList using another collection----  ");
List<Integer>lis=new ArrayList<Integer>(h);
System.out.println(lis);
System.out.println("-------stream and collect------");
List<Integer>ps=Stream.of(23,34,657,89)
                .collect(Collectors.toCollection(ArrayList::new));
System.out.println(ps);
    }
}