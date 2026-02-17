package StringExtras;
    import java.util.Scanner;
    public class maximumofthreenumbers {
        static int getInput(Scanner sc){
            return sc.nextInt();
        }
        static int findMax(int a,int b,int c){
            int max=a;
            if(b>max)max=b;
            if(c>max)max=c;
            return max;
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int a=getInput(sc);
            int b=getInput(sc);
            int c=getInput(sc);
            System.out.println(findMax(a,b,c));

    }

}
