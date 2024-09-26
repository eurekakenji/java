package ee.ivkhkdev;

import java.util.Scanner;


public class App {
    Scanner scanner;

    public App(Scanner scanner){
        this.scanner = scanner;
    }

    public void run() {
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("List of tasks:");
            System.out.println("0. leave program");
            System.out.print("enter task number: ");
            int task = scanner.nextInt();
            switch(task){
                case 0:
                    System.out.println("Exiting program...");
                    repeat = false;
                default:
                    System.out.println("Choose number from the list of tasks!");
            }
        }while (repeat);
    }

}
