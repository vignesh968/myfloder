package interfaceclassjava;

interface mark
{
	
}
class use implements mark{
	private String name;
	private String gmail;
	public use(String name,String gmail)
	{
		this.name=name;
		this.gmail=gmail;
	}
	public String getString()
	{
		return "{employee : " +'"'+name+" gmail : "+gmail+'"'+"}";
	}
	
}
public class markInterface {

	public static v  oid main(String[] args) {
		use nUse=new use("vicky","vigneshd235@gmail.com");
		System.out.println(nUse.getString());
	}

}
