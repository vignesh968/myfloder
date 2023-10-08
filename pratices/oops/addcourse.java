package oops;

import java.util.ArrayList;

class sc_student
{
    private String st_name;
    private int grade;
   private ArrayList<String> course;
  
    public sc_student(String st_name, int grade) {
        this.st_name = st_name;
        this.grade = grade;
        this.course=new ArrayList<String>();
    }
    public void addcourse(String coursestr)
    {
        course.add(coursestr);
    }
     public void removecourse(String coursestr)
    {
        course.remove(coursestr);
    }
    
    public int getGrade() {
        return grade;
    }
    public String getSt_name() {
        return st_name;
    }
 public void print()
 {
    System.out.println("name : "+st_name);
    System.out.println("grade : "+grade);
 }
    public ArrayList<String> getcourse()
    {
        return course;
    }
}
public class addcourse {
    public static void main(String a[])
    {
        sc_student n1=new sc_student("vicky",9);
        sc_student n2=new sc_student("ram",7);
        sc_student n3=new sc_student("soni", 8);
        n1.print();
        n2.print();
        n3.print();
        System.out.println("adding course for "+n1.getSt_name());
        n1.addcourse("math");
        n1.addcourse("python");
        n1.addcourse("java");
        System.out.println(n1.getSt_name()+"--"+n1.getcourse());
    } 
}
