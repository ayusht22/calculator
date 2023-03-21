package calculator;


import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;

        while (true) {
            System.out.println("Scientific Calculator using DevOps. \n Choose operation:");
            System.out.print("1. Factorial\n2. Square root\n3. Power\n4. Natural Logarithm\n" +
                    "5. Exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            if (choice == 1) {
                // Factorial
                System.out.print("Enter a number : ");
                number1 = scanner.nextDouble();
                System.out.println("Factorial of " + number1 + " is : " + calculator.factorial(number1));
                System.out.println("\n");

                break;
            } else if (choice == 2) {
                // Square root
                System.out.print("Enter a number : ");
                number1 = scanner.nextDouble();
                System.out.println("Square root of " + number1 + " is : " + calculator.squareRoot(number1));
                System.out.println("\n");

            } else if (choice == 3) {

                // Power
                System.out.print("Enter the first number : ");
                number1 = scanner.nextDouble();
                System.out.print("Enter the second number : ");
                number2 = scanner.nextDouble();
                System.out.println(number1 + " raised to power " + number2 + " is : " + calculator.power(number1, number2));
                System.out.println("\n");

            } else if (choice == 4) {
                // Natural log
                System.out.print("Enter a number : ");
                number1 = scanner.nextDouble();
                System.out.println("Natural log of " + number1 + " is : " + calculator.naturalLog(number1));
                System.out.println("\n");


            } else {
                System.out.println("Exiting..");
                break;
            }
        }

    }

    public double power(double num1, double num2) {
        logger.info("[POWER - " + num1 + " RAISED TO] " + num2);
        double result = Math.pow(num1,num2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double factorial(double num) {
        logger.info("[FACTORIAL] - " + num);
        double res = 1;
        for(int i = 1; i <= num; ++i)
        { res*= i;   }
        logger.info("[RESULT - FACTORIAL] - " + res);
        return res;
    }


    public double naturalLog(double num) {
        logger.info("[NATURAL LOG] - " + num);
        double res= 0;
        try {

            if (num<0 ) {
                res = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                res = Math.log(num);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + res);
        return res;
    }

    public double squareRoot(double number1) {
        logger.info("[SQ ROOT] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }


}
