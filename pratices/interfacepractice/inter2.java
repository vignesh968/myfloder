package interfacepractice;

import java.util.ArrayList;
import java.util.List;

interface banksystem
{
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
 abstract double balance();
}
class bank 
{

  private List banksystems;
  public bank()
  {
    banksystems=new ArrayList<>();
  }
public void addaccount(banksystem account )    
{
    banksystems.add(account);
}
public void removeaccount(banksystem account )    
{
    banksystems.remove(account);
}
public void deposit(banksystem account ,double amount) {
   account.deposit(amount);
}

public void withdraw(banksystem account,double amount) {
   account.withdraw(amount);
}
/**
 * 
 */
public void printbalance() {
   for(banksystem account:banksystems)
   {

   }
}

}
class saving implements banksystem
{ private double initialdep;
    private double interest;
    public saving(double initialdep,double interest)
    {
        this.initialdep=initialdep;
        this.interest=interest;
    }

    @Override
    public void deposit(double amount) {
       initialdep+=amount;
    }

    @Override
    public void withdraw(double amount) {
        initialdep-=amount;
    }

    @Override
    public double balance() {
      return initialdep;
    }

    public void applyedinterest()
    {
        System.out.println("interest + balance :"+(initialdep*interest)/100);
    }
}
class currentacc implements banksystem{
    private double initialdep;
    private double overdraf;
    public currentacc (double initialdep ,double overdraf)
    {this.initialdep=initialdep;
    this.overdraf=overdraf;
    }

    @Override
    public void deposit( double amount) {
    initialdep+=amount;
    }

    @Override
    public void withdraw(double amount) {
       initialdep-=amount;
    }

    @Override
    public double balance() {
       return initialdep;
    }

}
public class inter2 {
    public static void main(String a[])
{
    System.out.println("saving account");
    saving savingacc=new saving(1000,1.25);
    
        currentacc curacc=new currentacc(5000,1000);
        
    bank bk=new bank();
    bk.addaccount(savingacc);
    bk.addaccount(curacc);


}
}
