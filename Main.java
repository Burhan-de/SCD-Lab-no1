
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Welcome Message
        System.out.println("================================");
        System.out.println("       JAVA TEST PROGRAM");
        System.out.println("================================");

        System.out.println("Hello, Java!");
        System.out.println("Java is working correctly.");

        // Basic Addition
        int a = 10;
        int b = 20;
        int sum = a + b;

        System.out.println("\n--- Basic Calculation ---");
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
        System.out.println("Sum = " + sum);

        // User Information
        System.out.println("\n--- User Information ---");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Welcome, " + name + "!");

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // User Calculator
        System.out.println("\n--- Calculator ---");

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Even or Odd
        System.out.println("\n--- Even or Odd ---");

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        // Loop Test
        System.out.println("\n--- Counting from 1 to 10 ---");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // Marks and Average
        System.out.println("\n\n--- Student Marks ---");

        int[] marks = {85, 90, 78, 92, 88};
        int total = 0;

        for (int mark : marks) {
            System.out.println("Mark: " + mark);
            total += mark;
        }

        double average = (double) total / marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        // Final Message
        System.out.println("\n================================");
        System.out.println("All Java tests completed!");
        System.out.println("Java is running successfully.");
        System.out.println("================================");

        input.close();
    }
}
