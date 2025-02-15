// Import Scanner class to take user input
import java.util.Scanner;

public class Afroza1 {  
    public static void main(String[] args) {  
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);  

        // Taking student data as input
        System.out.print("Enter student name: ");  
        String studentName = scanner.nextLine(); // Reads full name as a String

        System.out.print("Enter student ID: ");  
        int studentID = scanner.nextInt(); // Reads student ID as an integer

        System.out.print("Enter student age: ");  
        int studentAge = scanner.nextInt(); // Reads student age as an integer

        System.out.print("Enter student fee: ");  
        float studentFee = scanner.nextFloat(); // Reads student fee as a floating-point number

        System.out.print("Enter student grade: ");  
        char studentGrade = scanner.next().charAt(0); // Reads the first character of the input

        // Printing student details
        System.out.println("\nStudent Details:");  
        System.out.println("Student name: " + studentName);  
        System.out.println("Student ID: " + studentID);  
        System.out.println("Student age: " + studentAge);  
        System.out.println("Student fee: " + studentFee);  
        System.out.println("Student grade: " + studentGrade);  

        // Close the scanner to prevent resource leak
        scanner.close();  
    }  
}

