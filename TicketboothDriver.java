//// The purpose of this program is to create a ticketbooth application in which
// the user is able to control practically everything provided to him in the menu
// which includes the tickets, OPUS cards, etc.
// Multiple classes with their own attributes and methods will be required as well as arrays of objects
import java.util.Scanner;
public class TicketboothDriver {

    public static void main(String[] args) {

        Scanner keyIn = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("   Welcome to the Geek's OPUS TicketBooth Application");
        System.out.println("--------------------------------------------------------------------");
        

        //2 tickets with same ticket distribution 
        Tickets tickets0 = new Tickets(5,1,0,1,1);
        Tickets tickets1 = new Tickets(5,1,0,1,1);
        //1 ticket with same total value of tickets of another ticketbooth, with different configuration
        Tickets tickets2 = new Tickets(6,1,0,3,0);
        //2 other tickets with the same breakdown of tickets
        Tickets tickets3 = new Tickets(0,1,1,1,1);
        Tickets tickets4 = new Tickets(0,1,1,1,1);
       
        //6 different OPUS cards with filled out descriptions
        OPUSCards opusC1 = new OPUSCards("STM", "M. Cola", 8, 2024);
        OPUSCards opusC2 = new OPUSCards("RTL", "C. Venus", 3, 2025);
        OPUSCards opusC3 = new OPUSCards("STM", "Z. Poker", 10, 2022);
        OPUSCards opusC4 = new OPUSCards("RTL", "F. Max", 12, 2021);
        OPUSCards opusC5 = new OPUSCards("REM", "T. Flona", 4, 2023);
        OPUSCards opusC6 = new OPUSCards("TRAMREM", "S. EaFL", 11, 2021);
        
        //5 different arrays that will be used to determine how many OPUS cards a ticketbooth will contain
        OPUSCards[] array1 = {opusC1,opusC4};
        OPUSCards[] array2 = {opusC2,opusC3};
        OPUSCards[] array3 = {opusC1,opusC5,opusC6};
        OPUSCards[] array4 = {};
        OPUSCards[] array5 = {};
       
        //2 ticketbooths with same ticket distribution and same number of OPUS cards
        Ticketbooth ticketbooth0 = new Ticketbooth(tickets0, array1);
        Ticketbooth ticketbooth1 = new Ticketbooth(tickets1, array2);
        //1 ticketbooth with same total value of tickets of another ticketbooth, with different configuration and 3 OPUS cards
        Ticketbooth ticketbooth2 = new Ticketbooth(tickets2, array3);
        //2 other ticketbooths with the same breakdown of tickets with no OPUS cards
        Ticketbooth ticketbooth3 = new Ticketbooth(tickets3, array4);
        Ticketbooth ticketbooth4 = new Ticketbooth(tickets4, array5);
       
        

        boolean loop = true;
		do
        {
        System.out.println("Please enter any button to continue....");
        keyIn.nextLine();
        keyIn.nextLine();
        
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. See the content of all Ticketbooth");
            System.out.println("2. See the content of one Ticketbooth");
            System.out.println("3. List Ticketbooths with same amount of tickets' values");
            System.out.println("4. List Ticketbooths with same tickets amount");
            System.out.println("5. List Ticketbooths with same amount of tickets values and same number of OPUS cards");
            System.out.println("6. Add an OPUS card to an existing Ticketbooth");
            System.out.println("7. Remove an existing OPUS card from a Ticketbooth");
            System.out.println("8  Update the expiry date of an existing OPUS card");
            System.out.println("9. Add Tickets to a Ticketbooth");
            System.out.println("0. To quit");
            System.out.print("\nPlease enter your choice and press <Enter>: ");
            int menu = keyIn.nextInt();
           
            //ticketbooth is initialized and declared to be used as a variable in the switch statements below
            int ticketbooth = 0;
            //two booleans are also initialized for use in future loops within the switch statements
            boolean loop1 = true;
            boolean loop2 = true;
            
                switch (menu)
                {
                    case 1:
                        System.out.println("Content of all Ticketbooths:");
                        System.out.println("-----------------------------");
                        System.out.println("\nTicketbooth #0\n----------------------\n"+ticketbooth0);
                        System.out.println("\nTicketbooth #1\n----------------------"+ticketbooth1);
                        System.out.println("\nTicketbooth #2\n----------------------"+ticketbooth2);
                        System.out.println("\nTicketbooth #3\n----------------------"+ticketbooth3);
                        System.out.println("\nTicketbooth #4\n----------------------"+ticketbooth4);
                        break;
                 
                    case 2:
                        while(loop1)
                        {
                                System.out.print("Which ticketbooth would you like to see the content of? (Enter number 0 to 4): ");
                                ticketbooth = keyIn.nextInt();
                                if(ticketbooth == 0)
                                {
                                	System.out.println(ticketbooth0);
                                        	loop1 = false;
                                        	break;
                                		}
                                if(ticketbooth == 1)
                                {
                                	System.out.println(ticketbooth1);
                                        loop1 = false;
                                        break;
                                	}
                                if(ticketbooth == 2)
                                {
                                	System.out.println(ticketbooth2);
                                        loop1 = false;
                                        break;
                                	}
                                if(ticketbooth == 3)
                                {
                                	System.out.println(ticketbooth3);
                                        loop1 = false;
                                        break;
                                	}
                                if(ticketbooth == 4)
                                {
                                	System.out.println(ticketbooth4);
                                        loop1 = false;
                                        break;
                                	}
                                else
                                {
                                        System.out.println("--> Try again: (Enter number 0 to 4)");
                                	}
                        	}
                        break;
                  
                    case 3:
                    	//The coming if statements will all be calling the ticketBoothValue and totalValue methods in order to calculate whether or not
                    	//ticketbooth(x) is equal to ticketboot(y) in terms of tickets value
                        if(ticketbooth0.ticketBoothValue(ticketbooth0,ticketbooth1)==true)
                        {
                                System.out.println("Ticketbooths 0 and 1 both have $" + ticketbooth0.totalValue());
                        		}
                        if(ticketbooth0.ticketBoothValue(ticketbooth0,ticketbooth2)==true)
                        		{
                                System.out.println("Ticketbooths 0 and 2 both have $" + ticketbooth0.totalValue());
                        			}
                        if(ticketbooth0.ticketBoothValue(ticketbooth0,ticketbooth3)==true)
                        {
                                System.out.println("Ticketbooths 0 and 3 both have $" + ticketbooth0.totalValue());
                        			}
                        if(ticketbooth0.ticketBoothValue(ticketbooth0,ticketbooth4)==true)
                        {
                                System.out.println("Ticketbooths 0 and 4 both have $" + ticketbooth0.totalValue());
                        			}        
                        if(ticketbooth1.ticketBoothValue(ticketbooth1,ticketbooth2)==true)
                        {
                                System.out.println("Ticketbooths 1 and 2 both have $" + ticketbooth1.totalValue());
                        			}
                        if(ticketbooth1.ticketBoothValue(ticketbooth1,ticketbooth3)==true)
                        {
                                System.out.println("Ticketbooths 1 and 3 both have $" + ticketbooth1.totalValue());
                        			}
                        if(ticketbooth1.ticketBoothValue(ticketbooth1,ticketbooth4)==true)
                        {
                                System.out.println("Ticketbooths 1 and 4 both have $" + ticketbooth1.totalValue());
                        			}
                        if(ticketbooth2.ticketBoothValue(ticketbooth2,ticketbooth3)==true)
                        {
                                System.out.println("Ticketbooths 2 and 3 both have $" + ticketbooth2.totalValue());
                        			}
                        if(ticketbooth2.ticketBoothValue(ticketbooth2,ticketbooth4)==true)
                        {
                                System.out.println("Ticketbooths 2 and 4 both have $" + ticketbooth2.totalValue());
                        			}			
                        if(ticketbooth3.ticketBoothValue(ticketbooth3,ticketbooth4)==true)
                        {
                                System.out.println("Ticketbooths 3 and 4 both have $" + ticketbooth3.totalValue());
                        			}
                        else
                        {
                                System.out.println("None of the ticketbooths are equal in total ticket value");
                        			}
                        break;
                  
                    case 4:
                    	
                    	//Case 4's if statements calls the ticketBoothTickets method which checks if
                    	//ticketbooth(x) contains the exact same tickets as ticketbooth(y)
                        if(ticketbooth0.ticketBoothTickets(ticketbooth0,ticketbooth1)==true)
                        {
                                System.out.println("\nTicketbooths 0 and 1 both have " + tickets0);
                        	}
                        if(ticketbooth0.ticketBoothTickets(ticketbooth0,ticketbooth2)==true)
                        {
                                System.out.println("\nTicketbooths 0 and 2 both have " + tickets0);
                        	}
                        if(ticketbooth0.ticketBoothTickets(ticketbooth0,ticketbooth3)==true)
                        {
                                System.out.println("\nTicketbooths 0 and 3 both have " + tickets0);
                        	}
                        if(ticketbooth0.ticketBoothTickets(ticketbooth0,ticketbooth4)==true)
                        {
                                System.out.println("\nTicketbooths 0 and 4 both have " + tickets0);
                        	}
                        if(ticketbooth1.ticketBoothTickets(ticketbooth1,ticketbooth2)==true)
                        {
                                System.out.println("\nTicketbooths 1 and 2 both have " + tickets1);
                        	}
                        if(ticketbooth1.ticketBoothTickets(ticketbooth1,ticketbooth3)==true)
                        {
                                System.out.println("\nTicketbooths 1 and 3 both have " + tickets1);
                        	}
                        if(ticketbooth1.ticketBoothTickets(ticketbooth1,ticketbooth4)==true)
                        {
                                System.out.println("\nTicketbooths 1 and 4 both have " + tickets1);
                        	}
                        if(ticketbooth2.ticketBoothTickets(ticketbooth2,ticketbooth3)==true)
                        {
                                System.out.println("\nTicketbooths 2 and 3 both have " + tickets3);
                        	}
                        if(ticketbooth2.ticketBoothTickets(ticketbooth2,ticketbooth4)==true)
                        {
                                System.out.println("\nTicketbooths 2 and 4 both have " + tickets3);
                        	}
                        if(ticketbooth3.ticketBoothTickets(ticketbooth3,ticketbooth4)==true)
                        {
                                System.out.println("\nTicketbooths 3 and 4 both have " + tickets4);
                        	}
                        else
                        {
                                System.out.println("None of the ticketbooths contain the same amount of each type of tickets");
                        	}
                        break;
                   
                    case 5:
                    	//case 5's personal method thats being called is the .equals() method which checks if
                    	//ticketbooth(x) contains the same value of all the tickets as well as the amount of OPUS cards it has
                    	if(ticketbooth0.equals(ticketbooth0,ticketbooth1)==true)
                        {
                                System.out.println("Ticketbooths 0 and 1");
                        	}
                        if(ticketbooth0.equals(ticketbooth0,ticketbooth2)==true)
                        {
                                System.out.println("Ticketbooths 0 and 2");
                        	}
                        if(ticketbooth0.equals(ticketbooth0,ticketbooth3)==true)
                        {
                                System.out.println("Ticketbooths 0 and 3");
                        	}
                        if(ticketbooth0.equals(ticketbooth0,ticketbooth4)==true)
                        {
                                System.out.println("Ticketbooths 0 and 4");
                        	}
                        if(ticketbooth1.equals(ticketbooth1,ticketbooth2)==true)
                        {
                                System.out.println("Ticketbooths 1 and 2");
                        	}
                        if(ticketbooth1.equals(ticketbooth1,ticketbooth3)==true)
                        {
                                System.out.println("Ticketbooths 1 and 3");
                        	}
                        if(ticketbooth1.equals(ticketbooth1,ticketbooth4)==true)
                        {
                                System.out.println("Ticketbooths 1 and 4");
                        	}
                        if(ticketbooth2.equals(ticketbooth2,ticketbooth3)==true)
                        {
                                System.out.println("Ticketbooths 2 and 3");
                        	}
                        if(ticketbooth2.equals(ticketbooth2,ticketbooth4)==true)
                        {
                                System.out.println("Ticketbooths 2 and 4");
                        	}
                        if(ticketbooth3.equals(ticketbooth3,ticketbooth4)==true)
                        {
                                System.out.println("Ticketbooths 3 and 4");
                        	}
                        else
                        {
                                System.out.println("None");
                        	}
                        break;
                    case 6:
                    	//case 6 finally uses one of the loops to make sure the user is able to attempt which ticketbooth 
                    	//they want to add an OPUS card to in case of invalid inputs
                        while(loop1) 
                        {
                                System.out.print("Which Ticketbooth do you want to add an OPUS card to? (Enter number 0 to 4) ");
                                ticketbooth = keyIn.nextInt();
                                if(ticketbooth == 0)
                                {
                                		System.out.println("Please enter the following information so that we may complete the transaction-");
                                			
                                		System.out.print("---> Type of OPUS card (STL, RTL, etc ..): ");
                                		String cardType = keyIn.next();                                      
                                       
                                		System.out.print("---> Full name on Opus card: ");
                                        String fullName = keyIn.nextLine()+keyIn.nextLine();
                                       
                                        
                                        System.out.print("---> Expiry month number and year (separate by a space): ");
                                        int expiryMonth = keyIn.nextInt();
                                        int expiryYear = keyIn.nextInt();                                      
                                        
                                        //The addOpusCard method is invoked here as a new integer is defined with the set parameters
                                        //of cardType, fullName, expiryMonth, ExpiryYear. 
                                        OPUSCards addedOpusCard = new OPUSCards(cardType, fullName, expiryMonth, expiryYear);
                                        //The returned value from the method is the length of type array cards.Opus.
                                        int nbOpusCards = ticketbooth0.addOpusCard(addedOpusCard);                                      
                                        System.out.println("You now have " + (nbOpusCards) + " OPUS Cards");
                                        
                                        //loop1 is set to false in order to break out of the loop rather than letting the user input another ticketbooth to add an OPUS card to
                                        loop1 = false;
                                        break;
                                	}
                                if(ticketbooth == 1)
                                {
                                	System.out.println("Please enter the following information so that we may complete the transaction-");
                        			
                            		System.out.print("---> Type of OPUS card (STL, RTL, etc ..): ");
                            		String cardType = keyIn.next();                                      
                                   
                            		System.out.print("---> Full name on Opus card: ");
                                    String fullName = keyIn.nextLine()+keyIn.nextLine();
                                   
                                    
                                    System.out.print("---> Expiry month number and year (separate by a space): ");
                                    int expiryMonth = keyIn.nextInt();
                                    int expiryYear = keyIn.nextInt();                                      
                                    
                                    
                                    OPUSCards addedOpusCard = new OPUSCards(cardType, fullName, expiryMonth, expiryYear);
                                    int nbOpusCards = ticketbooth1.addOpusCard(addedOpusCard);                                      
                                    System.out.println("You now have " + (nbOpusCards) + " OPUS Cards");
                                    
                                    loop1 = false;
                                    break;
                                	}
                                if(ticketbooth == 2)
                                {
                                	System.out.println("Please enter the following information so that we may complete the transaction-");
                        			
                            		System.out.print("---> Type of OPUS card (STL, RTL, etc ..): ");
                            		String cardType = keyIn.next();                                      
                                   
                            		System.out.print("---> Full name on Opus card: ");
                                    String fullName = keyIn.nextLine()+keyIn.nextLine();
                                   
                                    
                                    System.out.print("---> Expiry month number and year (separate by a space): ");
                                    int expiryMonth = keyIn.nextInt();
                                    int expiryYear = keyIn.nextInt();                                      
                                    
                                    
                                    OPUSCards addedOpusCard = new OPUSCards(cardType, fullName, expiryMonth, expiryYear);
                                    int nbOpusCards = ticketbooth2.addOpusCard(addedOpusCard);                                      
                                    System.out.println("You now have " + (nbOpusCards) + " OPUS Cards");
                                    
                                    loop1 = false;
                                    break;
                                	}
                                if(ticketbooth == 3)
                                {
                                	System.out.println("Please enter the following information so that we may complete the transaction-");
                        			
                            		System.out.print("---> Type of OPUS card (STL, RTL, etc ..): ");
                            		String cardType = keyIn.next();                                      
                                   
                            		System.out.print("---> Full name on Opus card: ");
                                    String fullName = keyIn.nextLine()+keyIn.nextLine();
                                   
                                    
                                    System.out.print("---> Expiry month number and year (separate by a space): ");
                                    int expiryMonth = keyIn.nextInt();
                                    int expiryYear = keyIn.nextInt();                                      
                                    
                                    
                                    OPUSCards addedOpusCard = new OPUSCards(cardType, fullName, expiryMonth, expiryYear);
                                    int nbOpusCards = ticketbooth3.addOpusCard(addedOpusCard);                                      
                                    System.out.println("You now have " + (nbOpusCards) + " OPUS Cards");
                                    
                                    loop1 = false;
                                    break;
                                	}
                                if(ticketbooth == 4)
                                {
                                	System.out.println("Please enter the following information so that we may complete the transaction-");
                        			
                            		System.out.print("---> Type of OPUS card (STL, RTL, etc ..): ");
                            		String cardType = keyIn.next();                                      
                                   
                            		System.out.print("---> Full name on Opus card: ");
                                    String fullName = keyIn.nextLine()+keyIn.nextLine();
                                   
                                    
                                    System.out.print("---> Expiry month number and year (separate by a space): ");
                                    int expiryMonth = keyIn.nextInt();
                                    int expiryYear = keyIn.nextInt();                                      
                                    
                                    
                                    OPUSCards addedOpusCard = new OPUSCards(cardType, fullName, expiryMonth, expiryYear);
                                    int nbOpusCards = ticketbooth4.addOpusCard(addedOpusCard);                                      
                                    System.out.println("You now have " + (nbOpusCards) + " OPUS Cards");
                                    
                                    loop1 = false;
                                    break;
                                	}
                                else
                                {
                                        System.out.println("Ticketbooth " + ticketbooth + " does not exist");
                                	}
                        	}
                        break;
                    case 7:
                        while(loop1) 
                        {
                                System.out.print("\nWhich Ticketbooth would you like to remove an OPUS card from? (Enter number 0 to 4): ");
                                ticketbooth = keyIn.nextInt();
                                if(ticketbooth == 0)
                                {
                                        if(ticketbooth0.nbOpusCards() == 0)
                                        {
                                                System.out.println("No OPUS cards");
                                                		//loop2 and loop1 are set as false which backs the user out to the menu
                                                		loop2 = false;
                                                        loop1 = false;
                                                        break;
                                        	}
                                        while(loop2) 
                                        {
                                                System.out.println("Enter card number 0 to "+(ticketbooth0.nbOpusCards()-1));
                                                int cardNumber = keyIn.nextInt();
                                                if(cardNumber > (ticketbooth0.nbOpusCards()-1))
                                                {
                                                        System.out.println("Card " + cardNumber + " does not exist");
                                                        System.out.println("--> Try again:");
                                                        loop2 = true;
                                                        loop1 = true;
                                                	}
                                                else
                                                {
                                                        for(int i = 0; i < ticketbooth0.nbOpusCards(); i++)
                                                        {
                                                                if(cardNumber == i)
                                                                {
                                                                	//removeOpusCard is the next new method that is invoked which ends up removing the OPUS card from the ticketbooth
                                                                	//by reducing the length of the number of OPUS cards and replacing the removed card by the following card
                                                                        ticketbooth0.removeOpusCard(cardNumber); 
                                                                System.out.println("Card was removed successfully");                           
                                                                        loop2 = false;
                                                                        loop1 = false;
                                                                        break;
                                                                	}
                                                        	}
                                                	}
                                        	}                                       
                                        break;
                                	}                               
                                if(ticketbooth == 1)
                                {
                                	 if(ticketbooth1.nbOpusCards() == 0)
                                     {
                                             System.out.println("No OPUS cards");
                                             		loop2 = false;
                                                     loop1 = false;
                                                     break;
                                     	}
                                     while(loop2) 
                                     {
                                             System.out.println("Enter card number 0 to "+(ticketbooth1.nbOpusCards()-1));
                                             int cardNumber = keyIn.nextInt();
                                             if(cardNumber > (ticketbooth1.nbOpusCards()-1))
                                             {
                                                     System.out.println("Card " + cardNumber + " does not exist");
                                                     System.out.println("--> Try again:");
                                                     loop2 = true;
                                                     loop1 = true;
                                             	}
                                             else
                                             {
                                                     for(int i = 0; i < ticketbooth1.nbOpusCards(); i++)
                                                     {
                                                             if(cardNumber == i)
                                                             {
                                                                     ticketbooth1.removeOpusCard(cardNumber); 
                                                             System.out.println("Card was removed successfully");                           
                                                                     loop2 = false;
                                                                     loop1 = false;
                                                                     break;
                                                             	}
                                                     	}
                                             	}
                                     	}                                       
                                     break;
                                	}
                             
                                if(ticketbooth == 2)
                                {
                                	 if(ticketbooth2.nbOpusCards() == 0)
                                     {
                                             System.out.println("No OPUS cards");
                                             		loop2 = false;
                                                     loop1 = false;
                                                     break;
                                     	}
                                     while(loop2) 
                                     {
                                             System.out.println("Enter card number 0 to "+(ticketbooth2.nbOpusCards()-1));
                                             int cardNumber = keyIn.nextInt();
                                             if(cardNumber > (ticketbooth2.nbOpusCards()-1))
                                             {
                                            	 System.out.println("Card " + cardNumber + " does not exist");   
                                            	 System.out.println("--> Try again:");
                                            	  	loop2 = true;
                                                     loop1 = true;
                                             	}
                                             else
                                             {
                                                     for(int i = 0; i < ticketbooth2.nbOpusCards(); i++)
                                                     {
                                                             if(cardNumber == i)
                                                             {
                                                                     ticketbooth2.removeOpusCard(cardNumber); 
                                                             System.out.println("Card was removed successfully");                           
                                                                     loop2 = false;
                                                                     loop1 = false;
                                                                     break;
                                                             	}
                                                     	}
                                             	}
                                     	}                                       
                                     break;
                                	}
                               
                                if(ticketbooth == 3)
                                {
                                	if(ticketbooth3.nbOpusCards() == 0)
                                    {
                                            System.out.println("No OPUS cards");
                                            		loop2 = false;
                                                    loop1 = false;
                                                    break;
                                    	}
                                    while(loop2) 
                                    {
                                            System.out.println("Enter card number 0 to "+(ticketbooth3.nbOpusCards()-1));
                                            int cardNumber = keyIn.nextInt();
                                            if(cardNumber > (ticketbooth3.nbOpusCards()-1))
                                            {
                                                    System.out.println("Card " + cardNumber + " does not exist");
                                                    System.out.println("--> Try again:");
                                                    loop2 = true;
                                                    loop1 = true;
                                            	}
                                            else
                                            {
                                                    for(int i = 0; i < ticketbooth3.nbOpusCards(); i++)
                                                    {
                                                            if(cardNumber == i)
                                                            {
                                                                    ticketbooth3.removeOpusCard(cardNumber); 
                                                            System.out.println("Card was removed successfully");                           
                                                                    loop2 = false;
                                                                    loop1 = false;
                                                                    break;
                                                            	}
                                                    	}
                                            	}
                                    	}                                       
                                    break;
                                }
                               
                                if(ticketbooth == 4)
                                {
                                	if(ticketbooth4.nbOpusCards() == 0)
                                    {
                                            System.out.println("No OPUS cards");
                                            		loop2 = false;
                                                    loop1 = false;
                                                    break;
                                    	}
                                    while(loop2) 
                                    {
                                            System.out.println("Enter card number 0 to "+(ticketbooth4.nbOpusCards()-1));
                                            int cardNumber = keyIn.nextInt();
                                            if(cardNumber > (ticketbooth4.nbOpusCards()-1))
                                            {
                                                    System.out.println("Card " + cardNumber + " does not exist");
                                                    System.out.println("--> Try again:");
                                                    loop2 = true;
                                                    loop1 = true;
                                            	}
                                            else
                                            {
                                                    for(int i = 0; i < ticketbooth4.nbOpusCards(); i++)
                                                    {
                                                            if(cardNumber == i)
                                                            {
                                                                    ticketbooth4.removeOpusCard(cardNumber); 
                                                            System.out.println("Card was removed successfully");                           
                                                                    loop2 = false;
                                                                    loop1 = false;
                                                                    break;
                                                            	}
                                                    	}
                                            	}
                                    	}                                       
                                    break;
                                }
                               
                                else
                                {
                                        System.out.println("Ticketbooth " + ticketbooth + " does not exist");
                                }
                        }
                        break;
                  
                    case 8:
                        while(loop1) 
                        {
                                System.out.print("Which Ticketbooth do you want to update a OPUS card from? (Enter number 0 to 4): ");
                                ticketbooth = keyIn.nextInt();
                               
                                if(ticketbooth == 0)
                                {
                                        if(ticketbooth0.nbOpusCards() == 0)
                                        {
                                                System.out.println("No OPUS cards");
                                                loop1 = false;
                                                loop2 = false;
                                                break;
                                        }
                                        while(loop2)
                                        {
                                                System.out.println("Which card would you like to update? Enter a card number 0 to "+(ticketbooth0.nbOpusCards()-1));
                                                int cardNumber = keyIn.nextInt();
                                                if(cardNumber > (ticketbooth0.nbOpusCards()-1))
                                                {
                                                        System.out.println("Card " + cardNumber + " does not exist");
                                                        System.out.println("--> Try again:");
                                                        loop1 = true;
                                                        loop2 = true;
                                                }
                                                else
                                                {
                                                        System.out.print("--->Enter new expiry month number and year (seperate by a space): ");
                                                        int newMonth = keyIn.nextInt();
                                                        int newYear = keyIn.nextInt();  
                                                        //updateOpusDates is invoked which sets the new month and new year to the cardsOpus[i] array at i = cardNumber
                                                        //which then follows the syntax of the parameters as newYear,newMonth,cardNumber
                                                        ticketbooth0.updateOpusDates(newYear, newMonth, cardNumber);
                                                        System.out.println("Expiry Date Updated");
                                                        loop1 = false;
                                                        loop2 = false;
                                                        break;                                                  
                                                }
                                        }                                       
                                        break;
                                }
                                
                                if(ticketbooth == 1)
                                {
                                	if(ticketbooth1.nbOpusCards() == 0)
                                    {
                                            System.out.println("No OPUS cards");
                                            loop1 = false;
                                            loop2 = false;
                                            break;
                                    }
                                    while(loop2)
                                    {
                                            System.out.println("Which card would you like to update? Enter a card number 0 to "+(ticketbooth1.nbOpusCards()-1));
                                            int cardNumber = keyIn.nextInt();
                                            if(cardNumber > (ticketbooth1.nbOpusCards()-1))
                                            {
                                                    System.out.println("Card " + cardNumber + " does not exist");
                                                    System.out.println("--> Try again:");
                                                    loop1 = true;
                                                    loop2 = true;
                                            }
                                            else
                                            {
                                                    System.out.print("--->Enter new expiry month number and year (seperate by a space): ");
                                                    int newMonth = keyIn.nextInt();
                                                    int newYear = keyIn.nextInt();                           
                                                    ticketbooth1.updateOpusDates(newYear, newMonth, cardNumber);
                                                    System.out.println("Expiry Date Updated");
                                                    loop1 = false;
                                                    loop2 = false;
                                                    break;                                                  
                                            }
                                    }                                       
                                    break;
                                }
                                
                                if(ticketbooth == 2)
                                {
                                	if(ticketbooth2.nbOpusCards() == 0)
                                    {
                                            System.out.println("No OPUS cards");
                                            loop1 = false;
                                            loop2 = false;
                                            break;
                                    }
                                    while(loop2)
                                    {
                                            System.out.println("Which card would you like to update? Enter a card number 0 to "+(ticketbooth2.nbOpusCards()-1));
                                            int cardNumber = keyIn.nextInt();
                                            if(cardNumber > (ticketbooth2.nbOpusCards()-1))
                                            {
                                                    System.out.println("Card " + cardNumber + " does not exist");
                                                    System.out.println("--> Try again:");
                                                    loop1 = true;
                                                    loop2 = true;
                                            }
                                            else
                                            {
                                                    System.out.print("--->Enter new expiry month number and year (seperate by a space): ");
                                                    int newMonth = keyIn.nextInt();
                                                    int newYear = keyIn.nextInt();                            
                                                    ticketbooth2.updateOpusDates(newYear, newMonth, cardNumber);
                                                    System.out.println("Expiry Date Updated");
                                                    loop1 = false;
                                                    loop2 = false;
                                                    break;                                                  
                                            }
                                    }                                       
                                    break;
                                }
                             
                                if(ticketbooth == 3)
                                {
                                	if(ticketbooth3.nbOpusCards() == 0)
                                    {
                                            System.out.println("No OPUS cards");
                                            loop1 = false;
                                            loop2 = false;
                                            break;
                                    }
                                    while(loop2)
                                    {
                                            System.out.println("Which card would you like to update? Enter a card number 0 to "+(ticketbooth3.nbOpusCards()-1));
                                            int cardNumber = keyIn.nextInt();
                                            if(cardNumber > (ticketbooth3.nbOpusCards()-1))
                                            {
                                                    System.out.println("Card " + cardNumber + " does not exist");
                                                    System.out.println("--> Try again:");
                                                    loop1 = true;
                                                    loop2 = true;
                                            }
                                            else
                                            {
                                                    System.out.print("--->Enter new expiry month number and year (seperate by a space): ");
                                                    int newMonth = keyIn.nextInt();
                                                    int newYear = keyIn.nextInt();                            
                                                    ticketbooth3.updateOpusDates(newYear, newMonth, cardNumber);
                                                    System.out.println("Expiry Date Updated");
                                                    loop1 = false;
                                                    loop2 = false;
                                                    break;                                                  
                                            }
                                    }                                       
                                    break;
                                }
                              
                                if(ticketbooth == 4)
                                {
                                	if(ticketbooth4.nbOpusCards() == 0)
                                    {
                                            System.out.println("No OPUS cards");
                                            loop1 = false;
                                            loop2 = false;
                                            break;
                                    }
                                    while(loop2)
                                    {
                                            System.out.println("Which card would you like to update? Enter a card number 0 to "+(ticketbooth4.nbOpusCards()-1));
                                            int cardNumber = keyIn.nextInt();
                                            if(cardNumber > (ticketbooth4.nbOpusCards()-1))
                                            {
                                                    System.out.println("Card " + cardNumber + " does not exist");
                                                    System.out.println("--> Try again:");
                                                    loop1 = true;
                                                    loop2 = true;
                                            }
                                            else
                                            {
                                                    System.out.print("--->Enter new expiry month number and year (seperate by a space): ");
                                                    int newMonth = keyIn.nextInt();
                                                    int newYear = keyIn.nextInt();                            
                                                    ticketbooth4.updateOpusDates(newYear, newMonth, cardNumber);
                                                    System.out.println("Expiry Date Updated");
                                                    loop1 = false;
                                                    loop2 = false;
                                                    break;                                                  
                                            }
                                    }                                       
                                    break;
                                }
                                else
                                {
                                     System.out.println("Ticketbooth " + ticketbooth + "does not exist");
                                     loop1 = true;
                                }
                        }
                        break;
                    
                    case 9:
                        while(loop1)
                        {
                                System.out.print("Which ticketbooth do you want to add tickets to? (Enter number 0 to 4): ");
                                ticketbooth = keyIn.nextInt();
                              
                                if(ticketbooth == 0)
                                {
                                        System.out.println("How many regular, junior, senior, daily, and weekly do you want to add?");
                                        System.out.print("Enter 5 numbers seperated by a space: ");
                                        int regularTickets = keyIn.nextInt();
                                        int juniorTickets = keyIn.nextInt();
                                        int seniorTickets = keyIn.nextInt();
                                        int dailyTickets = keyIn.nextInt();
                                        int weeklyTickets = keyIn.nextInt();
                                        //The last method invoked is the addTickets method which invokes another method that adds each specific type of ticket
                                        //by their respective spot in the parameter. 
                                        //for example regularTickets will always be added by whichever value is in the first parameter
                                        double newTotal = ticketbooth0.addTickets(regularTickets, juniorTickets, seniorTickets, dailyTickets, weeklyTickets);
                                        System.out.println("You now have $" + newTotal);
                                        loop1 = false;
                                        break;
                                }
                              
                                if(ticketbooth == 1)
                                {
                                	 System.out.println("How many regular, junior, senior, daily, and weekly do you want to add?");
                                     System.out.print("Enter 5 numbers seperated by a space: ");
                                     int regularTickets = keyIn.nextInt();
                                     int juniorTickets = keyIn.nextInt();
                                     int seniorTickets = keyIn.nextInt();
                                     int dailyTickets = keyIn.nextInt();
                                     int weeklyTickets = keyIn.nextInt();
                                     double newTotal = ticketbooth1.addTickets(regularTickets, juniorTickets, seniorTickets, dailyTickets, weeklyTickets);
                                     System.out.println("You now have $" + newTotal);
                                     loop1 = false;
                                     break;
                                }
                               
                                if(ticketbooth == 2)
                                {
                                	 System.out.println("How many regular, junior, senior, daily, and weekly do you want to add?");
                                     System.out.print("Enter 5 numbers seperated by a space: ");
                                     int regularTickets = keyIn.nextInt();
                                     int juniorTickets = keyIn.nextInt();
                                     int seniorTickets = keyIn.nextInt();
                                     int dailyTickets = keyIn.nextInt();
                                     int weeklyTickets = keyIn.nextInt();
                                     double newTotal = ticketbooth2.addTickets(regularTickets, juniorTickets, seniorTickets, dailyTickets, weeklyTickets);
                                     System.out.println("You now have $" + newTotal);
                                     loop1 = false;
                                     break;
                                }
                               
                                if(ticketbooth == 3)
                                {
                                	 System.out.println("How many regular, junior, senior, daily, and weekly do you want to add?");
                                     System.out.print("Enter 5 numbers seperated by a space: ");
                                     int regularTickets = keyIn.nextInt();
                                     int juniorTickets = keyIn.nextInt();
                                     int seniorTickets = keyIn.nextInt();
                                     int dailyTickets = keyIn.nextInt();
                                     int weeklyTickets = keyIn.nextInt();
                                     double newTotal = ticketbooth3.addTickets(regularTickets, juniorTickets, seniorTickets, dailyTickets, weeklyTickets);
                                     System.out.println("You now have $" + newTotal);
                                     loop1 = false;
                                     break;
                                }
                                
                                if(ticketbooth == 4)
                                {
                                	 System.out.println("How many regular, junior, senior, daily, and weekly do you want to add?");
                                     System.out.print("Enter 5 numbers seperated by a space: ");
                                     int regularTickets = keyIn.nextInt();
                                     int juniorTickets = keyIn.nextInt();
                                     int seniorTickets = keyIn.nextInt();
                                     int dailyTickets = keyIn.nextInt();
                                     int weeklyTickets = keyIn.nextInt();
                                     double newTotal = ticketbooth4.addTickets(regularTickets, juniorTickets, seniorTickets, dailyTickets, weeklyTickets);
                                     System.out.println("You now have $" + newTotal);
                                     loop1 = false;
                                     break;
                                }
                                
                                else
                                {
                                        System.out.println("Ticketbooth " + ticketbooth + " does not exist");
                                }
                        }
                        break;
                   
                    case 0:
                    			//setting loop to false will automatically break out of the first loop which finally terminates the program
                                System.out.println("Thank you for using the Geek's Opus Ticketbooth application");
                                loop = false;
                                break;
                   
                    default:
                    			System.out.println("Sorry that is not a valid choice. Try again.");
                    			break;
                }
        } while(loop);
        keyIn.close();
    }
}