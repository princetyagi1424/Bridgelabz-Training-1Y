package objectclasses.Level2;
import java.util.Scanner;
class BankAccount{
    String name;
    int number;
    double balance;
    BankAccount(String name,int number,double balance){
        this.name=name;
        this.number=number;
        this.balance=balance;
    }
    void deposit(double am){
        balance=balance+am;
    }
    void withdraw(double am){
        if(balance>=am)balance=balance-am;
    }
    void show(){
        System.out.println("Name:"+name);
        System.out.println("Number:"+number);
        System.out.println("Balance:"+balance);
    }
}
class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        int num=s.nextInt();
        double b=s.nextDouble();
        double d=s.nextDouble();
        double w=s.nextDouble();
        BankAccount se=new BankAccount(n,num,b);
        se.deposit(d);
        se.withdraw(w);
        se.show();
    }
}