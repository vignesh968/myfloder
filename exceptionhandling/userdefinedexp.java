package   exceptionhandling;
class vickyException extends Exception{
public vickyException(String eleString)
{
    super(eleString);// passing the string to print 
}
}
public class userdefinedexp {
    public static void main(String a[])
    {
int s=12,i=0;
try {
    i=s/30;
    if(i==0)
     throw new vickyException("hey i dont want to print zero");
} catch (vickyException e) {
    System.out.println("default value : "+1);

System.out.println("something wrong "+e);
}
    }
}
