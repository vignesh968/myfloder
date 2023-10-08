package polymorphism;
class men{
	public void show() {
		System.out.println("hello");
	}
	public void show(int y) {
		System.out.println("super-para");
	}
}
class thing extends men
{
	public void show() {
		System.out.println("sub-no");
	}
	public void show(int y) {
	this.show();
		System.out.println("sub-para");
	}
}
public class overridingmethod {
public static void main(String[] args) {
	men a=new thing();
	a.show(9);
}
}
