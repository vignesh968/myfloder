package exceptionhandling;

public class exception5 {
  public static void main(String a[])
  {
    try {
int arr[]=new int[4];
arr[4]=30/0;
}
catch(ArithmeticException e)
{
    System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e)
{
    System.out.println(e);
}

catch (Exception e) {
        // TODO: handle exception
e.printStackTrace();    }
  }  
}
