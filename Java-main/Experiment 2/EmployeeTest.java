
import java.util.*;
class Employee {
    private String firstName;
    private String lastName;
    private int monthlySalary;
    public Employee(String firstName, String lastName, int monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary); 
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

public void setMonthlySalary(int monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
}

    public int getMonthlySalary() {
        return monthlySalary;
    }

 public  int getYearlySalary(){
        return monthlySalary * 12;
    }
 public void giveRaise() {
        this.monthlySalary *= 1.10;
    }
}



public class EmployeeTest {
 public static void main(String[] args) {
		
     Employee emp1 = new Employee("Prachi","Bele",5000);
     Employee emp2 = new Employee("Neha","Patil",6000);

     System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
	 " Yearly Salary: " + emp1.getYearlySalary());
     System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
	 " Yearly Salary: " + emp2.getYearlySalary());

      emp1.giveRaise();
      emp2.giveRaise();

        System.out.println("After 10% Raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " Yearly Salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " Yearly Salary: " + emp2.getYearlySalary());
    }
}
