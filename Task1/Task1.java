package Task1;

public class Task1{
    public static void main(String[] args) {
        // Task 1: Write a Java program that takes two integers as input and prints their sum.
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: "+ sum);
        scanner.close();
    }
        
}