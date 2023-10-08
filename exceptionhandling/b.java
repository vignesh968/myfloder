package exceptionhandling;
public class b {
    public static void main(String a[])
    {

        int l=12;
        int b=0;
        
        try {
            b=8/l;
            if(b==0)// IF YOU DODNT want to print zero just use throw

            // throw new ArithmeticException(); 
            throw new ArithmeticException("i dont want to print zero");// if you want to pass message use this


        } catch (Exception e) {
            System.out.println(l/1);
            System.out.println("something wrong "+e);
        }
        System.out.println(b);
    }
}
