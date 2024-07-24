/**
 * The Automobile class represents a vehicle with attributes such as make, model, color, and year.
 */
public class Automobile {
    // Private variables to store the automobile information
    private String make;
    private String model;
    private String color;
    private int year;

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

    /**
     * Adds vehicle information.
     *
     * @param make  The make of the automobile.
     * @param model The model of the automobile.
     * @param color The color of the automobile.
     * @param year  The year of the automobile.
     * @return A message indicating the vehicle has been added.
     */
    public String addVehicle(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        return "Vehicle added: " + make + " " + model + " " + color + " " + year;
    }

    /**
     * Removes vehicle information if the provided details match the stored values.
     *
     * @param make  The make of the automobile.
     * @param model The model of the automobile.
     * @param color The color of the automobile.
     * @param year  The year of the automobile.
     * @return A message indicating the result of the removal attempt.
     */
    public String removeVehicle(String make, String model, String color, int year) {
        if (this.make.equals(make) && this.model.equals(model) && this.color.equals(color) && this.year == year) {
            this.make = null;
            this.model = null;
            this.color = null;
            this.year = 0;
            return "Vehicle removed: " + make + " " + model + " " + color + " " + year;
        } else {
            return "Mismatch: Vehicle not found.";
        }
    }

    /**
     * Displays the vehicle information.
     *
     * @return A string representation of the vehicle information.
     */
    public String displayVehicle() {
        if (make != null) {
            return "Vehicle: " + make + " " + model + " " + color + " " + year;
        } else {
            return "No vehicle information available.";
        }
    }

    public static void main(String[] args) {
        // Example 
        Automobile car = new Automobile("Honda", "Fit", "Red", 2010);
        System.out.println(car.displayVehicle());
        System.out.println(car.removeVehicle("Honda", "Fit", "Red", 2010));
        System.out.println(car.displayVehicle());
    }
}
