 

public class ExtendedTicketMachine {

    // The price of a ticket

    private final int priceOfTicket;

    // The amount of money entered

    private int balance;

    // Name

    public String name;

    // Constructor

    /**
     * Creates a 'ticket machine' with a given price for each ticket
     * Note that the price must be greater than zero
     */
    public ExtendedTicketMachine(int val) {

        if (val <= 0) {

            throw new IllegalArgumentException("Cost must be greater than zero.");

        }

        priceOfTicket = val;
        balance = 0;

    }

    // Overloaded constructor

    public ExtendedTicketMachine(int cost, int initialBalance) {

        this(cost);
        this.balance = initialBalance;

    }

    // For name

    public ExtendedTicketMachine(int cost, int initialBalance, String name) {

        this(cost, initialBalance);
        this.name = name;

    }

    // Getters

    /**
     * Return the price of a ticket
     */
    public int getPriceOfTicket() {

        return priceOfTicket;

    }

    /**
     * Return the balance
     */
    public int getBalance() {

        return balance;

    }

    // Methods

    /**
     * Add money to the balance
     */
    public void addMoney(int amount) {

        balance += amount;

    }

    /**
     * Remove money from the balance
     */

    public void removeMoney(int amount) {

        balance -= amount;

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

        if (balance < priceOfTicket) {

            return false;

        } else {

            balance -= priceOfTicket;
            return true;

        }

    }

}
