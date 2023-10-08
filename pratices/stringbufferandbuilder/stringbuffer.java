package stringbufferandbuilder;
import java.util.*;

import collections.stack;
public class stringbuffer {
    public static void main(String a[]){
     
    //     StringBuffer buffer=new StringBuffer();
    //     buffer.append("vicky");
    //     buffer.append("ram");
    //     String str="hari";
    //     buffer.append(str);
           StringBuffer nt=new StringBuffer();
        
for(int i=0;i<100;i++)
{
    nt.append("vicky");
}       
long startT = System.currentTimeMillis();  

System.out.println((System.currentTimeMillis() - startT)  );
   
        StringBuilder n=new StringBuilder();
for(int i=0;i<100;i++)
{
    n.append("vicky");
}       
long startTime = System.currentTimeMillis();  

System.out.println((System.currentTimeMillis() - startTime)  );
 }
}
