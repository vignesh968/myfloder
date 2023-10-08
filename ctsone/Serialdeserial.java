package ctsone;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Test  implements java.io.Serializable{
	public int a;
	public	String b;
 Test(int a, String b)
 {
	 this.a=a;
	 this.b=b;
 }
}
public class Serialdeserial{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Test n=new Test(1,"vicky");
			String aString= "file.ser";
			try {
	FileInputStream f=new FileInputStream(aString);
	ObjectInputStream o=new ObjectInputStream(f);
	o.resolveObject(n);  // Use writeObject to serialize the object
	o.close();
	f.close();
	System.out.println("Object has been serialized");
			}
			catch (IOException e) {
				System.out.println("IOException ");
			}
			Test obj1=null;
			try {
				FileInputStream ff=new FileInputStream(aString);
				ObjectInputStream oo=new ObjectInputStream(f);
				obj1=(Test)oo.readObject();
				oo.close();
				ff.close();
				System.out.println("Object has been deserialized ");
	            System.out.println("a = " + obj1.a);
	            System.out.println("b = " + obj1.b);
	        }
	         
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	}
	}


