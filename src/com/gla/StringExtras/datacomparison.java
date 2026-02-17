package StringExtras;
    import java.util.Scanner;
import java.time.LocalDate;
public class datacomparison {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            LocalDate d1=LocalDate.parse(sc.nextLine());
            LocalDate d2=LocalDate.parse(sc.nextLine());
            if(d1.isBefore(d2))System.out.println("First date is before second date");
            else if(d1.isAfter(d2))System.out.println("First date is after second date");
            else if(d1.isEqual(d2))System.out.println("Both dates are same");

    }

}
