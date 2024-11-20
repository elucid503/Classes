package Homework9;

/**
 * Commission extends Hourly and represents a commissioned employee who receives both hourly pay and sales commission.
 */
public class Commission extends Hourly {

    private double totalSales;
    private final double commissionRate; // Final as it should not be changed

    /**
     * Constructs a new Commission employee with the specified information.
     * @param name The employee's full name
     * @param address The employee's address
     * @param phone The employee's phone number
     * @param socialSecurityNumber The employee's social security number
     * @param hourlyRate The employee's hourly pay rate
     * @param commissionRate The employee's commission rate as a decimal
     */

    public Commission(String name, String address, String phone, String socialSecurityNumber, double hourlyRate, double commissionRate) {

        super(name, address, phone, socialSecurityNumber, hourlyRate); // Call the higher class constructor

        // Init class-specific fields

        this.commissionRate = commissionRate;
        this.totalSales = 0;

    }

    /**
     * Adds the specified sales amount to the employee's total sales.
     * @param sales The sales amount to add
     */
    public void addSales(double sales) {

        this.totalSales += sales;

    }

    /**
     * Calculates and returns the employee's total pay including both hourly pay and commission.
     * Resets both hours worked and total sales after calculating pay.
     * @return The total pay including hourly wages and sales commission
     */
    @Override
    public double pay() {

        double basePay = super.pay();
        double commission = totalSales * commissionRate;

        totalSales = 0; // Reset sales

        return basePay + commission;

    }

    /**
     * Returns a string representation of the commissioned employee.
     * @return A formatted string containing all employee information including sales
     */
    @Override
    public String toString() {

        return String.format("%s%nTotal Sales: $%.1f", super.toString(), totalSales); // This is a nice way to not write more code than needed; concats the output of the existing .toString() method

    }

}