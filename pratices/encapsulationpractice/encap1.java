package encapsulationpractice;
class person
{
    private String name;
    private int age;
    private String country;
   
   
    public person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setage(int age)
    {
        this.age=age;
    }
    public void setcountry(String country)
    {
        this.country=country;
    }
    public String getname()
    {
        return name;
    }
public int getage()
{
    return age;
}
public String getcountry()
{
    return country;
}
}
public class encap1 {
    public static void main(String a[])
{
 person n=new person("vicky", 12, "india")  ;
 System.err.println(n.getname()+"--"+n.getage()+"--"+n.getcountry());
 n.setage(2);
 n.setcountry("asia");
 n.setname("anish");
}

}
