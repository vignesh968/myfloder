package exceptionhandling;
class notoneException extends Exception
{
	public notoneException(String mess)
	{
		super(mess);
	}
}
public class c {
public static void main(String[] args) throws notoneException {
	try {
		int a=9;
		int b=9;
		int y=a/b;
		if(y==1)
		{
			throw new notoneException("value should not be one");
		}
		System.out.println(a/b);
	} catch (notoneException e) {
System.out.println(e.getMessage());
}
}
}
