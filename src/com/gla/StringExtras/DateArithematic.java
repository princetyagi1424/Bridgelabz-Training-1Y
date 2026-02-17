package StringExtras;
    import java.util.Scanner;
import java.time.LocalDate;
    public class DateArithematic {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String input=sc.nextLine();
            LocalDate d=LocalDate.parse(input);
            d=d.plusDays(7);
            d=d.plusMonths(1);
            d=d.plusYears(2);
            d=d.minusWeeks(3);
            System.out.println(d);
        }
    }


