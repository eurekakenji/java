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
        System.out.print("Name");
        String firstname = this.scanner.nextLine();
        System.out.print("Surname");
        String lastname = this.scanner.nextLine();
        System.out.print("Position");
        String Position = this.scanner.nextLine();
        System.out.print("Salary");
        String Salary = this.scanner.nextLine();
        System.out.print("Day of birth");
        int BirthDay = Integer.parseInt(this.scanner.nextLine());
        System.out.print("Month of birth");
        int BirthMonth = Integer.parseInt(this.scanner.nextLine());
        System.out.print("Year of birth");
        int BirthYear = Integer.parseInt(this.scanner.nextLine());
        System.out.print("Phone number");
        String Number = this.scanner.nextLine();
        System.out.print("Address");
        String Address = this.scanner.nextLine();
        System.out.print("City");
        String City = this.scanner.nextLine();
        System.out.print("Street");
        String Street = this.scanner.nextLine();
        System.out.print("House");
        String House = this.scanner.nextLine();
        System.out.print("Apartment");
        String Room = this.scanner.nextLine();


        Address address = new Address(Street, City, House, Room);
        Person person = new Person(firstname, lastname, BirthYear, BirthMonth, BirthDay, Number, address);

        Employee employee = new Employee();
        employee.setPosition(Position);
        employee.setSalary(Salary);
        employee.setPerson(person);

        System.out.printf("Employee:%n %s %s%n %d years old%n Phone number: %s%n City: %s%n Position: %s%n",
                employee.getPerson().getFirstName(),
                employee.getPerson().getLastName(),
                employee.getPerson().age(),
                employee.getPerson().getPhone(),
                employee.getPerson().getAddress().getCity(),
                employee.getPosition()
        );
    }
}
