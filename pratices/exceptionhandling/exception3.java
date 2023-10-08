package exceptionhandling;
class novowelException extends Exception
{
public novowelException(String s)
{
    super(s);
}
}
public class exception3 {
    public static void main(String a[])
    {
        
        try {
            String str="ssdklpgh";
        check(str);
System.out.println("string contion vowels");
        } catch (novowelException e) {
System.out.println(e);        }

    }
    public static void check(String a) throws novowelException
    {
        String n=a.toLowerCase();
        int f=0;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)=='a'||n.charAt(i)=='e'|| n.charAt(i)=='i'||n.charAt(i)=='o'|| n.charAt(i)=='u')
            {
                f=1;
            }
        }
        if( f==0){
             throw new novowelException("not contaion vowels");
        }
} 
}