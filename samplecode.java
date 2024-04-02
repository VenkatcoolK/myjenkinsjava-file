import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user to enter their name
        System.out.print("Please enter your name: ");
        
        // Reading the user's input as a String
        String name = scanner.nextLine();
        
        // Greeting the user with their name
        System.out.println("Hello, " + name + "! Welcome to the Greeting Program.");
        
        // Closing the Scanner object to prevent resource leaks
        scanner.close();
    }
}