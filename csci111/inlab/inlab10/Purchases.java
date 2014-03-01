import javax.swing.*;
/**
 * @author Skylar Downes
 * @version 11/8/11
 */
public class Purchases
{
    private static ArrayList<SalesInfo> myPurchases = new ArrayList<SalesInfo>();
    public static void newPurchase()
    {
        String inOne;
        String inTwo;
        String inThree;
        String name;
        double unitCost;
        int quantity;
        if (numPurchases != 10)
        {
            inOne = JOptionPane.showInputDialog("enter object purchased");
            inTwo = JOptionPane.showInputDialog("enter price");
            inThree = JOptionPane.showInputDialog("enter quantity purchased");
            name = inOne;
            unitCost = Double.parseDouble(inTwo);
            quantity = Integer.parseInt(inThree);
            JOptionPane.showMessageDialog(null, "New purchase: " + quantity + " " + name + " @ $" + unitCost);
            myPurchases[numPurchases] = new SalesInfo(name, unitCost, quantity);
            numPurchases++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Too many purchases");
        }
    }
    public static void allPurchases()
    {
        for (int i = 0; i < numPurchases; i++)
        {
        String name = myPurchases[i].getObjectName();
        double unitPrice = myPurchases[i].getUnitPrice();
        int quantity = myPurchases[i].getQuantity();
        double purchaseCost = myPurchases[i].purchaseCost();
        System.out.printf("%-10s%10d%10.2f%10.2f%n", name, quantity, unitPrice, purchaseCost);
        }
    }
}