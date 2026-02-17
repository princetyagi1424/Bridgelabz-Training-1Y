package StringExtras;
    import java.util.Scanner;
    public class factorial {
        static int getInput(Scanner sc){
            return sc.nextInt();
        }
        static long factorial(int n){
            if(n==0||n==1)return 1;
            return n*factorial(n-1);
        }
        static void display(long result){
            System.out.println(result);
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=getInput(sc);
            display(factorial(n));
        }


}
