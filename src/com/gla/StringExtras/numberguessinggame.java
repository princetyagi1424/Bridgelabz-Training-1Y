package StringExtras;

    import java.util.Scanner;
    public class numberguessinggame {
        static int generateGuess(int low,int high){
            return (low+high)/2;
        }
        static String getFeedback(Scanner sc){
            return sc.next();
        }
        static int[] nextRange(int low,int high,int guess,String feedback){
            if(feedback.equalsIgnoreCase("high"))high=guess-1;
            else if(feedback.equalsIgnoreCase("low"))low=guess+1;
            return new int[]{low,high};
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int low=1,high=100;
            while(true){
                int guess=generateGuess(low,high);
                System.out.println("Is your number "+guess+"? (high/low/correct)");
                String feedback=getFeedback(sc);
                if(feedback.equalsIgnoreCase("correct")){
                    System.out.println("Guessed correctly");
                    break;
                }
                int[] range=nextRange(low,high,guess,feedback);
                low=range[0];
                high=range[1];

        }
    }

}
