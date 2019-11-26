package problem6;
import java.util.*;
/**
 *
 * @author cgallinaro
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //Declare variables
        System.out.println("Enter a sentence.");
        String sentence = scan.nextLine();
        String currentWord = ""; //Current word, is used for both methods
        StringTokenizer longWordCheck = new StringTokenizer(sentence);
        boolean hasLongWord = false;
        while (longWordCheck.hasMoreTokens()) //Checks for words with over 16 characters
        {
            currentWord = longWordCheck.nextToken();
            if (currentWord.length() > 16)
            {
                System.out.println("The input contains " + currentWord + ", which is longer then 16 characters.");
                hasLongWord = true;
                break;
            }
        }
        StringTokenizer words = new StringTokenizer(sentence);
        boolean firstWord = true; //Checks if the program is on the first word
        int charCount = 0; //Counts the number of characters in a line
        if (!hasLongWord) //Only runs if there are no words with 16+ characters
        {
            while (words.hasMoreTokens())
            {
                currentWord = words.nextToken();
                charCount += currentWord.length(); //Adds to charCount
                if (!firstWord) //Adds one more if a space is necessary
                {
                    charCount++;
                }
                if (charCount <= 16) //Checks if the amount of characters in a row would exceed 16 with the current word
                {
                    if (!firstWord) //If not, add it to the current row (with a space before it if it isn't the first word)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        firstWord = false;
                    }
                    System.out.print(currentWord);
                }
                else //If it is more than 16, reset the counter and print the word on the next line
                {
                    charCount = currentWord.length();
                    System.out.println();
                    System.out.print(currentWord);
                }
            }
        }
    }  
}
