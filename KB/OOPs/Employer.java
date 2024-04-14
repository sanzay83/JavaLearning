package OOPs;

public class Employer {

    public static void main(String[] args){
        Employee.displayEmployeeDetails();

        Employee myObj = new Employee("Kendra Ninglekhu", 27, 80000);
 
        System.out.println("");
        System.out.println("Name: " + myObj.getname());
        System.out.println("Age: " + myObj.getage());
        System.out.println("Salary: " + myObj.getsalary());

        myObj.setName("Santosh Humagain");
        myObj.setAge(27);
        myObj.setSalary(80000);

        System.out.println("");
        System.out.println("Name: " + myObj.getname());
        System.out.println("Age: " + myObj.getage());
        System.out.println("Salary: " + myObj.getsalary());

    }
}
