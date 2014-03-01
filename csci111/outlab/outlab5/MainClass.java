
/**
 * Write a description of class MainClass here.
 * 
 * @author Skylar Downes
 * @version 10/10/11
 */

public class MainClass
{
    public static void report(Summary swim)
    {
        System.out.println(swim.getName() + ": Average time: " + swim.getDoub1() + ", best time: " + swim.getDoub2());
    }
       
   public static void main()
    {
        Swimmer phelps = new Swimmer("Michael Phelps", 50.87, 50.97, 50.58),
                susan = new Swimmer("Susan Starkey", 60.0, 59.0);
                
        Summary phelpsRes = phelps.results();
        report(phelpsRes);
        report(susan.results());
        report((new Swimmer("Denbigh Starkey", 250.9)).results());
        
        phelps.changeTime("Quals", 52.0);
        phelps.changeTime("Heat", 52.0);
        phelps.changeTime("Semifinal", 51.0);
        phelps.changeTime("Final", 50);
        
        phelpsRes = phelps.results();
        report(phelpsRes);
    }
}