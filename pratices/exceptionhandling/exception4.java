package exceptionhandling;
//Write a Java program that reads a list of integers from the user 
//and throws an exception if any numbers are duplicates.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class arrException extends Exception
{
    public arrException(String a)
    {
        super(a);
    }
}
public class exception4 {
    public static void main(String a[])
    {
        try {
            List<Integer> num=numoflist();
            check(num);
            System.out.println("no duplicates");
        } catch (arrException e) {
System.out.println(e);        }
    }
   
    public static List<Integer> numoflist()
    
    {
        List<Integer> ls=new ArrayList<>();
        ls.add(34);
        ls.add(323);
        ls.add(374);
        ls.add(876);
        return ls;

    }
    public static void check(List <Integer> ns) throws arrException
    {
        Set<Integer>st=new HashSet<>();
        for(Integer n:ns)
        {
            if(st.contains(n))
            {
                throw new arrException("error");
            }
            st.add(n);
        }
    }
}
