package Library;
/**
 This program:
 - Validates user input with regular expressions

 Some Notes:
 - https://regexr.com/

 Created at 2020-02
 */
import java.util.Scanner;

public class RegexValidate {

    public static void main(String[] args) {

        // get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter last name");
        String lastName = scanner.nextLine();
        System.out.println("Please enter address:");
        String address = scanner.nextLine();
        System.out.println("Please enter city:");
        String city = scanner.nextLine();
        System.out.println("Please enter state:");
        String state = scanner.nextLine();
        System.out.println("Please enter zip:");
        String zip = scanner.nextLine();
        System.out.println("Please enter phone:");
        String phone = scanner.nextLine();

        // validate user input and display error message
        System.out.printf("%nValidate Result:");

        if (!RegexValidateInput.validateFirstName(firstName))
            System.out.println("Invalid first name");
        else if (!RegexValidateInput.validateLastName(lastName))
            System.out.println("Invalid last name");
        else if (!RegexValidateInput.validateAddress(address))
            System.out.println("Invalid address");
        else if (!RegexValidateInput.validateCity(city))
            System.out.println("Invalid city");
        else if (!RegexValidateInput.validateState(state))
            System.out.println("Invalid state");
        else if (!RegexValidateInput.validateZip(zip))
            System.out.println("Invalid zip code");
        else if (!RegexValidateInput.validatePhone(phone))
            System.out.println("Invalid phone number");
        else
            System.out.println("Valid Input.    Thank You.");
    }
}

class RegexValidateInput {

    // validate first name LT version
    public static boolean validateFirstName(String firstName){
        return firstName.matches("[A-Ž][a-žA-Ž]*");
    }

    // validate last name LT version
    public static boolean validateLastName(String lastName){
        return lastName.matches("[a-žA-Ž]+(['-][a-žA-Ž]+)*");
    }

    // validate address LT version
    public static boolean validateAddress(String address){
        return address.matches("([a-žA-Ž]+)(g\\.)?(\\sg\\.)?(\\s\\d+,)?(\\s\\d+-\\d+)?|(-\\d+)");
    }

    // validate city LT version
    public static boolean validateCity(String city){
        return city.matches("([a-žA-Ž]+|[a-žA-Ž]+\\s[a-žA-Ž]+)");
    }

    // validate state
    public static boolean validateState(String state){
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    // validate zip
    public static boolean validateZip(String zip){
        return zip.matches("\\d{5}");
    }

    // validate phone US version
//    public static boolean validatePhone(String phone){
//        return phone.matches("([1-9]\\d{2}-[1-9]\\d{2}-\\d{4})");
//    }

    // validate phone LT version
    public static boolean validatePhone(String phone){
        return phone.matches("([+]?(370|8))[ -]?(5|6)([0-9 -]+)");
    }

}
