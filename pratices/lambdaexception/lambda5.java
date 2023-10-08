package lambdaexception;
import java.util.*;
public class lambda5 {
    public static void main(String a[])
    {
        List<Double>d=new ArrayList<>();
        d.add( 4.34);
        d.add(4.53);
        d.add(8.23);
        d.add(4.345);
        d.add(9.3);


        int len=d.size();
     double res=   d.stream()
        .reduce(0.0,(c,e)-> (c+e)) ; // Adding a constant value of 0.5 to each element
       System.out.println(res/len);
    }

}
