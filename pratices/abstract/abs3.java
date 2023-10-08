import java.util.Scanner;

abstract class bankaccount
{
    private String accno;
    private double balance;
 
 //constructor
    public bankaccount(String accno, double balance) {
        this.accno = accno;
        this.balance = balance;
    }
    
    public String getAccno() {
        return accno;
    }
    public void setAccno(String accno) {
        this.accno = accno;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double d) {
        this.balance = d;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

}
class saving extends bankaccount
{

    public saving(String accno, int balance) {
        super(accno, balance);
        
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(getBalance()+amount);
       System.out.println("deposit amount"+ amount+"\n"+getBalance());
    }

    @Override
    public void withdraw(double amount) {
      if(getBalance()<amount)
      {
        System.out.println("unable to withdraw");
      }
      else
      {
        super.setBalance(getBalance()-amount);
                System.out.println("current balance : "+getBalance());

      }
    }
    
}
class currentaccount extends bankaccount
{

    public currentaccount(String accno, int balance) {
        super(accno, balance);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void deposit(double amount) {
      super.setBalance(getBalance()+amount);
       System.out.println("deposit amount"+ amount+"\n"+getBalance());
    }

    @Override
    public void withdraw(double amount) {
 if(getBalance()<amount && amount%100==0)
      {
        System.out.println("unable to withdraw");
      }
      else
      {
        super.setBalance(getBalance()-amount);
        System.out.println("current balance : "+getBalance());
      }
    }
    
}

class abs3{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        //saving
        bankaccount bk =new saving("123", 500);
        System.out.println("enter a deposit amount for saving account");
        double dep=s.nextDouble();
        bk.deposit(dep);
 System.out.println("enter a withdraw amount for saving account");
        double withd=s.nextDouble();
        bk.withdraw(withd);

        bankaccount n=new currentaccount("vicky", 700);
         System.out.println("enter a deposit amount for currentaccount ");
        double curdep=s.nextDouble();
        bk.deposit(curdep);
         System.out.println("enter a withdraw amount for currentaccount ");
        double curwithd=s.nextDouble();
        bk.withdraw(curwithd);

    }
}