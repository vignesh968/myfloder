    package encapsulationpractice;

    import java.util.*;
import java.util.ArrayList;
import java.util.List;
    class student
    {
        private int id;
        private String stname;
        private List< Double > grade;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStname() {
        return stname;
    }
    public void setStname(String stname) {
        this.stname = stname;
    }
    public List<Double> getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
    if(this.grade==null)
    {
        this.grade=new ArrayList<>();
    }
    this.grade.add(grade);
    }

    }
    public class encap76 {
        public static void main(String a[])
    {
    student s=new student();
        s.setId(12);
        s.setStname("vicky");
        s.setGrade(98.0);
        s.setGrade(91.0);
        s.setGrade(87.0);
        s.setGrade(78.0);
        int st_id=s.getId();
        String stname=s.getStname();
        List <Double> grades=s.getGrade();
        System.out.println("st_id"+st_id);
        System.out.println("stname"+stname);
        System.out.println("grade"+grades);
    }
    }
