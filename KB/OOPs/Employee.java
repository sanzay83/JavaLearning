package OOPs;

public class Employee {
    private String name;
    private int age;
    private double salary;

    //Constructor
    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //Getter method
    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }

    public double getsalary(){
        return salary;
    }

    //Setter method
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;
    }

    static void displayEmployeeDetails(){
        Employee myObj = new Employee("Sanjay Duwal", 27, 80000);
        System.out.println("Name: " + myObj.getname());
        System.out.println("Age: " + myObj.getage());
        System.out.println("Salary: " + myObj.getsalary());
    }
}
