package Sanjay.ClassAndObject.General;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(1);
        Employee emp2 = new Employee(1);
        System.out.println(emp);
        System.out.println(emp2);
        System.out.println(emp.equals(emp2));
        System.out.println(emp.hashCode());
        System.out.println(emp.getClass());

        int a = 5;
        a = 6;

        emp.setName("Sanjay");
        emp.setAge(27);
        emp.setSalary(1100);
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getSalary());
        System.out.println(emp);


    }
}
