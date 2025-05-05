import java.util.*;
class Employee 
{
	
    public String name;
    public String address;
    public double salary;
    public String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle)
	{
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() 
	{
        return salary * 0.1;
    }

    public void generatePerformanceReport()
	{
		
        System.out.println("Performance Report for: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }
}

class Manager extends Employee 
{
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    
    public void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    public void writeCode() {
        System.out.println(name + " is writing code.");
    }
}

class Programmer extends Employee 
{
    public Programmer(String name, String address, double salary)
	{
        super(name, address, salary, "Programmer");
    }

    public void debugCode() 
	{
        System.out.println(name + " is debugging code.");
    }
}

public class Company 
{
    public static void main(String[] args) 
	{
        Manager m=new Manager("Jerry", "123 Street", 80000);
        Developer d=new Developer("Tom", "456 Avenue", 60000);
        Programmer p=new Programmer("Sky", "789 SilverHood", 50000);

        m.generatePerformanceReport();
        m.manageProject();

        d.generatePerformanceReport();
        d.writeCode();

        p.generatePerformanceReport();
        p.debugCode();
    }
}