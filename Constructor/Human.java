

public class Human {
    private String name;
    private int age;

    // Constructor
    public Human() {
        System.out.println("I am constructor of Human class");
    }

    //getter for name
    public String getName() {
        return name;
    }
    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Method to display human details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    

    
}
