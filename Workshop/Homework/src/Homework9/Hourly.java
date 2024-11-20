package Homework9;

/**
 * Hourly represents an hourly employee with basic personal information and pay calculation.
 */
public class Hourly {

    private String name;
    private String address;

    private String phone;

    private String socialSecurityNumber;

    private double hourlyRate;
    private double hoursWorked;

    /**
     * Constructs a new Hourly employee with the specified information.
     * @param name The employee's full name
     * @param address The employee's address
     * @param phone The employee's phone number
     * @param socialSecurityNumber The employee's social security number
     * @param hourlyRate The employee's hourly pay rate
     */

    public Hourly(String name, String address, String phone, String socialSecurityNumber, double hourlyRate) {

        // Init fields

        this.name = name;
        this.address = address;
        this.phone = phone;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0;

    }

    /**
     * Adds the specified hours to the employee's total hours worked.
     * @param hours The number of hours to add
     */
    public void addHours(double hours) {

        this.hoursWorked += hours;

    }

    /**
     * Calculates and returns the employee's pay for the current pay period.
     * Resets hours worked after calculating pay.
     * @return The total pay for the current pay period
     */
    public double pay() {

        double payment = hoursWorked * hourlyRate;

        hoursWorked = 0; // Reset hours

        return payment;

    }

    /**
     * Returns a string representation of the hourly employee.
     * @return A formatted string containing all employee information
     */
    @Override
    public String toString() {

        // This method works similarly to printf, and is convenient in this case. Docs for it are at https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html

        return String.format(
                "Name: %s%n" +
                        "Address: %s%n" +
                        "Phone: %s%n" +
                        "SSN: %s%n" +
                        "Hourly Rate: $%.2f%n" +
                        "Hours Worked: %.1f",
                name, address, phone, socialSecurityNumber, hourlyRate, hoursWorked
        );

    }

}
