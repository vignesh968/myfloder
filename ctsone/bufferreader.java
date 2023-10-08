package ctsone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferreader {

	public static void main(String[] args) throws IOException {

		
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		System.out.println("enter a string");
		String s=bf.readLine();
		System.out.println("enter a number");
	int num=Integer.parseInt(bf.readLine());
	System.out.println(s);
	System.out.println(num);
	}

}
