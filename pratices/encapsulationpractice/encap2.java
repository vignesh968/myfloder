package encapsulationpractice;
class bankaccount
{
    private int accno;
    private double balance;
    public int getAccno() {
        return accno;
    }
    public void setAccno(int accno) {
        this.accno = accno;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
public class encap2 {
    public static void main(String a[])
{
 bankaccount n=new bankaccount();   
 n.setAccno(12133);
 n.setBalance(5000);
 System.out.println("account no : "+n.getAccno()+"\n"+"balance : "+n.getBalance());
}
}
