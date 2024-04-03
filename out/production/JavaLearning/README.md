# JAVA LEARNING

## Installation of Java JDK
https://www.oracle.com/java/technologies/downloads/

## USE Intellij or Visual Studio for IDE

**Download link to IntelliJ** https://www.jetbrains.com/idea/download/

**Download link to Visual Studio** https://visualstudio.microsoft.com/downloads/


## Important Notes for Learning

**Primitive data types -** includes byte, short, int, long, float, double, boolean and char

**Non-primitive data types -** such as String, Arrays and Classes (you will learn more about these in a later chapter)

**Type Casting**

int myInt = 9;

double myDouble = myInt;

or,

double myDouble = 9.78d;

int myInt = (int) myDouble;

**Java Special Characters**

Backslash (\) is used to add quotes inside quotes such as "This is \"Java\" Learning"

\n is used for new line. \t is used for tab.

**For Loop**

for (int i = 0; i < 5; i++) {

System.out.println(i);

}


String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for (String i : cars) {

System.out.println(i);

}

**ARRAY**

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

cars[0] = "Opel";

System.out.println(cars[0]);

System.out.println(cars.length);


**METHOD**

~ myMethod() is the name of the method

~ static means that the method belongs to the Main class and is not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.

~ void means that this method does not have a return value. You will learn more about return values later in this chapter

~ Information can be passed to methods as a parameter. Parameters act as variables inside the method.

~ Method Overloading having same name but different set of parameters

static int plusMethod(int x, int y) {

  return x + y;

}

static double plusMethod(double x, double y) {

  return x + y;
  
}

~ Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.

**File Handeling**

Opening a file to read

import java.io.File;

File myObj = new File("filename.txt");

Writing a file 

import java.io.FileWriter;

FileWriter myWriter = new FileWriter("filename.txt");

myWriter.write("Files in Java might be tricky, but it is fun enough!");


Reading a file 

File myObj = new File("filename.txt");

Scanner myReader = new Scanner(myObj);
      
while (myReader.hasNextLine()) {

String data = myReader.nextLine();

System.out.println(data);
        
}

Deleting file 

File myObj = new File("filename.txt"); 

myObj.delete()



