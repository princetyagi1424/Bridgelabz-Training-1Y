package constructor.InstancevsClassVariablesandMethods;
import java.util.Scanner;
class Vehicle{
    String ownerName;
    String vehicleType;
    static double registrationFee=500;
    Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    void displayVehicleDetails(){
        System.out.println("Owner:"+ownerName);
        System.out.println("Type:"+vehicleType);
        System.out.println("Fee:"+registrationFee);
    }
    static void updateRegistrationFee(double am){
        registrationFee=am;
    }
}
class VehicleRegistration{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String o=s.nextLine();
        String v=s.nextLine();
        double f=s.nextDouble();
        Vehicle se=new Vehicle(o,v);
        Vehicle.updateRegistrationFee(f);
        se.displayVehicleDetails();
    }
}