package objectclasses.Level2;
import java.util.Scanner;
class PalindromeChecker{
    String text;
    PalindromeChecker(String text){
        this.text=text;
    }
    void check(){
        String sc="";
        for(int i=text.length()-1;i>=0;i--){
            sc=sc+text.charAt(i);
        }
        if(text.equals(sc))System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
class PalindromeString{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String t=s.nextLine();
        PalindromeChecker se=new PalindromeChecker(t);
        se.check();
    }
}