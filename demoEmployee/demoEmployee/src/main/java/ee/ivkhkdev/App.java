package ee.ivkhkdev;

import java.util.Scanner;

public class App {
    public void run(){
        boolean repeat true;
        do {
        System.out.println("Demo");
        System.out.println("task list: ");
        System.out.println("0. leave program");
        System.out.println("1. add employee");
        System.out.println("2. employee list");
        System.out.println("3. sort employee by first and last name");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt(); scanner.nextLine();
        switch(choice) {
            case 0:
                System.out.println("exiting program");
                System.exit(0);

            case 1:
                System.out.println("chosen task 1");
                break;

            case 2:
                System.out.println("chosen task 2");
                break;

            case 3:
                System.out.println("chosen task 3");
                break;

            default:
                System.out.println("wrong choice");


        }
        System.out.println("Goodbye! :3");


        Address address = new Address("Pushkin", "Johvi", "10", "11");
        Person person = new Person("Ivan", "Ivanov", 2000, 10, 11, 12345678);

        Employee employee = new Employee();
        employee.setPerson(person);
       employee.setPosition("Director");
       employee.setSalary("3000");

        Address address = new Address("J. Gagarini", "Sillamae", "5", "30");
        Person person = new Person("Oleg", "Tamarov", 2001, 1, 1, 87654321);

        Employee employee = new Employee();
       employee.setPerson(person);
        employee.setPosition("Blacksmith");
        employee.setSalary("2500");

        System.out.printf("Employee:%n %s %s%n %d years old%n %s%n %s%n %s%n",
                employee.getPerson().getName(),
               employee.getPerson().getSurname(),
               employee.getPerson().age(),
               employee.getPerson().getPhone(),
               employee.getPerson().getAddress().getCity(),
                employee.getPosition());
}
    private void createEmployee() {

    }
}
