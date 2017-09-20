package f17sept20;

/**
 *
 * @author JWright
 */
public class Car {
    private int year;
    private String manufacturer;
    private String model;
    private double mileage;
    
    //This is a "Constructor" which will create a new instance of a Car
    public Car(int modelYear, String make, String modelName, double kms)
    {
        year = modelYear;
        manufacturer = make;
        model = modelName;
        mileage = kms;
    }
    
    /**
     * This method will return a String that describes the car.  The String
     * will match the pattern of model year - make model with x km's
     */
    public String toString()
    {
        String response = String.format("%d-%s %s with %.1f km's", year, manufacturer,
                                                            model,mileage);
        return response;
    }
    
}
