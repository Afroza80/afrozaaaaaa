import java.util.Scanner;

public class Afroza6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string
        String reversedString = new StringBuilder(inputString).reverse().toString();

        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }
}






