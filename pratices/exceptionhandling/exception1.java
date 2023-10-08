package exceptionhandling;

public class exception1 {
    public static void main(String a[])
    {
        int p=7;
        trynumber(p);
         p=8;
        trynumber(p);

    }
    public static void trynumber(int p)
    {
try {
    addprint(p);
    System.out.println("result :"+p);
} catch (ArithmeticException e) {
System.out.println("error : "+e.getMessage());
}
    }
    public static int addprint(int p)
    {
          if(p%2!=0)
          {
            throw new ArithmeticException("NUMBER CANNOT BE ODD");
          }
return p;
    }
}
