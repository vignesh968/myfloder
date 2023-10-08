package ctsone;
interface  abs
{
	public abstract void show(int a,int b ); 
	
}

public class abstract2 {
public static void main(String[] args) {
	abs s=(a,b)-> System.out.println(a*b);			
	
	s.show(8,6);
}
}
