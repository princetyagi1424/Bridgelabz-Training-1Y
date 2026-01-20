import java.util.Scanner;
class triangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height;
        double areaInSqCm, areaInSqIn;
        System.out.print("Enter base in cm: ");
        base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        height = input.nextDouble();
        areaInSqCm = 0.5 * base * height;
        areaInSqIn = areaInSqCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " 
                + areaInSqIn + " and sq cm is " + areaInSqCm);
    }
}