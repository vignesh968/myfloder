package interfaceclassjava;
interface newrd
{
	int add(int i, int j);
}
public class InterfacewithLambdaExp2 {

	public static void main(String[] args) {
		
		
//		newrd nRead=(int i, int j)-> {
//				return i*j;
//			};
		// both are same
		newrd nRead=( i, j)-> i*j;// defaultly it reaturn type

		int a=nRead.add(7, 8);
		System.out.println("it my multiple : "+a);
	}

}
