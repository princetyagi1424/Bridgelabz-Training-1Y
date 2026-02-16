package methods;
public class car2 {
    String brand;
    String model;
    int year;
    car2() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }
    car2(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println();
    }
    public static void main(String[] args) {
        car2 c1 = new car2();
        car2 c2 = new car2("Toyota", "Fortuner", 2023);
        car2 c3 = new car2("BMW", "M4", 2024);
        c1.display();
        c2.display();
        c3.display();
    }
}
