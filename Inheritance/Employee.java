//Base Class
public class Employee {
    //Fields
    private String name;
    private int salary;
    private double baseSalary;

    //Constructor
    public Employee(String name, int salary, double baseSalary){
        this.name = name;
        this.salary = salary;
        this.baseSalary = baseSalary;
    }

    //Methods display info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Base Salary: " + baseSalary);
    }
    
    // Getters
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    
}
