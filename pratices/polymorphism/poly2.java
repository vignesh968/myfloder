    package polymorphism;
    class Shape
    {
        public  double calculatearea()
    {
    return 0;
    }
    }
    class circle extends Shape{
        private double r;
        
    public circle(double r) {
            this.r = r;
        }

    public double calculatearea(){
        return Math.PI*r*r;
    }
    
    }
    class triangle extends Shape{
            private double b;
            private double h;


    public triangle(int i, int j) {
        b=i;
        h=j;
            }
                public double calculatearea()
    {
return (b*h)/2;
    }
    }
    class rectangle extends Shape{
        private int l,w ;
        
    public rectangle(int l, int w) {
            this.l = l;
            this.w = w;
        }

    public double calculatearea()
    {
    return l*w;
    }
    }



    class abs1{
        public static void main(String a[])
    {
    
       circle c=new circle(5);
       triangle t=new triangle(4,5);
       rectangle r= new rectangle(30 , 67 );
    System.out.println("circle"+c.calculatearea());
System.out.println("triangle"+t.calculatearea());
System.out.println("rectangle"+r.calculatearea());
    }
    }