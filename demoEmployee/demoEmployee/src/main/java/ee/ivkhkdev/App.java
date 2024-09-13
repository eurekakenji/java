package ee.ivkhkdev;

public class App {
    public void run(){
        System.out.println("Demo Program for storing employee data");

        Address address = new Address("Pushkin", "Johvi", "10", "11");
        Person person = new Person("Ivan", "Ivanov", 2000, 10, 11, 12345678);

        Employee employee = new Employee();
        employee.setPerson(person);
        employee.setPosition("Director");
        employee.setSalary("3000");

        System.out.printf("Employee:%n %s %s%n %d years old%n %s%n %s%n %s%n",
                employee.getPerson().getName(),
                employee.getPerson().getSurname(),
                employee.getPerson().getAge(),
                employee.getPerson().getPhone(),
                employee.getPerson().getAddress().getCity(),
                employee.getPosition());

    }
}
