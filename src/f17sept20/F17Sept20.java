package f17sept20;

/**
 *
 * @author JWright
 */
public class F17Sept20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car dylansCar = new Car(2017, "Mazda","3",1000.2);
        Car alliesCar = new Car(1905, "Ford", "Model T", 1982.3);
        Car tomsCar = new Car(2017, "Audi", "Q3", 34234);
        
        System.out.printf("Dylan's car is a %s%n", dylansCar.toString());
        System.out.printf("Allie's car is a %s%n", alliesCar.toString());
        System.out.printf("Toms's car is a %s%n", tomsCar.toString());
        
    }
    
}
