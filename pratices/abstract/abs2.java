import java.math.*;
abstract class shape
    {
        public abstract double calcularea();
        public abstract double calculperimeter();

    }
    class circle extends shape {
        private double r;
        public circle(double r)
        {
            this.r=r;
        }
    public double calcularea()
    {
        return Math.PI*r*r;
    }
    public double calculperimeter()
    {
        return 2*Math.PI*r;
    }
}
    class triangle extends shape{
        private double a;
        private double b;
        private double c;
        public triangle(double a,double b,double c )
        {
            this.a=a;
            this.b=b;
            this.c=c;
        }
        @Override
        public double calcularea() {
return (a*b)/2;
        }

        @Override
        public double calculperimeter() {
return a+b+c;        }
     
    }



    class abs2{
        public static void main(String a[])
    {System.out.println("circle");
        shape c=new circle(4);
       System.out.println( "area of circle: "+c.calcularea());
       System.out.println("preimeter of circle: " +c.calculperimeter());
        
    System.out.println("triangle");
    shape t = new triangle(3,4,5);
    System.out.println("area of triangle: "+t.calcularea());
    System.out.println("preimeter of triangle: "+t.calculperimeter());
    }
    }