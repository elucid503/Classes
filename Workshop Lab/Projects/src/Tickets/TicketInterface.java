package Tickets;

import java.util.Scanner;

public class TicketInterface {

    static Scanner scanner = new Scanner(System.in);

    static ExtendedTicketMachine ticketMachine;

    public static void main(String[] argv) {

        int cost;

        if (argv != null && argv.length > 0) {

            cost = Integer.parseInt(argv[0]);

        } else {

            cost = 20;

        }

        ticketMachine = new ExtendedTicketMachine(cost);

        System.out.printf("Welcome. Each ticket is %d dollars.\nEnter how many tickets you want to buy: ", ticketMachine.getPriceOfTicket());

        int tickets = scanner.nextInt();

        System.out.printf("You want to buy %d tickets. Enter the amount of money you want to insert: ", tickets);

        int money = scanner.nextInt();

        ticketMachine.addMoney(money);

        System.out.printf("You have inserted %d dollars. Your balance is %d dollars.\n", money, ticketMachine.getBalance());

        if (ticketMachine.getBalance() < ticketMachine.getPriceOfTicket() * tickets) {

            System.out.printf("You need to insert %d more dollars to buy %d tickets.\n", ticketMachine.getPriceOfTicket() * tickets - ticketMachine.getBalance(), tickets);

        } else {

            for (int i = 0; i < tickets; i++) {

                ticketMachine.buyAndPrintTicket();

            }

            System.out.printf("You have bought %d tickets. Your balance is %d dollars.\n", tickets, ticketMachine.getBalance());

        }

    }

}
