package Homework9;

/**
    Staff is a helper class responsible for managing all the employees (hourly and commissioned) and processing their "payments".
 */
class Staff {

    /** Array to hold all employees */
    private Hourly[] staffList;

    /**
     * Constructs a new Staff object and initializes the employee list.
     */
    public Staff() {

        staffList = new Hourly[8];

        // Initialize hourly employees

        staffList[0] = new Hourly("Ken Thompson", "123 Main St", "123-456-7890", "123-45-6789", 15.00);
        staffList[1] = new Hourly("Linus Torvalds", "456 Elm St", "987-654-3210", "987-65-4321", 18.50);

        // Add commissioned employees

        staffList[2] = new Commission("Carson Gross", "789 Oak St", "555-123-4567", "555-55-5555", 6.25, 0.20);
        staffList[3] = new Commission("Terry", "321 Pine St", "555-765-4321", "666-66-6666", 9.75, 0.15);

    }

    /**
     * Processes and displays payments for all employees in the staff list.
     */
    public void processPayments() {

        for (Hourly employee : staffList) {

            if (employee != null) {

                double payment = employee.pay();

                System.out.println(employee);

                System.out.println("Payment: $" + String.format("%.2f", payment));
                System.out.println("------------------------");

            }

        }

    }

    /**
     * Main method to demonstrate the "payroll system".
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {

        Staff staff = new Staff();

        // Add hours for all employees
        staff.staffList[0].addHours(35.0);
        staff.staffList[1].addHours(40.0);

        // Must assert the Commission type because the methods below are not in the Hourly class. This is important to note because in the assignment, a type of "Employee"

        Commission employee3 = (Commission)staff.staffList[2];

        employee3.addHours(37.5);
        employee3.addSales(1000.0);

        Commission employee4 = (Commission)staff.staffList[3];

        employee4.addHours(40.0);
        employee4.addSales(1500.0);

        // Process payments for all employees

        staff.processPayments();

    }

}