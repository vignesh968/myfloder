package enumss;

enum status
{
	running,pending, failed, succeed
}
public class enumwithifelse {

	public static void main(String[] args) {

		status l=status.running;
		if(l==status.running)
		{
			System.out.println("all going good");
		}
		else if(l==status.pending)
		{
		System.out.println("please wait ");
		}
		else if(l==status.failed)
		{
			System.out.println("failed try again later");
		}
	}

}
