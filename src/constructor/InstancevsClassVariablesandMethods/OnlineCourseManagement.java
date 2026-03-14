package constructor.InstancevsClassVariablesandMethods;
import java.util.Scanner;
class Course{
    String courseName;
    int duration;
    double fee;
    static String instituteName="ABC Institute";
    Course(String courseName,int duration,double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    void displayCourseDetails(){
        System.out.println("Course:"+courseName);
        System.out.println("Duration:"+duration);
        System.out.println("Fee:"+fee);
        System.out.println("Institute:"+instituteName);
    }
    static void updateInstituteName(String n){
        instituteName=n;
    }
}
class OnlineCourseManagement{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String c=s.nextLine();
        int d=s.nextInt();
        double f=s.nextDouble();
        s.nextLine();
        String ins=s.nextLine();
        Course se=new Course(c,d,f);
        Course.updateInstituteName(ins);
        se.displayCourseDetails();
    }
}