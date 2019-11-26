package problem2;
import java.util.Scanner;
/**
 *
 * @author cgallinaro
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //Declare Variables
        int grade;
        
        System.out.println("Enter five number grades."); //Set variable & Print Result
        for (int i = 0; i < 5; i++)
        {
            grade = scan.nextInt();
            if (grade >= 95)
            {
                System.out.println("A+"); //List of Letter Grades
            }
            else if (grade >= 90)
            {
                System.out.println("A");
            }
            else if (grade >= 86)
            {
                System.out.println("A-");
            }
            else if (grade >= 82)
            {
                System.out.println("B+");
            }
            else if (grade >= 78)
            {
                System.out.println("B");
            }
            else if (grade >= 74)
            {
                System.out.println("B-");
            }
            else if (grade >= 70)
            {
                System.out.println("C+");
            }
            else if (grade >= 66)
            {
                System.out.println("C");
            }
            else if (grade >= 62)
            {
                System.out.println("C-");
            }
            else if (grade >= 58)
            {
                System.out.println("D+");
            }
            else if (grade >= 54)
            {
                System.out.println("D");
            }
            else
            {
                System.out.println("D-");
            }
        }
        
    }
    
}
