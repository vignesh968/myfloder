package ctsone;

import java.util.*;
class Engine
{
	private String type;
	public Engine(String type)
	{
		this.type=type;
	}
	public void start()
	{
		System.out.println("egine get starting bro------------");

	}
	public void stop()
	{
		System.out.println("egine get stoping bro------------");

	}
}
class Car{
	private String carname;
	private Engine type;
	public Car(String name,String engtype)
	{
		this.carname=name;
		this.type=new Engine(engtype);
	}
	public void startcar()
	{
		System.out.println("car get started ");
		type.start();
	}
	public void stopcar()
	{
		System.out.println("car get stoped");
		type.stop();
	}
}

public class Composition {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String a=s.next();
	String b=s.next();
	Car k=new Car(a,b);
	k.startcar();
	k.stopcar();
	}

}
