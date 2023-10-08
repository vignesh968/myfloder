package polymorphism;
class vechile{
    private int speed;
    public void speedup()
    {
        speed+=10;
    }
    public int getseedup()
    {
        return speed;
    }
}
class car extends vechile
{
      public void speedup()
    {
     super.speedup();
     System.out.println("car incresed speed up to 12unit");

    }
  
}

class bicycle extends vechile
{
      public void speedup()
    {
     super.speedup();
     System.out.println("bicycle incresed speed up to 12unit");
        
    }}
public class poly1 {
    public static void main(String a[])
    {
     car n=new car();
     bicycle b=new bicycle();
     System.out.println("car initial speed "+ n.getseedup());
          System.out.println("bicycle initial speed "+ b.getseedup());
     n.speedup();
        b.speedup();
           System.out.println("car initial speed "+ n.getseedup());
          System.out.println("bicycle initial speed "+ b.getseedup());
    }
}
