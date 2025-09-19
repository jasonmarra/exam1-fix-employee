/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        //question12
        int canDriveAge=16;
        if (age>=16)
         System.out.println("Can drive");
        else
          System.outprintln("wait for"+(canDiveAge-age)+ "until you can drive");
        
        
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        unpaidHours+hourlyWage=100;
        set tax to 30%;
        return=$70
        Print;
        
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        set CalculatePay to (70);
        return type();
        Print to John Deere will be paid 70 CAD;
        reset to(0);
        
        
    }
    private double hourlyWage;
    set doublehourlyWage>hourlyWage
    getPrice=doubleMoney;
    
}