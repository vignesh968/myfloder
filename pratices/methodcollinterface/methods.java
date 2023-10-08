package methodcollinterface;

import java.util.*;

public class methods {
    public static void main(String a[]) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("grapes");
        System.out.println(" list to array object converstion:");
        Object arr[] = fruits.toArray();
        for (Object j : arr) {
            System.out.println(j);
        }
        System.out.println("-------------toArray by normal----------------");
        System.out.println("list to normal array converstion");
        String str[] = fruits.toArray(new String[0]);

        for (String t : str) {
            System.out.println(t);
        }
        System.out.println("-----isEmpty-------");
        List<Integer> nums = new ArrayList<>();
        System.out.println("check list empty or not: " + nums.isEmpty());

        System.out.println("-----parallelStream-------");
        // "default Stream<E> parallelStream()
        fruits.parallelStream().forEach(System.out::println);
        // default Stream<E> stream()
        System.out.println("-------stream--------");
        fruits.stream().forEach(p -> System.out.println(p));
        System.out.println("-----------spliterator------------");
        Spliterator<String> spliterator = fruits.spliterator();

        while (spliterator.tryAdvance(System.out::println))
            ;

        System.out.println("-------equals--------");
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");

        System.out.println("Are the lists equal? " + list1.equals(list2));


        System.out.println("------hashcode------");
        int hashCode = fruits.hashCode();

        System.out.println("Hash code of the list: " + hashCode);
    
    }
}
