import java.util.*;
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
        int index = 0;
            inOne = JOptionPane.showInputDialog("enter object purchased");
            inTwo = JOptionPane.showInputDialog("enter price");
            inThree = JOptionPane.showInputDialog("enter quantity purchased");
            name = inOne;
            unitCost = Double.parseDouble(inTwo);
            quantity = Integer.parseInt(inThree);
            JOptionPane.showMessageDialog(null, "New purchase: " + quantity + " " + name + " @ $" + unitCost);
            for (int i = 0; i < myPurchases.size(); i++)
            {
                if (name.compareTo(myPurchases.get(i).getObjectName()) > 0)
                {
                    index = i;
                    break;
                }
            }
            myPurchases.add(index, new SalesInfo(name, unitCost, quantity));
    }
    public static void allPurchases()
    {
        
        for (int i = 0; i < myPurchases.size(); i++)
        {
        String name = myPurchases.get(i).getObjectName();
        double unitPrice = myPurchases.get(i).getUnitPrice();
        int quantity = myPurchases.get(i).getQuantity();
        double purchaseCost = myPurchases.get(i).purchaseCost();
        System.out.printf("%-10s%10d%10.2f%10.2f%n", name, quantity, unitPrice, purchaseCost);
        }
    }
    public static void deletePurchase(String name)
    {
        name = JOptionPane.showInputDialog("enter object to delete");
        for (int i = 0; i < myPurchases.size(); i++)
        {
        boolean found = false;
        if (name == myPurchases.get(i).getObjectName())
        {
            found = true;
            myPurchases.remove(i);
        }
        if (!found)
        {
            System.out.println("No object with name " + name);
        }
        }
    }
    public static SalesInfo[] toArray()
    {
        SalesInfo[] local = new SalesInfo[myPurchases.size()];
        for  (int i = 0; i < myPurchases.size(); i++)
        {
            local[i] = myPurchases.get(i);
        }
        return local;
    }
    public static void printArray(SalesInfo[] myArr)
    {
        for (int i = 0; i < myPurchases.size(); i++)
        {
            String name = myArr[i].getObjectName();
            double unitPrice = myArr[i].getUnitPrice();
            int quantity = myArr[i].getQuantity();
            double purchaseCost = myArr[i].purchaseCost();
            System.out.printf("%-10s%10d%10.2f%10.2f%n", name, quantity, unitPrice, purchaseCost);
        }
    }
}