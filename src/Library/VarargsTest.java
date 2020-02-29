package Library;
/**
 * This program:
 * - Uses variable-length argument lists
 *
 * Some Notes:
 * -
 *
 * Created at 2020-02
 */
public class VarargsTest {

    // NOTE:
    // calculate average
    // vararg parameter must be the last parameter in the parameter list
    // you can have other parameters before this, but lets say double that
    // uses ... notation must be the last in parameters list
    public static double average(double... numbers){
        double total = 0.0;

        // calculate total using the enhanced for statement
        for (double d : numbers)
            total += d;

        return total / numbers.length;
    }

    public static void main(String[] args){
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n", d1, d2, d3, d4);

        System.out.printf("Average of d1 and d2 is %.1f%n", average(d1,d2));
        System.out.printf("Average of d1, d2 and d3 is %.1f%n", average(d1,d2,d3));
        System.out.printf("Average of d1, d2 d3 and d4 is %.1f%n ", average(d1,d2,d3,d4));
    }
}
