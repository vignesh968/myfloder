abstract class geometric{
    public abstract  double area();
    public abstract double preimeter();
}
class trianglecal extends geometric{
private double a;
private double b;
private double c;
public trianglecal(double a,double b,double c)
{
    this.a=a;
    this.b=b;
    this.c=c;
}
public double area()
{
    return (a*b)/2;
}
public double preimeter()
{
    return a+b+c;
}
}
class square extends  geometric{
private double a;
public square (double a)
{
    this.a=a;
}
public double area()
{
    return a*a;
}
public double preimeter()
{
    return 4*a;
}
}

public class abs7 {
    public static void main(String a[])
{
    geometric tri=new trianglecal(4,5,6);
    geometric sq=new square(6);
    System.out.println("triangle of area:"+tri.area());
    System.out.println("triangle of preimeter : "+tri.preimeter());
      System.out.println("square of area:"+sq.area());
    System.out.println("square of preimeter : "+sq.preimeter());
    


}
}
