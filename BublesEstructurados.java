
package bublesestructurados;
/**
* This program shows how work the statements 'cotinue' and 'break'
* See that I don't use these statements* 
*/

/**
  |**********|
  |***    ***|
 q|** ^  ^ **|p
  |**  __  **|
  |**      **|
  |**********|
   ----------
 */

/**
 * @version 1.0
 * @author wildy
 */

public class BublesEstructurados {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TheStatements sta = new TheStatements();
        System.out.println("Firts the continue");
        sta.asAContinue();
        System.out.println("Then the break");
        sta.asABreak();
    }
    
}//end class
