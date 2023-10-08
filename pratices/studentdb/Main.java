package studentdb;
import java.util.*;


public class Main {
    public static void main(String a[])
    {   Scanner s=new Scanner(System.in);
        List<student>stud=new ArrayList<student>();
        while(true)
        {
            System.out.println("rollno:");
            int st=Integer.parseInt(s.nextLine());
            System.out.println("enter name:");
            String b=s.nextLine();
            System.err.println("enter age");
            int age=Integer.parseInt(s.nextLine());
          student n=new student();
            n.setAge(age);
            n.setId(st);
            n.setName(b);
            stud.add(n);
            System.out.println("add data");
            System.out.println("enter y/n");
            String con=s.nextLine();
            if(!con.equalsIgnoreCase("y"))
        {
            break;
        }
        }
        for(student d:stud)
        {
        System.out.println(d.getId()+" : "+d.getName()+" : "+d.getAge());
}}}
