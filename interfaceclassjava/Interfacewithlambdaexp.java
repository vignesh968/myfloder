package interfaceclassjava;
//  
@FunctionalInterface
// functional interface means it should have only one method in iterface
// then only lambda expresion works
//functional interface  is also called as SAM
interface read
{
	public void add(int i);
}
//interface write
//{
//	public void sub(int i);
//}
public class Interfacewithlambdaexp {
	
	public static void main(String a[]) {
		read n=(int i) ->
System.out.println("hi it me vignesh : "+i);	
// we can use like this also
//read n= i ->
//System.out.println("hi it me vignesh : "+i);		
n.add(5);






//write k=(int l)->System.out.println("it my num : "+l);
//k.sub(7);

	}
	 
}
