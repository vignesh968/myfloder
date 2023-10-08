package interfacepractice;
interface resizable
{
    void resize(int width);
    void resizeheight(int height);
}
class rectangleshape implements resizable  //rectangle class inherits from the resizable interface.
{
    private int width;
    private int h;
    public rectangleshape(int width,int h)
    {
        this.width=width;
        this.h=h;
    }

    @Override
    public void resize(int width) {
    System.out.println("width :"+width);
    }

    @Override
    public void resizeheight(int height) {
    System.out.println("height :"+height);

    }

    public void printsize() {
    System.out.println("width :"+width+" ,"+"height :"+h);
    }
    
}

public class inter3 {
    public static void main(String a[])
    {
rectangleshape rect=new rectangleshape(100,200);
rect.printsize();
rect.resize(300);
rect.resizeheight(500);
    }
}
