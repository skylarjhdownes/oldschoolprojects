
/**
 * Write a description of class VariousMethods here.
 * 
 * @author Skylar Downes 
 * @version 10/11/11
 */

public class VariousMethods
{
    public static void dates1(int age)
    {
        if (age == 16)
        {
            System.out.println("16: legal drinking age in UK restaraunts");
        }
        else if (age == 18)
        {
            System.out.println("18: register for the draft if male");
        }
        else if (age == 60)
        {
            System.out.println("60: cheap tickets at movies");
        }
        else if (age == 62)
        {
            System.out.println("62: ten dollar lifetime senior pass at national parks");
        }
        else if (age == 73)
        {
            System.out.println("73: free skiing at Bridger until 2010");
        }
        else if (age == 80)
        {
            System.out.println("80: free skiing at Bridger");
        }
        else
        {
            System.out.println(age + ": nothing interesting is associated with this year");
        }
    }
    public static void dates2(int age)
    {
        switch (age)
        {
            case 16: System.out.println("16: legal drinking age in UK restaraunts");                 break;
            case 18: System.out.println("18: register for the draft if male");                       break;
            case 60: System.out.println("60: cheap tickets at movies");                              break;
            case 62: System.out.println("62: ten dollar lifetime senior pass at national parks");    break;
            case 73: System.out.println("73: free skiing at Bridger until 2010");                    break;
            case 80: System.out.println("80: free skiing at Bridger");                               break;
            default: System.out.println(age + ": nothing interesting is associated with this year"); 
        }  
    }
    public static int maxOf6(int var1, int var2, int var3, int var4, int var5, int var6)
    {
        int max;
        if  (var2 < var1 && var3 < var1 && var4 < var1 && var5 < var1 && var6 < var1)
        {
            max = var1;
        }
        else if (var3 < var2 && var4 < var2 && var5 < var2 && var6 < var2)
        {
            max = var2;
        }
        else if (var4 < var3 && var5 < var3 && var6 < var3)
        {
            max = var3;
        }
        else if (var5 < var4 && var6 < var4)
        {
            max = var4;
        }
        else if (var6 < var5)
        {
            max = var5;
        }
        else
        {
            max = var6;
        }
        return max;
    }
    }








