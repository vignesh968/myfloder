package stringbufferandbuilder;

public class Stringbuffer2 {
    /**
     * @param a
     */
    public static void main( String a[])
    {
            StringBuffer buffer=new StringBuffer();
        buffer.append("vicky");
        buffer.append("ram");
        String str="hari";
        System.out.println("-- toCharArray---");
        buffer.append(str);
        int len=buffer.length();
        System.out.println(len);
        String st=buffer.toString();
        for(char c:st.toCharArray())
        {
        System.out.print(c+" ");
        }
        System.out.println("---- insert---");
         buffer.insert(1,"vooo");
         System.out.println(buffer+" ");
                  System.err.println("-----");
buffer.replace(0, 4, "bye");
System.out.println(buffer);
buffer.delete(3, 8);
System.err.println("-----");

System.out.println(buffer);
System.err.println("-----");

buffer.capacity();
System.out.println(buffer);  
System.out.println("------");
buffer.toString();
System.out.println(buffer);
System.err.println("-----");
buffer.setCharAt(0, 'r');
System.out.println(buffer);
System.err.println("-----");

System.out.println(buffer.substring(3));
System.err.println("-----");

System.out.println(buffer.indexOf("hari"));
}
}
