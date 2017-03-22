package ars;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Router router = new Router();
    public static Flight flight = new Flight();
    public static Ticket ticket = new Ticket();
    public static int mainMode = 0;
    public static int subMode = 1;

    /*
        mainMode 1: Book a Ticket
        mainMode 2: Change a Ticket
    */
    public static void main(String[] args) {

        while (mainMode != 3) {
            
            subMode = 1;
            printMainMenu();
            mainMode = scanner.nextInt();

            switch (mainMode) {
                case 1:
                        
                    while( subMode != 0 ) {
                        switch(subMode){
                            case 1:
                                subMode = router.main();
                                break;
                            case 2:
                                subMode = flight.main();
                                break;
                            case 3:
                                subMode = ticket.main();
                                break;
                        }
                    }
                    break;

                case 2:
                    
                    changeTicket();
                    
                    while( subMode != 0 ) {
                        switch(subMode){
                            case 1:
                                subMode = router.main();
                                break;
                            case 2:
                                subMode = flight.main();
                                break;
                            case 3:
                                subMode = ticket.main();
                                break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Press key number 1-3");
                    break;
            }

            router.clear();
            flight.clear();
            ticket.clear();

            //Test Class
            ticket.printTicketAll();
            flight.printFlightAll();
        }
    }

    public static void printMainMenu() {

        System.out.println("----------------------------------------");
        System.out.println("Welcome to Airline Reservation System");
        System.out.println("----------------------------------------");
        System.out.println("1) Book a ticket");
        System.out.println("2) Change a ticket");
        System.out.println("3) Exit");
        System.out.println("----------------------------------------");
        System.out.println("Press key number 1-3 and Enter : ");
        System.out.println("----------------------------------------");
    }
    
    public static void changeTicket(){

        System.out.println("----------------------------------------");
        System.out.println("press key name and Enter ");
        System.out.println("----------------------------------------");
        ticket.setName( scanner.next() );
        
        if ( ticket.isNotTicket() ){
            System.out.println("Name not found in system.");
            subMode = 0;
        }else{
            ticket.printTicket();
            System.out.println("----------------------------------------");
            System.out.println("press key Flight ID and Enter ");
            System.out.println("----------------------------------------");
            flight.setFlightID(scanner.next());
            System.out.println("----------------------------------------");
            System.out.println("you are cancle(key 0) ticket or renew ticket(key 1)? ");
            System.out.println("----------------------------------------");
            if(scanner.nextInt()==0){
                subMode = 0;
            }
            ticket.delTicket();
            
        }
    }
}