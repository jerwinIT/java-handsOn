
public class Manager extends Employee {
    private double bonus;

    //Constructor
    public Manager(double bonus, String name, int salary, double baseSalary){
        super(name, salary, baseSalary);
        this.bonus = bonus;
    }
    //override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Bonus: " + bonus);
        //total salary
        System.out.println(
            "Total Salary: " + (super.getSalary() + bonus)
        );
    }
    
}
