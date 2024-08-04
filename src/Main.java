/**
 * The Automobile class represents a vehicle with attributes such as make, model, color, and year.
 */
public class Automobile {
    // Private variables to store the automobile information
    private final String make;
    private final String model;
    private final String color;
    private final int year;

    /**
     * Constructor to initialize an Automobile object.
     *
     * @param make  The make of the automobile.
     * @param model The model of the automobile.
     * @param color The color of the automobile.
     * @param year  The year of the automobile.
     */
    public Automobile(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Getters for accessing the automobile attributes
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    /**
     * Displays the vehicle information.
     *
     * @return A string representation of the vehicle information.
     */
    @Override
    public String toString() {
        return "Vehicle: " + make + " " + model + " " + color + " " + year;
    }

    public static void main(String[] args) {
        // Example usage of the Automobile class
        Automobile car = new Automobile("Honda", "Fit", "Red", 2010);
        System.out.println(car);
    }
}
