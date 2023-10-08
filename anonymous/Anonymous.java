package ctsone;


class cs{
	public cs() {
		System.out.println("object created");
	}
	 public void show()
	 {
		 System.out.println("give me");
	 }
 }
public class Anonymous {

	public static void main(String[] args) {
		 new cs();
		 new cs().show();
		 
	}

}
