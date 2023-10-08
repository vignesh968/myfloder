package encapsulationpractice;
class circle
{
private double radius;
public void setradius(double radius)
{
    this.radius=radius;
}
public double getradius()
{
    return radius;
}
public void calculatearea()
{
    System.out.println("area : "+(Math.PI)*Math.pow(getradius(), 2));

}
public void calculateperimeter()
{
    System.out.println("perimeter: "+2*Math.PI*getradius());
}
}
public class encap4 {
    public static void main(String a[])
{
 circle c=new circle();
    c.setradius(7);
    c.calculatearea();
    c.calculateperimeter();
}
}
