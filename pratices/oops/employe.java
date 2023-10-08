package oops;
class emp{
    private String ename;
    private String jobtype;
    private double salary;


    
    public emp(String ename, String jobtype, double salary) {
        this.ename = ename;
        this.jobtype = jobtype;
        this.salary = salary;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getJobtype() {
        return jobtype;
    }
    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
public void salaryincr(double t)
{
    salary=salary +(salary*t)/100;
} 
public void printdetails()
{
    System.out.println("empname : "+ename);
    System.out.println("jobtype : "+jobtype);
    System.out.println("salary : "+salary);
}
}
public class employe {
    public static void main(String a[])
    {
        emp e1=new emp("vicky", "Hr", 49000);
        emp e2=new emp("ram", "software  role", 50000);
        e1.printdetails();
        e2.printdetails();
System.out.println("-----------");
        e1.salaryincr(6);
        e2.salaryincr(8);
        e1.printdetails();
        e2.printdetails();
    }
}
