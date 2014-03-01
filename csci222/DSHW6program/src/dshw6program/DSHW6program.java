
package dshw6program;

public class DSHW6program {

    public static int[][] RArray;
    public static void main(String[] args) 
    {
    RArray = ReadFile.read();   
    int length = RArray.length;
    int count = 0;
    boolean eqRel = true;
    boolean refRel = true;
    boolean symRel = true;
    boolean transRel = true;
    while (count < length && eqRel == true)
    {
        if (RArray[count][count]!= 1)
        {
            eqRel = false;
            refRel = false;
        }
        int countTwo = 0;
        while (countTwo < length)
        {
            if (RArray[count][countTwo] != RArray[countTwo][count])
            {
                eqRel = false;
                symRel = false;
            }
            if (RArray[count][countTwo] == 1)
            {
                int countThree = 0;
                while (countThree < length)
                {
                    if (RArray[countTwo][countThree] != RArray[count][countThree])
                    {
                        eqRel = false;
                        transRel = false;
                    }
                    countThree++;
                }
            }
            countTwo++;
        }
        count++;
    }
    if (eqRel == true){
        System.out.println("R is an equivalence relation.");
    }
    else
    {
        System.out.println("R is not an equivalence relation because: ");
        if (refRel == false)
        {
            System.out.println("R is not reflexive.");
        }
        if (symRel == false)
        {
            System.out.println("R is not symmetric.");
        }
        if (transRel == false)
        {
            System.out.println("R is not transitive.");
        }
    }
    }
}
