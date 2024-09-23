public class ExtendedTicketMachine {

    // The price of a ticket

    private final int priceOfTicket;

    // The amount of money entered

    private int balance;

    // Constructor

    /**
     * Creates a 'ticket machine' with a given price for each ticket
     * Note that the price must be greater than zero
     */
    public ExtendedTicketMachine(int cost) {

        if (cost <= 0) {

            throw new IllegalArgumentException("Cost must be greater than zero.");

        }

        this.priceOfTicket = cost;
        this.balance = 0;

    }

    // Getters

    /**
     * Return the price of a ticket
     */
    public int getPriceOfTicket() {

        return this.priceOfTicket;

    }

    /**
     * Return the balance
     */
    public int getBalance() {

        return this.balance;

    }

    // Methods

    /**
     * Add money to the balance
     */
    public void addMoney(int amount) {

        this.balance += amount;

    }

    /**
     * Remove money from the balance
     */

    public void refundMoney(int amount) {

        this.balance -= amount;

    }

    /**
     *
     * Refunds all remaining money
     *
     */

    public int refundChange() {

        int toReturn = this.balance; // temp holder
        this.balance = 0;
        return toReturn;

    }

    /**
     * Buy and print a ticket
     * Returns an ambiguous error if balance is not high enough.
     * */
    public void buyAndPrintTicket()  {

        boolean wasSuccessful = buyTicket();

        if (!wasSuccessful) {

            System.out.println("Balance is too low. You must insert at least: " + (priceOfTicket - balance) + " more dollars.");
            return;

        }

        // 'Print' a ticket

        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + priceOfTicket + " dollars.");
        System.out.println("##################");

    }

    // Private methods

    /**
     * Try to 'buy' a ticket with the current balance
     * Returns true if successful, false otherwise
     */
    private boolean buyTicket() {

        if (this.balance < priceOfTicket) {

            return false;

        } else {

            this.balance -= priceOfTicket;
            return true;

        }

    }

}
