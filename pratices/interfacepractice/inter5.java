package interfacepractice;
interface playable
{
    public void  play();
}
class football implements playable{

    @Override
    public void play() {
              System.out.println("playing football------");

    }

}
class volleyball implements playable
{

    @Override
    public void play() {
        // TODO Auto-generated method stub
       System.out.println("playing volleyball------");

    }

}
class basketball implements playable
{

    @Override
    public void play() {
       System.out.println("playing basketball------");
    }

}
public class inter5 {
    public static void main(String a[])
{System.out.println("football");
    football f=new football();
    f.play();
    System.out.println("volleyball");
    volleyball v=new volleyball();
    v.play();
    System.out.println("basketball");
    basketball b=new basketball();
b.play();
}
}