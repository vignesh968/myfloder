package ctsone;
interface newread
{
	int add(int i, int j);
}
public class anonymouswithInterfaceReturn {

	public static void main(String[] args) {
		newread nRead=new newread() {
			
			@Override
			public int add(int i, int j) {
				return i*j;
			}
		};
		int a=nRead.add(7, 8);
		System.out.println("it my multiple : "+a);
	}

}
