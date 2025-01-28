


public class Tickets {
	//Attributes of number of ticket types
	 private int 
	 	nbRegularTicket,
			nbJuniorTicket,
				nbSeniorTicket,
					nbDailyTicket,
						nbWeeklyTicket;
	 //Static constants of the values of each of the tickets needed to evaluate later
	 final static double 
    	regularTicketP = 3.50,
    		juniorTicketP = 2.50,
    			seniorTicketP = 1.0,
    				dailyTicketP = 10.0,
    					weeklyTicketP = 40.0;

    //Default constructor
    public Tickets() {
    	nbRegularTicket = 0;
    	nbJuniorTicket = 0;
    	nbSeniorTicket = 0;
    	nbDailyTicket = 0;
    	nbWeeklyTicket = 0;
    }

    //Constructor with 5 integer parameters to set the number of each ticket in the ticketbooth
    public Tickets(int v, int w, int x, int y, int z)
    {
        nbRegularTicket = v;
        nbJuniorTicket = w;
        nbSeniorTicket = x;
        nbDailyTicket = y;
        nbWeeklyTicket = z;
    }
    
    //Copy Constructor with one parameter of type tickets
    public Tickets(Tickets tickets)
    {
        this.nbRegularTicket = tickets.nbRegularTicket;
        this.nbJuniorTicket = tickets.nbJuniorTicket;
        this.nbSeniorTicket = tickets.nbSeniorTicket;
        this.nbDailyTicket = tickets.nbDailyTicket;
        this.nbWeeklyTicket = tickets.nbWeeklyTicket;
    }
    
    //Mutator methods for number of ticket types which are not constant attributes
    public void setNbRegularTicket(int nbRegularTicket) {
        this.nbRegularTicket = nbRegularTicket;
    }

    public void setNbJuniorTicket(int nbJuniorTicket) {
        this.nbJuniorTicket = nbJuniorTicket;
    }


    public void setNbSeniorTicket(int nbseniorTicket) {
        this.nbSeniorTicket = nbseniorTicket;
    }

    public void setNbDailyTicket(int nbDailyTicket) {
        this.nbDailyTicket = nbDailyTicket;
    }

    public void setNbWeeklyTicket(int nbWeeklyTicket) {
        this.nbWeeklyTicket = nbWeeklyTicket;
    }
   
    //Accessor methods for number of ticket types which are not constant attributes
    public int getNbRegularTicket() {
        return nbRegularTicket;
    }

    public int getNbJuniorTicket() {
        return nbJuniorTicket;
    }

    public int getNbSeniorTicket() {
        return nbSeniorTicket;
    }
 
    public int getNbDailyTicket() {
        return nbDailyTicket;
    }

    public int getNbWeeklyTicket() {
        return nbWeeklyTicket;
    }

    //Method with 5 int parameters allowing to increase number of tickets by set parameters
    public void addTickets(int v, int w, int x, int y, int z)
    {
        nbRegularTicket += v;
        nbJuniorTicket += w;
        nbSeniorTicket += x;
        nbDailyTicket += y;
        nbWeeklyTicket += z;
    }
  
    //Method that returns a double of the total value of the tickets in the ticketbooth
    public double ticketsValue(){
        return getNbRegularTicket() * regularTicketP
        		+ getNbJuniorTicket() * juniorTicketP 
        			+ getNbSeniorTicket() * seniorTicketP
        				+ getNbDailyTicket() * dailyTicketP 
        					+ getNbWeeklyTicket() * weeklyTicketP;
    }
    
    //Method that will return a string indicating the number of each ticket type in the ticketbooth
    public String toString() {
        return ("\n" 
        		+ getNbRegularTicket() + " Regular Tickets * $" + regularTicketP + ", \n" 
        			+ getNbJuniorTicket() + " Junior Tickets * $" + juniorTicketP + ", \n" 
        				+ getNbSeniorTicket() + " Senior Tickets * $" + seniorTicketP + ", \n" 
        					+ getNbDailyTicket() + " Daily Tickets * $" + dailyTicketP + ", \n" 
        						+ getNbWeeklyTicket() + " Weekly Tickets * $ " + weeklyTicketP);
                
    }

 //equals method that compares two ticket Objects

    public boolean equals(Object o) {
    	if (this == o) return true;
        	if (!(o instanceof Tickets)) 
        		return false;

        Tickets tickets = (Tickets) o;
        if (getNbRegularTicket() != tickets.getNbRegularTicket()) 
        	return false;
        if (getNbJuniorTicket() != tickets.getNbJuniorTicket()) 
        	return false;
        if (getNbSeniorTicket() != tickets.getNbSeniorTicket()) 
        	return false;
        if (getNbDailyTicket() != tickets.getNbDailyTicket()) 
        	return false;
        if (getNbWeeklyTicket() != tickets.getNbWeeklyTicket()) 
        	return false;
      
        return true;
    }
}