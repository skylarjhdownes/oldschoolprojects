
/**
 * @author Skylar Downes
 * @version 10/31/11
 */
public class MainTest2
{
    public static void main()
    {
       /* LoopTest.forTest(5);
        LoopTest.personInfo();
        LoopTest.forTest(5);
        LoopTest.forTest(0);
        System.out.format("The largest input value was %.1f", LoopTest.whileTest());
        System.out.format("The largest input value was %.1f", LoopTest.whileTest());
        */IntIntDouble myTest = LoopTest.doWhileTest();
        
        System.out.format("The largest input value was %d%nThe smallest was %d%nthe average was %.2f%n", 
                myTest.getInt1(), 
                myTest.getInt2(), 
                myTest.getDouble1());
                
        myTest = LoopTest.doWhileTest();
        
        System.out.format("The largest input value was %d%nThe smallest was %d%nthe average was %.2f%n", 
                myTest.getInt1(),  
                myTest.getInt2(), 
                myTest.getDouble1());
    }
}
