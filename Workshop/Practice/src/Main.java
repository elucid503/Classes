public class Main {

    public static void main(String[] argv) {

        System.out.println("Ticket Machine Test");

        ExtendedTicketMachine TicketMachine = new ExtendedTicketMachine(20);

        System.out.println("The price of a ticket is: " + TicketMachine.getPriceOfTicket());

        TicketMachine.addMoney(45);

        System.out.println("The balance is: " + TicketMachine.getBalance());

        TicketMachine.buyAndPrintTicket();

        System.out.println("The balance is: " + TicketMachine.getBalance());

        TicketMachine.removeMoney(10);

        System.out.println("The balance is: " + TicketMachine.getBalance());

        TicketMachine.buyAndPrintTicket();

        TicketMachine.addMoney(10);

        TicketMachine.buyAndPrintTicket();

    }

}
