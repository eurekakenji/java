package ee.ivkhkdev;

import ee.ivkhkdev.Address;
import ee.ivkhkdev.Employee;
import ee.ivkhkdev.Person;

import java.util.Scanner;

public class EmployeeManage {

    private Scanner scanner = new Scanner(System.in);

    public EmployeeManage() {

    }

    public EmployeeManage(Employee[] employees) {
        this.employees = employees;
    }

    public void listEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.printf("Employee:%n %s %s%n %d years old%n Phone number: %s%n City: %s%n Position: %s%n",
                        employees[i].getPerson().getFirstName(),
                        employees[i].getPerson().getLastName(),
                        employees[i].getPerson().age(),
                        employees[i].getPerson().getPhone(),
                        employees[i].getPerson().getAddress().getCity(),
                        employees[i].getPosition()
                );
            }
        }
    }

    public void createEmployee() {
        System.out.print("Name");
        String firstname;
        firstname = this.scanner.nextLine();
        System.out.print("Surname");
        String lastname;
        lastname = this.scanner.nextLine();
        System.out.print("Position");
        String Position;
        Position = this.scanner.nextLine();
        System.out.print("Salary");
        String Salary;
        Salary = this.scanner.nextLine();
        System.out.print("Day of birth");
        int BirthDay;
        BirthDay = Integer.parseInt(this.scanner.nextLine());
        System.out.print("Month of birth");
        int BirthMonth;
        BirthMonth = Integer.parseInt(this.scanner.nextLine());
        System.out.print("Year of birth");
        int BirthYear;
        BirthYear = Integer.parseInt(this.scanner.nextLine());
        System.out.print("Phone number");
        String Number;
        Number = this.scanner.nextLine();
        System.out.print("Address");
        String Address;
        Address = this.scanner.nextLine();
        System.out.print("City");
        String City;
        City = this.scanner.nextLine();
        System.out.print("Street");
        String Street;
        Street = this.scanner.nextLine();
        System.out.print("House");
        String House;
        House = this.scanner.nextLine();
        System.out.print("Apartment");
        String Room;
        Room = this.scanner.nextLine();
        String[] arrParameters = {
            firstname,
            lastname,
            Position,
            Salary,
            BirthDay,
            BirthMonth,
            BirthYear;
            Phone,
            Street,
            House,
            Room,

        }

        Address address = new Address(Street, City, House, Room);
        Person person = new Person(firstname, lastname, BirthYear, BirthMonth, BirthDay, Number, address);

        Employee employee = new Employee();
        employee.setPosition(Position);
        employee.setSalary(Salary);
        employee.setPerson(person);
    }

}

