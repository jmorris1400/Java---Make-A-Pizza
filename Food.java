package cisy105lab06sum19;

public class Food {
    private String description;
    private double price;

    /**
     * Constructor
     *
     * @param initialDescription value for the description field
     * @param initialPrice value for the price field
     */
    public Food(String initialDescription, double initialPrice) {
        description = initialDescription;
        price = initialPrice;
    }

    /**
     * getDescription method returns value in the description field
     *
     * @return value in the description field
     */
    public String getDescription() {
        return description;
    }

    /**
     * getPrice method returns value in the price field
     *
     * @return value in the price field
     */
    public double getPrice() {
        return price;
    }

    /**
     * setDesciption method assigns a new value for description field
     *
     * @param newDescription new value for description field
     */
    public void setDescription(String newDescription) {
        description = newDescription;
    }

    /**
     * setPrice method assigns a new value for the price field
     *
     * @param newPrice new value for the price field
     */
    public void setPrice(double newPrice) {
        price = newPrice;
    }
    
    /**
     * markdown method reduces the price by 10%
     */
    public void markdown() {            // DO NOT CHANGE THIS METHOD!
        double percentReduction = .1;
        
        price = (double)  Math.round( price * ( 1 - percentReduction ) * 100 ) / 100;
    }

    public String toString(){
        return description + price;}
  
    
   //  receives a double percentReduction/ overloading the method
   public void markdown(double percentReduction) { 
        //double percentReduction = .1;
        
        price = (double)  Math.round( price * ( 1 - percentReduction ) * 100 ) / 100;
    }    //and have the body of the method reduce the price 
    //by the passed value in percentReduction
    public boolean equals(double description, double price)
    {boolean isSame;
    if (description == price)
    {isSame = true;}
    else{ isSame = false;
    }
    return isSame;
    } 
    
}
