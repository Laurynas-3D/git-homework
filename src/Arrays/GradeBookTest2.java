package Arrays;

/**
 * This program:
 * - GradeBookTest2 class using a two-dimensional array to store grades
 *
 * Some Notes:
 * - refs GradeBook2Test.java; GradeBook2.java
 *
 * Created at 2020-03
 */

public class GradeBookTest2 {
    public static void main(String[] args) {

        int[][] gradesArray = {{87,96,70},
                {68,87,90},
                {94,100,90},
                {100,81,82},
                {83,65,85},
                {78,87,65},
                {85,75,83},
                {91,94,100},
                {76,72,84},
                {87,93,73}};

        GradeBook2 myGradeBook = new GradeBook2("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for %n%s&n&n", myGradeBook.getCourseName());
        myGradeBook.processGrades();

    }
} // end class GradeBookTest2

class GradeBook2 {

    private String courseName;
    private int[][] grades;

    public GradeBook2(String courseName, int[][] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName ){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void processGrades(){
        // output grades array
        outputGrades();

        // call methods getMinimum and getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());

        // call outputBarChart to print grades[0] is the smallest
        outputBarChart();

    }


    public int getMinimum(){
        // assume first element og grades array is smallest
        int lowGrade = grades[0][0];

        // loop through of rows of grades in grades array

        // REMEMBER:
        // that two dimensional array in Java is is an array that refers to other arrays
        // we say here pick of each row which is one dimensional array of integers, we call that studentGrades, because
        // each row represents one student, then within that row which we call studentGrades get each grade and process it.
        for (int[] studentGrades : grades){
            // loop through columns of current row
            for (int grade : studentGrades){
                // if grade less than lowGrade, assign ir to lowGrade
                if (grade < lowGrade)
                    lowGrade = grade;
            }
        }
        return lowGrade;
    }

    public int getMaximum(){

        // assume first element og grades array is highest
        int highGrade = grades[0][0];

        for (int[] studentGrades : grades){
            for (int grade : studentGrades){
                if (grade > highGrade)
                    highGrade = grade;
            }
        }
        return highGrade;
    }

    public double getAverage(int[] setOfGrades){

        int total = 0;

        // sum grades for one student
        for(int grade : setOfGrades){
            total += grade;
        }

        // return average of grades
        // REMEMBER cast operator (double) has higher precedence than division operator
        return (double) total / setOfGrades.length;

    }

    public void outputBarChart(){

        System.out.printf("Overall grade distribution:");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        // stores frequency of grades in each range of 10 grades
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades)
                ++frequency[grade / 10];
        }

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
        System.out.print("            "); // align column heads

        // create column heading for each of the tests
        for (int test = 0; test < grades[0].length; test++)
            System.out.printf("Test %d  ", test + 1);

        System.out.println("Average"); // student average column heading

        // create rows/columns of text representing array grades
        for (int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student]) // output student's grades
                System.out.printf("%8d", test);

            // call method getAverage to calculate student's average grade;
            // pass row of grades as the argument to getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }

    }

} // end class GradeBook2
