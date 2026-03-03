package tripillar_coding_assesment.Module_3;
import java.util.Scanner;
public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        Calculator c = new Calculator();

        System.out.println("Addition: " + c.add(num1, num2));
        System.out.println("Subtraction: " + c.subtract(num1, num2));
    }
}
