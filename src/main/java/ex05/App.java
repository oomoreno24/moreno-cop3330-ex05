/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Oliver Moreno
 */
package ex05;

import java.util.Scanner;
/*
Exercise 5 - Simple Math
You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example Output
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints

Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.

Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Don’t allow the user to enter a negative number.
Break the program into functions that do the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the first number? ");

        // input for first number
        String firstNumber = in.nextLine();

        System.out.print("What is the second number? ");

        // input for second number
        String secondNumber = in.nextLine();

        // converting strings firstNumber and secondNumber to integers
        int x = Integer.parseInt(firstNumber);
        int y = Integer.parseInt(secondNumber);

        // string creation
        String addition = String.format("%d + %d = %d", x, y, x+y);
        String subtraction = String.format("%d - %d = %d", x, y, x-y);
        String multiplication = String.format("%d * %d = %d", x, y, x*y);
        String division = String.format("%d / %d = %d", x, y, x/y);

        // output
        System.out.printf("%s\n%s\n%s\n%s\n", addition, subtraction, multiplication, division);
    }
}
