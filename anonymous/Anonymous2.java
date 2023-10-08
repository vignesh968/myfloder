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
public class Anonymous2 {

	public static void main(String[] args) {
		cs obCs= new cs()
				{
			public void show()
			 {
				 System.out.println("hy me");
			 }
				};
				obCs.show();
		 
	}

}
