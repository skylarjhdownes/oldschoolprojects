
/**
 * Write a description of class SwimmerMain here.
 * 
 * @author Skylar Downes 
 * @version 10/1/11
 */
public class SwimmerMain
{
    public static void main()
    {
        
    Swimmer.reset();  // reset the class field(s)
        
    Swimmer phelps = new Swimmer("Michael Phelps", 50.87, 50.97, 50.58),
    cavic = new Swimmer("Milorad Cavic", 50.76, 50.92, 50.59),
    susan = new Swimmer("Susan Starkey", 60.0, 59.0),
    me  = new Swimmer("Denbigh Starkey", 250.9),
    fred = new Swimmer("Fred Smith", -123.45),
    freda = new Swimmer("Freda Jones", 58.0, -50.48),
    jack = new Swimmer("Jack Frost", -59.99, -59.88, -59.77);
                

    System.out.println();
    Swimmer.bestInSemifinals();
    Swimmer.bestInFinals();
    
    System.out.println("There are " + Swimmer.getNumSwimmers() + " swimmers");
    System.out.println();
        
    phelps.reportFinals();
    cavic.reportFinals();
    susan.reportFinals();
    me.reportFinals();
    fred.reportFinals();
    freda.reportFinals();
    jack.reportFinals();
    }

}
