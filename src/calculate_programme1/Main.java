package calculate_programme1;

import java.util.Scanner;

/**
 * Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creating object of Calculator class
        Calculator calc = new Calculator();
        char result;

        do {
            System.out.println("Enter first number : ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number : ");
            int num2 = scanner.nextInt();
            System.out.println("Please enter one of the symbol  +, -, *, / : ");
            char symbol = scanner.next().charAt(0);
            calc.calculateResult(num1, num2, symbol); // calling method using object
            System.out.println(" ");
            System.out.println("Would you like to do more calculation, Please enter 'Y' or 'N' : ");
            result = scanner.next().charAt(0);
        } while (result == 'Y' || result == 'y');
        System.out.println(" Program terminated! ");
        scanner.close();
    }

}
