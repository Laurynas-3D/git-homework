package OOP;

/**
 * Salary calculator application / (Employee hierarchy test program)
 *      PayrollSystemTest - Polymorphic Processing, Operator instanceof and Downcasting
 *      Employee - abstract superclass
 *      HourlyEmployee - class extends Employee
 *      CommissionEmployee - class extends Employee
 *      BasePlusCommissionEmployee - extends CommissionEmployee
 *      SalariedEmployee - concrete class extends abstract class Employee
 */

 // Employee.java / HourlyEmployee.java / CommissionEmployee.java / BasePlusCommissionEmployee.java /
 // PayrollSystemTest.java / SalariedEmployee.java

public class PayrollSystemTest {

    public static void main(String[] args) {

        // create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("Laurynas", "Mažuolis",
                "111-11-1111", 1200);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mindaugas", "Bernatavičius",
                "222-22-2222", 18.50,40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Pavel", "Marusenko",
                "333-33-3333", 1000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Virginijus",
                "Griežė", "444-44-4444",5000, 0.4, 300);

        System.out.println("Employees processed individually:");
        System.out.printf("%n%s%n%s: €%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%n%s%n%s: €%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s: €%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%n%s%n%s: €%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        // create four-element Employee array
        // [04:25:00]
        // QUESTION: how many employee objects are being created in line 33?
        Employee[] employees = new Employee[4];

        // initialize array with Employees

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorfically:%n%n");

        // [00:08:00] time mark
        // generically processed each element in array employees
        for (Employee currentEmployee : employees){
            System.out.println(currentEmployee); //invokes toString

            // [00:15:00] time mark
            // determine whether element is a BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee){
                // downcast Employee reference to BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is : €%,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("earned €%,.2f%n%n", currentEmployee.earnings());
        }

        // [00:19:00] time mark
        // get type name of each object in employees array
        for (int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
    }

} // end of class PayrollSystemTest

class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {

        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        this.weeklySalary = weeklySalary;
    }

    // calculate earnings; override abstract method earnings in Employee class
    // if we do not provide this method, we get compilation error, because of abstract method in abstract Employee class
    @Override
    public double earnings(){
        return getWeeklySalary();
    }

    // return String representation of SalariedEmployee object
    @Override
    public String toString(){
        return String.format("salaried employee: %s%n%s: €%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }

} // end of class SalariedEmployee

class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    // constructor

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {

        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");

        if ((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");

        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        this.hours = hours;
    }

    @Override
    public double earnings(){
        if (getHours() <= 40) //no overtime
            return getWage() * getHours();

        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }
    // return String representation of HourlyEmployee object
    @Override
    public String toString(){
        return String.format("hourly employee: %s%n%s: €%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }

} // end of class HourlyEmployee

abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s",getFirstName(),getLastName(), getSocialSecurityNumber());
    }

    // abstract method must be overridden by concrete classes, no implementation here
    public abstract double earnings();

} // end of abstract class Employee

class CommissionEmployee extends Employee {

    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                              double commissionRate) {

        super(firstName, lastName, socialSecurityNumber);

        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    // return String representation of CommissionEmployee object
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: €%,.2f; %s: %.2f", "commission employee", super.toString(),
                "gross sales", getGrossSales(), "commission rate", getCommissionRate());
    }

} // end of class CommissionEmployee

class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {

        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    // calculate earnings ; override abstract method earnings in CommissionEmployee
    // [00:03:26]
    // QUESTION:
    // If this method will be removed, would class BasePlusCommissionEmployee be abstract or would it be concrete?
    // ANSWER:
    // If class BasePlusCommissionEmployee does not define this earnings method it still inherits a concrete earnings
    // method from class CommissionEmployee and therefore BasePlusCommissionEmployee would be a concrete class regardless
    // of whether it implements its own version of earnings method. Only if class CommissionEmployee did not define an
    // earnings method, would we get an abstract version in class BasePlusCommissionEmployee. So no matter what based
    // on the hierarchy that proceeds BasePlusCommissionEmployee this class will be a concrete class.
    // REMEMBER:
    // when you inherit from a given super class in this case CommissionEmployee, you inherit the most
    // recently defined version of each method in hierarchy above you.
    // So going backwards, from class BasePlusCommissionEmployee to class CommissionEmployee, we can see that there is
    // in this class an implementation, a concrete implementation of the earnings method.
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    // return String representation of BasePlusCommissionEmployee object
    @Override
    public String toString(){
        return String.format("%s %s; %s: €%,.2f", "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }

} // end of class BasePlusCommissionEmployee
