package ee.ivkhkdev;

import java.util.Objects;

public class Employee {
    private Person person;
    private String salary;
    private String position;



    public Employee() {
        super();

    }
    public Employee(Person person, String name, String salary, String position) {
        this.person = person;
        this.salary = salary;
        this.position = position;

    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(person, employee.person) && Objects.equals(salary, employee.salary) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, salary, position);
    }
}
