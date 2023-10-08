package exceptionhandling;
class run{
    public void show() throws Exception
    {
        Class.forName("demo");
    }
}
public class duckException {
    public static void main(String a[]) 
    {
        run n=new run();
        try {
            n.show();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("class not found");
            // e.printStackTrace();
        }
    }
}
