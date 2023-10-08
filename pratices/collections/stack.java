package collections;

import java.util.*;

public class stack {
    public static void main(String a[])
    {
    Stack<String> st=new Stack<>();
st.push("vicky");
st.push("vijay");
st.push("ajith");
st.push("suriya");
System.out.println(st);
System.out.println("pop : "+st.pop());
System.out.println(st);
System.out.println("peek : "+st.peek());
System.out.println(st);
System.out.println("\n-----looping or iterator-----");
Iterator<String>it=st.iterator();
while(it.hasNext())
{
    System.out.println(it.next());
}
    }
}
