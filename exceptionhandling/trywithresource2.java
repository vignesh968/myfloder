package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trywithresource2 {

	public static void main(String[] args) throws IOException {
		String aString;
// if you have more method you cannot know which method closed
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{// it does'nt need finaly to close the method 
			// default bufferred extends closeable  and it with try no need finally 
			
						 System.out.println("enter your name");
			 aString=br.readLine();
			 System.out.println("my name : "+ aString);
		}
		
	
	}

}
