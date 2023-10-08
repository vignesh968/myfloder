package oops;

import java.util.ArrayList;

class account{
private String name;
private String acno;
private double balance;


public account(String name, String acno, double balance) {
    this.name = name;
    this.acno = acno;
    this.balance = balance;
}

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getAcno() {
    return acno;
}
public void setAcno(String acno) {
    this.acno = acno;
}
public double getBalance() {
    return balance;
}
public void setBalance(double balance) {
    this.balance = balance;
}
public void deposit(double amount)
{
    balance+=amount;
}
public void withdraw(double amount)
{
    if(balance>amount)
    {
        balance-=amount;
    }
}

public String toString() {
    return "account [name=" + name + ", acno=" + acno + ", balance=" + balance + "]";
}

}
class Bank{
private ArrayList<account> acdetails;

public Bank() {
   acdetails=new ArrayList<account>();
}
void addAccountDetails (account b){
acdetails.add( b);
}
void removeaccount(account b)
{
    acdetails.remove(b);

}
public void depositamount(account b,double amount)
{
    b.deposit(amount);

}
public void withdrawamount(account b,double amount)
{
    b.withdraw(amount);

}
public ArrayList<account> getaccount()
{
    return acdetails;
}
}

public class BankAccountManagement {
public static void main(String a[])
{
    Bank b=new Bank();
    account a1=new account("vicky","343553",4000);
    account a2=new account("ram","43895",5000);
    b.addAccountDetails(a1);
    b.addAccountDetails(a2);
    ArrayList<account>br=b.getaccount();
    System.out.println(a1.toString());
    System.out.println(a2.toString());
    for(account d:br)
    {
        System.out.println(d.getName()+" "+d.getAcno()+" "+d.getBalance());
    }
}   
}

