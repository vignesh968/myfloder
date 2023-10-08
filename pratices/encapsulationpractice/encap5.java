package encapsulationpractice;
class car{
    private String compname;
    private String modelName;
    private int year;
    private double mileage;
    public String getCompname() {
        return compname;
    }
    public void setCompname(String compname) {
        this.compname = compname;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getmilleage()
    {
        return mileage;
    }

}
public class encap5 {
    public static void main(String a[])
{
 car c=new car();
 c.setCompname("TATA");
 c.setModelName("m231");
 c.setYear(2009);
 
 System.out.println("company details of car");
 System.err.println("company name : "+ c.getCompname());
 System.out.println("modelName: "+c.getModelName());
 System.out.println("year : "+c.getYear());
 System.out.println("mileage : "+c.getmilleage());
}
}
