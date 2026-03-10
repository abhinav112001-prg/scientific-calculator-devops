package com.calc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// commit
        while (true) {
            System.out.println("\nSCIENTIFIC CALCULATOR");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log (ln)");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number: ");
                    double x = sc.nextDouble();
                    System.out.println("Result: " + ScientificCalculator.sqrt(x));
                    break;

                case 2:
                    System.out.print("Enter integer: ");
                    int n = sc.nextInt();
                    System.out.println("Result: " + ScientificCalculator.factorial(n));
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    double lnInput = sc.nextDouble();
                    System.out.println("Result: " + ScientificCalculator.ln(lnInput));
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();

                    System.out.print("Enter exponent: ");
                    double exponent = sc.nextDouble();

                    System.out.println("Result: " + ScientificCalculator.power(base, exponent));
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.print("Invalid operation!");
            }
        }
    }
}
