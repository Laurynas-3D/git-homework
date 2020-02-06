package Arrays;

/**
 This program:
 - Creates an array of objects

 Created at 2020-02
 */

public class ArrayOfObjects {

    // Java program to illustrate creating an array of objects

    // Elements of array are objects of a class Student.

    public static void main (String[] args){
        // declares an Array of integers.
        Student[] array;

        // allocating memory for 5 objects of type Student.
        array = new Student[5];

        // initialize the first elements of the array
        array[0] = new Student(1,"Laurynas");

        // initialize the second elements of the array
        array[1] = new Student(2,"Virginijus");
        array[2] = new Student(3,"Pavel");
        array[3] = new Student(4,"Sven");
        array[4] = new Student(5,"Ruslan");

        // accessing the elements of the specified array
        for (int i = 0; i < array.length; i++)
            System.out.println("Element at " + i + " : " +
                    array[i].studentNumber +" "+ array[i].studentName);
    }
}

class Student{

    public int studentNumber;
    public String studentName;

    public Student(int studentNumber, String studentName){
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }
}
