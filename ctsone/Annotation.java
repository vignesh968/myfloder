package ctsone;

class an
{
public void showtomeaall () {
	System.out.println("in an show");
}	
}
class tion extends an
{
	@Override
public void showtomeaall() {//my spilling mistake
		System.out.println("in tion show");
	}	
}
public class Annotation {
   public static void main(String a[]) {
	   tion n=new tion();
	     n.showtomeaall();
   }
	
}

