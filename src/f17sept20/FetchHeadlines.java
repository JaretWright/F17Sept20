package f17sept20;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class FetchHeadlines {
    public static void main(String[] args)
    {
        String worldNews = askHeadLine("world news");
        System.out.printf("The world news headline is %s", worldNews);
    }
    
    /**
     * This method will receive a String indicating what type of headline
     * is being requested.  It will return a String with the information
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
