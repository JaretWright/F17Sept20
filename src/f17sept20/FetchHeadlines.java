package f17sept20;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class FetchHeadlines {
    
    public static void main(String[] args)
    {
        System.out.printf("The world news headline is %s%n", askHeadLine("worldNews"));
        System.out.printf("%nThe sports headline is %s%n", askHeadLine("sports"));
        System.out.printf("%nThe politics headline is %s%n", askHeadLine("politics"));
        System.out.printf("%nThe entertainment headline is %s%n", askHeadLine("entertainment"));
    }
        
    /**
     * This method will receive a String indicating what type of headline
     * is being requested.  It will return a String with the information
     * 
     * @param subject - the type of headline you want
     * @return - the headline of the day
     */
    public static String askHeadLine(String subject)
    {
        //prompt the user for a headline
        System.out.printf("Please enter the headline for the subject of %s: ", subject);
        
        //create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //return the users' response to the calling method
        return keyboard.nextLine();
    }


}
