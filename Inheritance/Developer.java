public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int salary, double baseSalary, String programmingLanguage){
        super(name, salary, baseSalary); 
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo(){
        super.displayInfo(); // Call the base class method
        System.out.println("Programming Language: " + programmingLanguage);

    }


    
}
