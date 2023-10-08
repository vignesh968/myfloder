package ctsone;
//string buffer is thread safe
public class Stringbuffer {
	public static void main(String[] args) {
	StringBuffer sBuffer=new StringBuffer("vicky");
	System.out.println(sBuffer.capacity() );
	System.out.println(sBuffer.length());
	sBuffer.append(" ram");
	System.out.println(sBuffer);
     String a=sBuffer.toString();
     sBuffer.delete(1, 4);
     System.out.println(sBuffer);
	}
}
