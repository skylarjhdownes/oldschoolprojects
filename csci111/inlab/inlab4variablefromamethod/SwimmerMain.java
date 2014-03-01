
/**
 * Write a description of class SwimmerMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SwimmerMain
{
    public static void main()
    {
        
    Swimmer.reset();  // reset the class field(s)
        
    Swimmer phelps = new Swimmer("Michael Phelps", 50.87, 50.97, 50.58),
    cavic = new Swimmer("Milorad Cavic", 50.76, 50.92, 50.59),
    susan = new Swimmer("Susan Starkey", 60.0, 59.0),
    me  = new Swimmer("Denbigh Starkey", 250.9);
                
    System.out.println("There are " + Swimmer.getNumSwimmers() + " swimmers");
    System.out.println();
        
    phelps.reportFinals();
    cavic.reportFinals();
    susan.reportFinals();
    me.reportFinals();
    }

}
