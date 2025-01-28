


public class OPUSCards 
{
        // Attributes to keep track of Opus card types, name of card holder, expiry dates
        String cardType, cardHolderName;
        int expiryYear, expiryMonth;

        // default constructor
        public OPUSCards() {
        	cardType = "";
        	cardHolderName = "";
        	expiryYear = 0;
        	expiryMonth = 0;
        }
        //Constructor with 4 parameters to set initial value of each attribute
        public OPUSCards(String w, String x, int y, int z)
        {
            cardType = w;
            cardHolderName = x;
            expiryYear = z;
            //An if statement is used to make sure the month inputted is a valid month 
            if(y >= 1 && y <= 12)
            {
                expiryMonth = y;
            }
            //Expiry month is set to 0 if not valid
            else
            {
                expiryMonth = 0;
            }
        }
        
        //Copy constructor with 1 parameter of type OPUSCard
        public OPUSCards(OPUSCards opusCard) {
            this.cardHolderName = opusCard.cardHolderName;
            this.cardType = opusCard.cardType;
            this.expiryMonth = opusCard.expiryMonth;
            this.expiryYear = opusCard.expiryYear;
        }

        //Accessor methods for all attributes
        public String getCardType()
        {
            return cardType;
        }

        public String getCardHolder()
        {
            return cardHolderName;
        }

        public int getExpiryMonth()
        {
            return expiryMonth;
        }

        public int getExpiryYear()
        {
            return expiryYear;
        }

        //Mutator methods for the expiry month and for the expiry year
        public void setExpiryMonth(int expiryMonth)
        {
            
        	//An if statement is used to make sure the month inputted is a valid month 
            if(expiryMonth >= 1 && expiryMonth <= 12)
            {
                this.expiryMonth = expiryMonth;
            }
            //Expiry month is set to 0 if not valid
            else
            {
                this.expiryMonth = 0;
            }
        }

        public void setExpiryYear(int expYear)
        {
            this.expiryYear = expYear;
        }
        
        // Method that returns a string demonstrating the type of the OPUS card, the name of the card holder, and the expiry dates
        public String toString()
        {
        	if(expiryMonth < 10)
            return cardType + "-" + cardHolderName + "-0" + expiryMonth + "/" + expiryYear;
        	
        	return cardType + "-" + cardHolderName + "-" + expiryMonth + "/" + expiryYear;
        	}
        //Method that will return true if the two objects type OPUSCard are identical
        public boolean equals(Object object) {
            OPUSCards otherObject = (OPUSCards) object; 
        	if (cardHolderName.equals(otherObject.cardHolderName) 
            		&& cardType.equals(otherObject.cardType)
        				&& expiryMonth == otherObject.expiryMonth 
        					&& expiryYear == otherObject.expiryYear)
        						return true;
            else
            	return false;
           
           
        }
}