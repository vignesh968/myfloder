import java.math.*;
abstract class shape3d
    {
        public abstract double calvolume();
        public abstract double calsurfacearea();

    }
    class sphere extends shape3d {
        private double r;
        public sphere(double r)
        {
            this.r=r;
        }
    public double calvolume()
    {
        return(4.0/3.0) *Math.PI*Math.pow(r, 3);
    }
    public double calsurfacearea()
    {
        return 2*Math.PI*Math.pow(r, 2);
    }
}
    class cube extends shape3d{
        private double a;
       
        public cube(double a)
        {
            this.a=a;

        }
        @Override
        public double calvolume() {
return Math.pow(a, 3);
        }

        @Override
        public double calsurfacearea() {
return   6*Math.pow(a, 2);      }
     
    }



    class abs2{
        public static void main(String a[])
    {System.out.println("circle");
        shape3d c=new sphere(4);
       System.out.println( "sphere volume: "+c.calvolume());
       System.out.println("sphere of surface area: " +c.calsurfacearea());
        
    System.out.println("triangle");
    shape3d t = new cube(3);
    System.out.println("cube of volume: "+t.calvolume());
    System.out.println("cube of surface area : "+t.calsurfacearea());
    }
    }