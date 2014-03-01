
/**
 * @author Skylar Downes
 * @version 11/8/11
 */
public class Main
{
       public static void main()
       { 
             Purchases.newPurchase();
             Purchases.newPurchase();
             Purchases.newPurchase();
             Purchases.newPurchase();
             
             Purchases.allPurchases();
             
             System.out.println();
             
             Purchases.deletePurchase("Subaru");
             Purchases.deletePurchase("Chevy"); 
             
             System.out.println();                
             Purchases.allPurchases();
             System.out.println();
             SalesInfo[] salesArray = Purchases.toArray(); 
             Purchases.printArray(salesArray);
       }
}
