package bublesestructurados;

import java.util.Scanner; //You will soon know why ;)
/**
 *
 * @author WildyEstephan
 */
public class TheStatements {
    Scanner intp;
    
    // This method print a list of numbers (1-100) except 50
    public void asAContinue()
    {
        int i;
        for(i = 1; i <= 100; i++)
        {
            if (i != 50)
            {
                System.out.print(i + "-");
            }//end if
        }//end for
    }//end method asACanotinue
    
    /*This method try print until 100 
    but only print up to where it says the user*/
    public void asABreak()
    {
        int until;
        int i;
        intp = new Scanner(System.in);
        System.out.println("Up to where he wants to come?");
        until = intp.nextInt();
        System.out.println("Well, let's go");
        for (i = 1; i <= 100; i++)
        {
            if (i <= until)
            {
                System.out.print(i + "-");
            }//end if
        }//end for
    }//end method asABreak
}//end class
