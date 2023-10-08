package exceptionhandling;
public class a {
    public static void main(String a[])
    {
        String sr=null;
        int j=0,p=43;
        try {
            System.out.println(sr.length());
        }
        catch (ArithmeticException e) {
System.out.println("not divided by zero  " );        }
catch(ArrayIndexOutOfBoundsException e)
{
    System.out.println("array limit not found");
}
catch(Exception e)
{
    System.out.println("something wrong please check Exception"+"\n"+e);
}
    }

}
