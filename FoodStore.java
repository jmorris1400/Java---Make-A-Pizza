package cisy105lab06sum19;

/**
 *   Driver
 */
public class FoodStore {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create 2 of our items
        Food potentialSaleItem1 = new Food("Spicy Sweet Chili Doritos",4.99);
        Food potentialSaleItem2 = new Food("Spicy Nacho Doritos",4.79);
        
        //create 2 of their items
        Food competitorSaleItem1 = new Food("Spicy Sweet Chili Doritos",4.34);
        Food competitorSaleItem2 = new Food("Spicy Nacho Doritos",4.17);
        
        // display the items
        System.out.println("Currently - us:\nItem 1: "+potentialSaleItem1);
        System.out.println("Item 2: "+potentialSaleItem2);
        System.out.println("\nCurrently - them:\nItem 1: "+competitorSaleItem1);
        System.out.println("Item 2: "+competitorSaleItem2);
        
        // mark down our items
        System.out.println("\nMarkdown 2 items");
        
      
        potentialSaleItem1.markdown(); 
        
        // markdown the item 13%
        potentialSaleItem2.markdown(.13); // passing 0.13 
        
        
        //display the items and note if they match
        
        // display our item 1
        System.out.print("\nNow - us:\nItem 1: "+potentialSaleItem1);

        // display if item 1 matches their item
        if (potentialSaleItem1.equals(competitorSaleItem1))
            System.out.println("\t\t<-- matches theirs");
        else
            System.out.println();

        // display our item 2
        System.out.print("Item 2: "+potentialSaleItem2);

        // display if item 2 matches user item
        if (potentialSaleItem2.equals(competitorSaleItem2))
            System.out.println("\t\t<-- matches theirs");
        else
            System.out.println();
        
        // display their item 1
        System.out.print("\nCurrently - them:\nItem 1: "+competitorSaleItem1);
        
        // display if item 1 matches their item
        if (potentialSaleItem1.equals(competitorSaleItem1))
            System.out.println("\t\t<-- matches ours");
        else
            System.out.println();
        
        // display their item 2
        System.out.print("Item 2: "+competitorSaleItem2);
        
        // display if item 2 matches their item
        if (potentialSaleItem2.equals(competitorSaleItem2))
            System.out.println("\t\t<-- matches ours");
        else
            System.out.println();
    }    
}
