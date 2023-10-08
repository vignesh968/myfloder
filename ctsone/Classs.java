package ctsone;


class vicky{
	public String name(int cost) {
		 if(cost>3)
		 {
		return "pen";
		 }
		
			 return "nothing";
		
	}
}
public class Classs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=2;
    int n1=4;
    vicky n=new vicky();
    String lString=n.name(n1);
    System.out.println(lString);
	}

}
