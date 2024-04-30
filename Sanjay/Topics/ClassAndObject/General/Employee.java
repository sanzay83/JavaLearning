package Sanjay.Topics.ClassAndObject.General;

import java.util.Objects;

public class Employee {
    int employeeId;
    private String name;
    private int age, salary;

    public Employee(int id) {
        this.employeeId = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return this.employeeId == employee.employeeId && this.age == employee.age && this.salary == employee.salary && Objects.equals(this.name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name, age, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0 && salary < 5000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }
}
