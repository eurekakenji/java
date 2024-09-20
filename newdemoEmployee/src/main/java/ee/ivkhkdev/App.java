package ee.ivkhkdev;

import java.util.Scanner;

public class App {
    private Scanner scanner;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program demo \"department list\"");
        boolean repeat = true;
        do {
            System.out.println("Список задач:");
            System.out.println("0. Exit program");
            System.out.println("1. Add employee");
            System.out.println("2. List of employees");
            System.out.println("3. Sort employees by name and surname");
            System.out.println("choose option: ");
            Scanner scan = new Scanner(System.in);
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("exiting program...");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("task 1 chosen");
                    createEmployee();
                    break;
                case 2:
                    System.out.println("task 2 chosen");
                    break;
                case 3:
                    System.out.println("task 3 chosen");
                    break;
                default:
                    System.out.println("incorrect option");
            }
        }while (repeat);
        System.out.println("Goodbye! :3");


    }

    private void createEmployee() {
    }
}
