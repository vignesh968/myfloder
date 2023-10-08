package enumss;
enum lev{
	low,high,medium
}



public class Enum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lev myLevel=lev.high;
		switch (myLevel) {
		case low:
			System.out.println("low level");
			break;
		case medium:
			System.out.println("medium level");
			break;
		case high:
		 System.out.println("high level");
		 break;
		default:
			System.out.println("something wrong");			break;
		}
	}
}
