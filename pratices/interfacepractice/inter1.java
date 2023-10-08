package interfacepractice;
interface shape{
    double getarea();
}
class rectangle implements shape{
    private double l;
    private double w;
    public rectangle(double l,double w)
    {
        this.w=w;
    this.l=l;
    }
    @Override
    public double getarea() {
       return l*w;
    }

}
class triangle implements shape{
 private double l;
    private double b;
    public triangle(double l,double b)
    {
        this.b=b;
    this.l=l;
    }
    @Override
    public double getarea() {
       return (l*b)/2;
    }
    

}
class circle implements shape{
    private double a;
    public circle(double a)
    {
        this.a=a;
    }
    @Override
    public double getarea() {
     return  Math.PI*Math.pow(a, 2);
    }


}
public class inter1 {
    public static void main(String a[])
{
    shape sp1=new rectangle(10, 12);
    shape sp2=new triangle(4,6);
    shape sp3=new circle(3);
    System.out.println("area of rectangle : "+sp1.getarea());
        System.out.println("area of triangle : "+sp2.getarea());
    System.out.println("area of circle : "+sp3.getarea());

}
}
