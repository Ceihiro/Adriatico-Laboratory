public class Vehicle{
    // Private Attributes
    private String brand;
    private int speed;
    private String fuelType;

    // Constructor
    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // getter methods
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Display Method
    public String displayInfo(){
        System.out.println("");
    }

}