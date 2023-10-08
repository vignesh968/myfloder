package encapsulationpractice;
class Employee
{
    private int id;
    private  String name;
    private double salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
public String formaString()
{
    return ""+salary;
}
}
public class encap3 {
    public static void main(String a[])
{
 System.out.println("Employee details");
    Employee emp=new Employee();
    emp.setId(102);
    emp.setName("vicky");
    emp.setSalary(500000);

    int empid=emp.getId();
    String empname=emp.getName();
    String salary=emp.formaString();
    System.out.println("ID : "+empid);
    System.out.println("Name: " +empname );
    System.out.println("salary : "+salary);
}
}
