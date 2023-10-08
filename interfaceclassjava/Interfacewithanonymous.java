package interfaceclassjava;
interface wal{
	public void name();
}
public class Interfacewithanonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wal obWal=new wal() {
			
			@Override
		    	public void name() {
				System.out.println("we are welcome you");
			}
		};
		obWal.name();
	}

}
