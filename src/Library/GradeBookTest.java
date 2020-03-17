package Library;

/**
 * This program:
 * - GradeBook class using an array to store test grades
 *
 * Some Notes:
 * - refs GradeBookTest.java; GradeBook.java
 *
 * Created at 2020-03
 */

public class GradeBookTest {

    public static void main(String[] args) {

        // one dimensional array of student grades
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for %n%s&n&n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }

} // end class GradeBookTest

class GradeBook {

    // reference type variables, holds value null until you assign something to them
    private String courseName; // name of the course this GradeBook represents
    private int[] grades; // array of student grades

    // constructor
    public GradeBook(String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    // method to set course name
    public void setCourseName(String courseName ){
        this.courseName = courseName;
    }

    // method to retrieve method name
    public String getCourseName(){
        return courseName;
    }

    // REMEMBER:
    // when you inside the class each instance method of the class can see all of the classes other methods
    // and all of the classes data both instance data, instance variables and static variables as well.
    // Static methods can only see the other static members within the class.
    public void processGrades(){
        // output grades array
        outputGrades();

        // call method getAverage to calculate the average grade
        System.out.printf("%nClass average is %.2f%n", getAverage());

        // call methods getMinimum and getMaximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

        // call outputBarChart to print grades[0] is the smallest
        outputBarChart();

    }

    // find minimum grade
    public int getMinimum(){
        int lowGrade = grades[0]; // assume grades[0] is the smallest

        // loop through grades array
        for (int grade : grades){
            // if grade lower than lowGrade, assign it to lowGrade
            if (grade < lowGrade)
                lowGrade = grade; // new lowest grade
        }
        return lowGrade;
    }

    public int getMaximum(){
        int highGrade = grades[0]; // assume grades[0] is largest

        // loop through grades array
        for (int grade : grades){
            // if grade higher than highGrade, assign it to highGrade
            if(grade > highGrade)
                highGrade = grade; // new highest grade
        }
        return highGrade;
    }

    public double getAverage(){
        int total = 0;

        // sum grades for one student
        for(int grade : grades){
            total += grade;
        }

        // return average of grades

        // REMEMBER:
        // cast operator (double) has higher precedence than division operator
        return (double) total / grades.length;

    }

    public void outputBarChart(){
        System.out.printf("Grade distribution:");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        // for each grade increment the appropriate frequency
        for (int grade : grades)
            ++frequency[grade / 10];

        // for each grade frequency, print bar in chart
        for (int count = 0; count < frequency.length; count++) {
            // output bar label (00-09: ", ..., "90-99: ", "100: ")
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

            // print bar of asterisks
            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void outputGrades(){
        System.out.printf("The grades are:%n%n");

        // output each student's grade
        for (int student = 0; student < grades.length; student++)
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
    }

} // end class GradeBook



