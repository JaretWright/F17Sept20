package f17sept20;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class Average {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first grade: ");
        double grade1 = keyboard.nextDouble();

        System.out.print("Enter the second grade: ");
        double grade2 = keyboard.nextDouble();

        System.out.print("Enter the third grade: ");
        double grade3 = keyboard.nextDouble();
        
        System.out.printf("The average of the grades is %.1f%%", 
                                                average(grade1,grade2,grade3));
    }
    
    /**
     * This method will accept 3 numbers and return the average
     */
    public static double average(double g1, double g2, double g3)
    {
        return (g1+g2+g3)/3;
    }
}
