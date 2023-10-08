package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ctsone.bufferreader;

public class trywithresource {

	public static void main(String[] args) throws IOException {
		BufferedReader br=null;
		String aString;
//		try {
//			InputStreamReader in=new InputStreamReader(System.in);
//			 br=new BufferedReader(in);
//			 System.out.println("enter your name");
//			 aString=br.readLine();
//			 System.out.println("my name : "+ aString);
//		}
//	you can use 	both  of it 
		try {
			
			
			br=new 	BufferedReader(new InputStreamReader(System.in));
			
			 br=new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("enter your name");
			 aString=br.readLine();
			 System.out.println("my name : "+ aString);
		}
		
		
		finally {
			br.close();
		}
	}

}
