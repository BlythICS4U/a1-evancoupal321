package problem5;
import java.util.*;
/**
 *
 * @author cgallinaro
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //Declare & Set Variables
        String line = "", updatedLine = ""; //Input Line/Output Line
        System.out.println("Enter a line of text.");
        line = scan.nextLine();
        StringTokenizer words = new StringTokenizer(line); //All Words/Current Word
        String currentWord = "";
        while (words.hasMoreTokens())
        {
            currentWord = words.nextToken(); //Set Current Word
            currentWord = currentWord.replaceAll("'", "\""); //Change singe quotes to double quotes        
            currentWord = currentWord.replaceAll("(?i)(\\w)(or)\\b", "$1our"); //Change words ending with or to end with our
            if (currentWord.equalsIgnoreCase("or")) //Handle exception for "or"
            {
                currentWord = currentWord.replaceAll(currentWord, "our");
            }
            if (Character.isUpperCase(currentWord.replaceAll("[?|!|\"|'|:|;|(|)|.|,|-]", "").charAt(0))) //Remove punctuation
            {
                currentWord = currentWord.toUpperCase();
            }
            updatedLine = updatedLine + currentWord + " ";
        }
        updatedLine.trim();
        System.out.println(updatedLine); //Print Result
        
    }
    
}
