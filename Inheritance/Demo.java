public class Demo {
    public static void main(String[] args) {
        //Employee obj

        Employee emp = new Employee("Jerwin", 5000, 3000.00);
        emp.displayInfo();

        System.out.println("----------------------------------");

        Manager mgr = new Manager(1000.00, "John", 7000, 4000.00);
        mgr.displayInfo();

        System.out.println("----------------------------------");

        Developer dev = new Developer("Alice", 6000, 3500.00, "Java");
        dev.displayInfo();
        

    }
}