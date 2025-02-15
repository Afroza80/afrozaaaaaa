import java.util.Scanner;

public class Afroza2 {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Compute the sum
        int sum = firstNumber + secondNumber;

        // Print the result
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}


