
/**
 * @author Skylar Downes
 * @version 11/8/11
 */
public class SalesInfo
{
    String objectName;
    double unitPrice;
    int quantity;
    public SalesInfo(String in_objectName, double in_unitPrice, int in_quantity)
    {
        objectName = in_objectName;
        unitPrice = in_unitPrice;
        quantity = in_quantity;
    }
    public String getObjectName()
    {
        return objectName;
    }
        public double getUnitPrice()
    {
        return unitPrice;
    }
        public int getQuantity()
    {
        return quantity;
    }
        public double purchaseCost()
    {
        return (unitPrice * quantity);
    }
}
