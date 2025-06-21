

public class Demo {
    public static void main(String a[]){
        // Calculator calc = new Calculator();
        // int sum = calc.add(5, 3);
        // int difference = calc.subtract(10, 4);
        // System.out.println("Sum: " + sum);
        // System.out.println("Difference: " + difference);

        AdvCalculator advCalc = new AdvCalculator();
        int product = advCalc.add(5, 3);
        int quotient = advCalc.subtract(10, 4);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        

    }
}

// Object - Properties and Behaviors
// Class - Blueprint

// Inheritance Ambiguity is where a subclass inherits from multiple superclasses that have methods with the same name. 
//This can lead to confusion about which method should be called.