package constructor.Level1;
import java.util.Scanner;
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    Person(Person p){
        name=p.name;
        age=p.age;
    }
    void show(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class CloneAttribute{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        int a=s.nextInt();
        Person se=new Person(n,a);
        Person se2=new Person(se);
        se.show();
        se2.show();
    }
}