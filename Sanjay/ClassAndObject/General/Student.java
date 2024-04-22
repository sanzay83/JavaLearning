package Sanjay.ClassAndObject.General;

public class Student {
    final String name;  // final can only be assigned once in constructor only
    final int age;

    protected Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student stu = new Student("Sanjay", 27);
        System.out.println(stu);
    }

    @Override
    public String toString() {
        return "Student Details: {name:" + name + ", age:" + age + "}";
    }


}
