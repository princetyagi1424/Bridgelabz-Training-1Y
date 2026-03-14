package constructor.AccessModifiers;
import java.util.Scanner;
class BankAccount{
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    void setBalance(double b){
        balance=b;
    }
    double getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    void show(){
        System.out.println("Number:"+accountNumber);
        System.out.println("Holder:"+accountHolder);
        System.out.println("Balance:"+getBalance());
    }
}
class BankAccountManagement{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String h=s.nextLine();
        double b=s.nextDouble();
        SavingsAccount se=new SavingsAccount();
        se.accountNumber=n;
        se.accountHolder=h;
        se.setBalance(b);
        se.show();
    }
}