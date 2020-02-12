package OOP;

import java.util.Scanner;

/**
 * Email application
 *
 * Scenario: You are an IT Support Administrator Specialist
 * and are charged with the task of creating email accounts for new hires.
 *
 * This app should:
 * Generate email with the following syntax: firstname.lastname@department.company.com
 * Determine the department(sales, development, accounting) if none, leave blank.
 * Generate random string for password.
 * Have set methods to change password, set mail box capacity, and define alternate email address
 * Have get methods to display the name, email, and mailbox capacity.
 *
 */

public class EmailApp {
    public static void main (String[] args){

        EmailGenerator email1 = new EmailGenerator("Laurynas", "Mažuolis");
        EmailGenerator email2 = new EmailGenerator("Mindaugas", "Bernatavičius");
        System.out.println(email1.showInfo());
        System.out.println(email2.showInfo());

    }
} // end class EmailApp


class EmailGenerator {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 12;
    private String department;
    private String email;
    private int mailBoxCapacity;
    private String alternateEmail;
    private String companySuffix = "lauris-company.com";

    // Constructor to receive the first-name and last-name
    public EmailGenerator(String firstName, String lastName) {

        setFirstName(firstName);
        setLastName(lastName);

        // Call a method for the department - return the department
        setDepartment();

        // Combine elements to generate email
        setEmail();

        // Call a method that returns a random password.
        setPassword();

    }

    // Ask Name
    private String askName(String firstName, String lastName){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name1 = input.nextLine();
        System.out.println("Enter Your Last Name: ");
        String name2 = input.nextLine();

        return (name1 + name2);
    }

    public String getDepartment() {
        return department;
    }

    // Ask for the department
    private String setDepartment(){
        System.out.println("New worker: " + getFirstName() +
                "\nDepartments Codes: " +
                "\n1 for Sales " +
                "\n2 for Development " +
                "\n3 for Accounting " +
                "\n0 for none " +
                "\nEnter Department Code: ");

        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){
            setMailBoxCapacity(800);
            return this.department = "sales.";
        }
        else if (depChoice == 2){
            setMailBoxCapacity(1500);
            return this.department = "dev.";
        }
        else if (depChoice == 3){
            setMailBoxCapacity(600);
            return this.department = "acc.";
        }
        else {
            setMailBoxCapacity(500);
            return this.department = "";
        }
    }

    // Generate a random password
    private String generateRandomPassword(int passwordLength) {
        String passwordset = "ABCDEFGHIJKLMNOPRSTUVWXYZ0123456789";
        char[] password = new char[passwordLength];
        for (int i=0; i<passwordLength; i++) {
            int randomValue = (int) (Math.random() * passwordset.length());
            password[i] = passwordset.charAt(randomValue);
        }
        return new String (password);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    // Set the alternate mail
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password.
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(){
        String password = generateRandomPassword(defaultPasswordLength);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = getFirstName().toLowerCase() +
                "."+ getLastName().toLowerCase() +
                "@" + getDepartment() +
                companySuffix;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + getFirstName() + " " + getLastName() +
                "\nCOMPANY EMAIL: " + email +
                "\nYOUR PASSWORD: " + getPassword() +
                "\nMAILBOX CAPACITY: " + getMailBoxCapacity() + "MB" +
                "\n----";
    }

} // end class EmailGenerator