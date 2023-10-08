package enumss;

enum level{//enum class
	ged(1234),red(443),yellow(324);//enum objects
	private int value;
	level(int value) {
		this.value=value;
	}
	public int getvalue()
	{
		return value;
	}
}


enum status
{
	running,pending, failed, succeed
}
public class Enum {

	public static void main(String[] args) {
		
		System.out.println("----by direct  method---");
		//enum class
		for(level vLevel :level.values())
		{
			System.out.println(vLevel.name()+":  "+vLevel.getvalue());
		}
		
		System.out.println("----by create an array -----");
		level f=level.ged;
		level []ST=level.values();
		for(level s:ST)
		{
			System.out.println(s.name()+" ==>"+s.getvalue());
		}

	System.out.println("-----new enum object-----");
	status ft=status.failed;
	status []p=status.values();
	for(status s:p)
	{
		System.out.println(s+" : "+ s.ordinal()+ " = "+s.hashCode()+"//");
	}
	}

}
