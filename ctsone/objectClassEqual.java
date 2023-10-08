package ctsone;

import java.util.Objects;

class equ
{
	String brand;
	int no;
	    public String toString()// it will execute  
	    {
			return "brand :"+brand +" number : "+no;
	    }
	    public  boolean equals(equ that) {
			return this.brand.equals(that.brand) && this.no==that.no;
		}
//		@Override
//		public int hashCode() {
//			return Objects.hash(brand, no);
//		}
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			equ other = (equ) obj;
//			return Objects.equals(brand, other.brand) && no == other.no;
//		}
}
public class objectClassEqual {

	public static void main(String[] args) {
       equ n=new equ();
       n.brand="vicky";
       n.no=32;
       equ n2=new equ();
       n2.brand="vicky";
       n2.no=32;
       boolean res=n.equals(n2);//if you use equals  in object you must use method to check
       System.out.println(res);
       System.out.println(n.toString());
	}

}
