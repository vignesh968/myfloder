abstract class animals
{
    public abstract void eat();
    public abstract void sleep();

}
class lion extends animals{

    @Override
    public void eat() {
          System.out.println("Lion eats meat");

    }

    @Override
    public void sleep() {
      System.out.println("Lion sleeps on grassland.");
    }

 
}
class tiger extends animals{

    @Override
    public void eat() {
       System.out.println("Tiger eats meat and occasionally hunts in water.");
    }

    @Override
    public void sleep() {
   System.out.println("Tiger sleeps in a hidden spot.");
    }

}
class deer extends animals{

    @Override
    public void eat() {
       System.out.println("Deer grazes on grass and leaves.");
    }

    @Override
    public void sleep() {
System.out.println("Deer sleeps in open fields");
    }

}


class abs4{
    public static void main(String a[])
{
 
    animals an1=new lion();
    animals an2=new tiger();
    animals an3=new deer();
    System.out.println("lion");
    an1.eat();
    an1.sleep();
        System.out.println("tiger");

    an2.eat();
    an2.sleep();
        System.out.println("deer");

    an3.eat();
    an3.sleep();
}
}