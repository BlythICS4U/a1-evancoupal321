package problem3;
import java.util.Scanner;

/**
 *
 * @author cgallinaro
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double kilometres = 1, litres = 1, efficiency = 0; //Declare Variables
        System.out.println("Enter a negative number to end the program.");
        while (true)
        {
            System.out.println("Enter the number of kilometres driven."); //Set Variables
            kilometres = scan.nextDouble();
            if (kilometres <= 0) //Exit Program
            {
                break;
            }
            System.out.println("Enter the number of litres used in those kilometres.");
            litres = scan.nextDouble();
            if (litres <= 0)
            {
                break;
            }
            efficiency = 100 * litres / kilometres; //Arithmetic
            System.out.printf("%s%.2f%s", "Efficiency: ", efficiency, " litres per 100 km"); //Print Result
            System.out.println();
            System.out.println();
        }
        
    }
    
}
