package ctsone;
final class fin
{
	 public final void show( )
	    {
	        System.out.println("by vignesh : ");
	    }
	    public void div(int a,int b)
	    {
	        System.out.println("division  : "+a/b);
	    }	
}
class key extends fin
{
	public void show( )
    {
        System.out.println("by ram : ");
    }
 
}
public class finalKeyword {

	public static void main(String[] args) {
		 key n=new key();
		 n.show();
		 n.div(4, 2);
	}

}
