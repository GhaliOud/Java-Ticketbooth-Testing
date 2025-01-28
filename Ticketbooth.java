


public class Ticketbooth
{
	//Attributes are set as private to avoid the risk of any privacy leaks
	private Tickets tickets;
    private OPUSCards[] cardsOpus;

    //Default Constructor
    public Ticketbooth()
    {
        tickets = new Tickets();
        cardsOpus = new OPUSCards[0];
    }

    //Constructor with two parameters that set initial value of each attributes of type Tickets and type OPUSCard
    public Ticketbooth(Tickets ticket,OPUSCards[] opusCard)
    {
        tickets = new Tickets(ticket);
        cardsOpus = new OPUSCards[opusCard.length];
        for(int i = 0; i < opusCard.length; i++)
        {
            cardsOpus[i]= opusCard[i];
        }
        if (opusCard.length == 0)
        	cardsOpus = new OPUSCards[0];
        	
    }

    //Method that will check if the value of two ticketbooths tickets are equal
    public boolean ticketBoothValue(Ticketbooth x, Ticketbooth y){
        if (x.totalValue() == y.totalValue())
            return true;
        else
            return false;
    }
    
     //Method that will check if the number of tickets of each type of tickets in two ticketbooths are equal
    public boolean ticketBoothTickets(Ticketbooth x, Ticketbooth y){
        if (x.tickets.getNbRegularTicket()==y.tickets.getNbRegularTicket()
        		&& x.tickets.getNbJuniorTicket()==y.tickets.getNbJuniorTicket()
        			&& x.tickets.getNbSeniorTicket()==y.tickets.getNbSeniorTicket()
        				&& x.tickets.getNbDailyTicket()==y.tickets.getNbDailyTicket()
        					&& x.tickets.getNbWeeklyTicket()==y.tickets.getNbWeeklyTicket())
            return true;
        else
            return false;
    }

    //Method that returns total value of tickets in a ticketbooth
    public double totalValue(){
        return tickets.ticketsValue();
    }

    //Method that returns the number of OpusCards in a ticketbooth
    public int nbOpusCards(){
        return cardsOpus.length;
    }

    //Method that will add a new OPUS card to a ticketbooth
    public int addOpusCard(OPUSCards addition){
    	//If there are no OpusCards in a ticketbooth, then this if statement
    	//will make sure to increase the length of cardsOpus array and return the array's length 
        if (cardsOpus.length == 0){
            OPUSCards[] nbCards = new OPUSCards[1];
            //The next lines is to make sure cardsOpus at [0] is not null
            	nbCards[0] = addition;
            	cardsOpus = nbCards;
            return cardsOpus.length;
        }

        else {
                OPUSCards[] nbCards = new OPUSCards[cardsOpus.length + 1];
                //The next lines is to make sure cardsOpus at [i] is not null when increasing the amount of elements in the array
                //by setting the element from cardsOpus at [i] to nbCards at [i] too
                	for (int i = 0; i < cardsOpus.length; i++) {
                		nbCards[i] = cardsOpus[i];
                	}
                	nbCards[nbCards.length - 1] = addition;
                cardsOpus = nbCards;
                return cardsOpus.length;
            }
    }

    //Method that will remove an OPUS card from a ticketbooth
    public boolean removeOpusCard(int removal)
    {
            OPUSCards[] nbCards = new OPUSCards[cardsOpus.length-1];
            int j = 0;
            for(int i = 0; i < (cardsOpus.length); i++)
            {
            	//This if statement will make it that if i is equal to card that the user wants to remove,
            	//it will skip the body and therefore skip the element that was at element [i]
                if(i != (removal))
                {
                		nbCards[j] = cardsOpus[i];
                        j++;
                }
            }
            cardsOpus = nbCards;
            return true;
        
    }
	    //Method that will update the expiry month and year of an OPUS card
	    public void updateOpusDates(int year, int month, int i){
        cardsOpus[i].setExpiryMonth(month);
        cardsOpus[i].setExpiryYear(year);
    }

    //Method with 5 parameters that will add each type of ticket to ticketbooth
    public double addTickets(int v, int w, int x, int y, int z){
        tickets.addTickets(v,w,x,y,z);
        return totalValue();
    }

    //Method will return true if total value of tickets and if number of OPUS cards of two ticketbooths are equal
    public boolean equals(Ticketbooth ticketbooth1, Ticketbooth ticketbooth2) {

        if (ticketBoothValue(ticketbooth1,ticketbooth2) && ticketbooth1.nbOpusCards() == ticketbooth2.nbOpusCards()) {
            return true;
        }
        return false;
    }
    
    //String that will indicate the number of each type of ticket as well as the details of each OPUS card in the ticketbooth
    public String toString() {
    	//StringBuilder is used to be able to append the details of the OPUS cards if there are more than one opus card in a ticketbooth
    	//which would be replaced by the most recent card if done using the string class
        StringBuilder nbTicketDetailsOpus = new StringBuilder("");
        		//tickets is appended to show all the types of tickets and their prices
        		nbTicketDetailsOpus.append(tickets);
        		nbTicketDetailsOpus.append("\n");
                if(cardsOpus.length == 0)
                {
                		nbTicketDetailsOpus.append("No OPUS Cards");
                	}
                else
                {
                        for(int i = 0; i < cardsOpus.length;i++) 
                        {
                        	nbTicketDetailsOpus.append("\n").append(cardsOpus[i].toString());
                        }
                }
        return nbTicketDetailsOpus.toString();
        
    }
    //Method that will return a string with the breakdown of the tickets
    public String toString1(Ticketbooth ticketbooth1) {
		return ("\n" 
        		+ ticketbooth1.tickets.getNbRegularTicket() + " Regular * $" + tickets.regularTicketP + ", \n" 
    			+ ticketbooth1.tickets.getNbJuniorTicket() + " Junior * $" + tickets.juniorTicketP + ", \n" 
    				+ ticketbooth1.tickets.getNbSeniorTicket() + " Senior * $" + tickets.seniorTicketP + ", \n" 
    					+ ticketbooth1.tickets.getNbDailyTicket() + " Daily * $" + tickets.dailyTicketP + ", \n" 
    						+ ticketbooth1.tickets.getNbWeeklyTicket() + " Weekly * $ " + tickets.weeklyTicketP + "\n");
	    }
   
}