abstract class Employee
{
    private String ename;
    private double salary;
    public Employee (String ename,double salary)
    {
        this.ename=ename;
        this.salary=salary;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public  abstract double  calculatesalary();
    public  abstract void displayinfo();

}
class Manager extends Employee
{
    private double bonus;

    public Manager(String ename, double salary,double bonus) {
        super(ename, salary);
        this.bonus=bonus;
    }

    @Override
    public double calculatesalary() {
        return getSalary()+bonus;
    }

    @Override
    public void displayinfo() {
        System.out.println("Employee :"+getEname()+"\n"+"salary : "+getSalary()+"\n"+"bonus: "+bonus+"\n"+"total salary : "+calculatesalary());
    }

}
class programmer extends Employee
{
private int hr;
private int rate;
    public programmer(String ename, double salary,int hr,int rate)
     {
        super(ename, salary);
        this.hr=hr;
        this.rate=rate;
    }

    @Override
    public double calculatesalary() {
    return getSalary()+(hr*rate);
    }

    @Override
    public void displayinfo() {
            System.out.println("Employee :"+getEname()+"\n"+"salary : "+getSalary()+"\n"+"overtime : "+hr+"\n"+"hourlyRate: "+rate+"\n"+"total salary : "+calculatesalary());

    }

}
public class abs5 {
    public static void main(String a[])
{
    Employee e=new Manager("man", 5000,1000);
    e.displayinfo();
    e.calculatesalary();
    Employee e2=new programmer("testing",30000,20,25);
    e2.calculatesalary();
    e2.displayinfo();
}
}
