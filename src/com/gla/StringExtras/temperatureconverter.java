package StringExtras;

    import java.util.Scanner;
    public class temperatureconverter {
        static double toCelsius(double f){
            return (f-32)*5/9;
        }
        static double toFahrenheit(double c){
            return (c*9/5)+32;
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            double temp=sc.nextDouble();
            if(choice==1)System.out.println(toCelsius(temp));
            else if(choice==2)System.out.println(toFahrenheit(temp));

    }

}
