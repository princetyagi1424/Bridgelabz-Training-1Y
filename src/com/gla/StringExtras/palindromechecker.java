package StringExtras;

    import java.util.Scanner;
public class palindromechecker {
        static String getInput(Scanner sc){
            return sc.nextLine();
        }
        static boolean isPalindrome(String s){
            String r="";
            for(int i=s.length()-1;i>=0;i--){
                r=r+s.charAt(i);
            }
            return s.equals(r);
        }
        static void display(boolean result){
            if(result)System.out.println("Palindrome");
            else System.out.println("Not Palindrome");
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String s=getInput(sc);
            display(isPalindrome(s));
        }
    }


