package problem4;
import java.util.Scanner;

/**
 *
 * @author cgallinaro
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //Declare Variables
        String rawInput = "", input = "", reverse = "";
        System.out.println("Enter a sentence."); //Input
        rawInput = scan.nextLine();
        input = rawInput.replaceAll("[ |?|!|\"|'|:|;|(|)|.|,|-]", ""); //Modify to Ignore Punctuation
        for (int i = input.length(); i > 0; i--) //Reverse Input
        {
            reverse = reverse + input.charAt(i-1);
        }
        if (input.toLowerCase().equals(reverse.toLowerCase())) //Check for Palindrome/Print Result
        {
            System.out.println("This is a palindrome.");
        }
        else
        {
            System.out.println("This is not a palindrome.");
        }
    }
    
}
