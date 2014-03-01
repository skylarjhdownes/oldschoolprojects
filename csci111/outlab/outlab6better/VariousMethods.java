
/**
 * Methods return data based on given numbers
 * 
 * @author Skylar Downes 
 * @version 10/17/11
 */

public class VariousMethods
{
    public static void dates1(int age)
    {
        if (age <= 0)
        {
            System.out.println("Invalid age, you haven't been born yet.");
        }
        else if (age == 16)
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
        int max = var1;
        if  (var2 > max)
        {
            max = var2;
        }
        if (var3 > max)
        {
            max = var3;
        }
        if (var4 > max)
        {
            max = var4;
        }
        if (var5 > max)
        {
            max = var5;
        }
        if (var6 > max)
        {
            max = var6;
        }
        if (var1 < 0 || var2 < 0 || var3 < 0 || var4 < 0 || var5 < 0 || var6 < 0)
        {
            max = -1;
        }
        return max;
    }
        public static ThreeInts min3Of6(int v1, int v2, int v3, int v4, int v5, int v6)
    {
            int temp;
               if (v5 < v6)
        {
            temp = v5;
            v5 = v6;
            v6 = temp;
        }
        if  (v4 < v6)
        {
            temp = v4;
            v4 = v6;
            v6 = temp;
        }
                if  (v3 < v6)
        {
            temp = v3;
            v3 = v6;
            v6 = temp;
        }
                if  (v2 < v6)
        {
            temp = v2;
            v2 = v6;
            v6 = temp;
        }
                if  (v1 < v6)
        {
            temp = v1;
            v1 = v6;
            v6 = temp;
        }
                        if  (v4 < v5)
        {
            temp = v4;
            v4 = v5;
            v5 = temp;
        }
                        if  (v3 < v5)
        {
            temp = v3;
            v3 = v5;
            v5 = temp;
        }
                        if  (v2 < v5)
        {
            temp = v2;
            v2 = v5;
            v5 = temp;
        }
                        if  (v1 < v5)
        {
            temp = v1;
            v1 = v5;
            v5 = temp;
        }
                        if  (v3 < v4)
        {
            temp = v3;
            v3 = v4;
            v4 = temp;
        }
                                if  (v2 < v4)
        {
            temp = v2;
            v2 = v4;
            v4 = temp;
        }
                                if  (v1 < v4)
        {
            temp = v1;
            v1 = v4;
            v4 = temp;
        }
        return new ThreeInts(v6, v5, v4);

    }
    public static ThreeInts max3Of6(int v1, int v2, int v3, int v4, int v5, int v6)
    {
        int temp;
        v1 = -v1;
        v2 = -v2;
        v3 = -v3;
        v4 = -v4;
        v5 = -v5;
        v6 = -v6;
                 if (v5 < v6)
        {
            temp = v5;
            v5 = v6;
            v6 = temp;
        }
        if  (v4 < v6)
        {
            temp = v4;
            v4 = v6;
            v6 = temp;
        }
                if  (v3 < v6)
        {
            temp = v3;
            v3 = v6;
            v6 = temp;
        }
                if  (v2 < v6)
        {
            temp = v2;
            v2 = v6;
            v6 = temp;
        }
                if  (v1 < v6)
        {
            temp = v1;
            v1 = v6;
            v6 = temp;
        }
                        if  (v4 < v5)
        {
            temp = v4;
            v4 = v5;
            v5 = temp;
        }
                        if  (v3 < v5)
        {
            temp = v3;
            v3 = v5;
            v5 = temp;
        }
                        if  (v2 < v5)
        {
            temp = v2;
            v2 = v5;
            v5 = temp;
        }
                        if  (v1 < v5)
        {
            temp = v1;
            v1 = v5;
            v5 = temp;
        }
                        if  (v3 < v4)
        {
            temp = v3;
            v3 = v4;
            v4 = temp;
        }
                                if  (v2 < v4)
        {
            temp = v2;
            v2 = v4;
            v4 = temp;
        }
                                if  (v1 < v4)
        {
            temp = v1;
            v1 = v4;
            v4 = temp;
        }
                                if  (v3 < v4)
        {
            temp = v3;
            v3 = v4;
            v4 = temp;
        }
        v1 = -v1;
        v2 = -v2;
        v3 = -v3;
        v4 = -v4;
        v5 = -v5;
        v6 = -v6;
        return new ThreeInts(v4, v5, v6);

    }
    public static void sort6(int v1, int v2, int v3, int v4, int v5, int v6)
    {
        min3Of6(v1, v2, v3, v4, v5, v6).outvals();
        System.out.print(", ");
        max3Of6(v1, v2, v3, v4, v5, v6).outvals();
        System.out.println();

    }
}








