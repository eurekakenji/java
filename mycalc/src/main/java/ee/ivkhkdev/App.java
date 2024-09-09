package ee.ivkhkdev;

import java.util.Scanner;

public class App {
    private Scanner scanner = new Scanner(System.in);
    private double result;
    public void run() {
        System.out.println("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter operator (+,-,*,/): ");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        switch (operator) {
            case '+': result = num1 + num2;
            break;
            case '-': result = num1 - num2;
            break;
            case '*': result = num1 * num2;
            break;
            case '/': result = num1 / num2;
            break;
            default: System.out.println("Invalid operator");
            break;

        }
        System.out.println("Result: " + result);

    }
}
