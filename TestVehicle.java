import java.util.Scanner;

public class Vehicle{
    Scanner input = new Scanner(System.in);
    
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
        System.out.println("Vehicle Details");
        System.out.println("Brand    : " + brand);
        System.out.println("Speed    : " + speed);
        System.out.println("FuelType : " + fuelType);
    }

}

// Car Subclass
public class Car extends Vehicle{
    // extra attribute
    private int numDoors;

    // Constructor
    public Car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NumDoor  : " + numDoors);
    }
}

// Motorcycle Subclass
public class Motorcycle extends Vehicle{
    // extra attribute
    private boolean hasSidecar;

    // Constructor
    public Car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (hasSidecar) {
            System.out.println("Has Sidecar : Yes");
        } 
        else { 
            System.out.println("Has Sidecar : No");
        }
    }
}

