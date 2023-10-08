abstract class animal
{
    public abstract void sound();

}
class lion extends animal{
 public void sound(){
    System.out.println("Animal name is lion sound : "+"mmmmm");
 }
 
}
class tiger extends animal{
 public void sound()
 {
        System.out.println("Animal name is tiger sound : "+"meyavu");

 }
}



class abs1{
    public static void main(String a[])
{
 
    animal an1=new lion();
    animal an2=new tiger();
    an1.sound();
    an2.sound();
}
}