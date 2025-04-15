import java.util.Scanner;

class Vehicle {
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
    public void displayInfo(){
        System.out.println("Brand    : " + brand);
        System.out.println("Speed    : " + speed);
        System.out.println("FuelType : " + fuelType);
    }

}

// Car Subclass
class Car extends Vehicle{
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
class Motorcycle extends Vehicle{
    // extra attribute
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String brand, int speed, String fuelType, boolean hasSideCar) {
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

public class TestVehicle {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Car Details");
        System.out.print("Brand     : ");
        String carBrand = input.nextLine();
        System.out.print("Speed     : ");
        int carSpeed = input.nextInt();
        input.nextLine();
        System.out.print("Fuel Type : ");
        String carFuelType = input.nextLine();
        System.out.print("NumDoors  : ");
        int carNumDoors = input.nextInt();
        input.nextLine();
        System.out.println();

        Car car = new Car(carBrand, carSpeed, carFuelType, carNumDoors);
        car.displayInfo();

        System.out.println();
        System.out.println("Motorcycle Details");
        System.out.print("Brand       : ");
        String motorBrand = input.nextLine();
        System.out.print("Speed       : ");
        int motorSpeed = input.nextInt();
        input.nextLine();
        System.out.print("Fuel Type   : ");
        String motorFuelType = input.nextLine();
        System.out.print("HasSidecar [True or False] : ");
        boolean motorHasSidecar = input.nextBoolean();

        Motorcycle motor = new Motorcycle(motorBrand, motorSpeed, motorFuelType, motorHasSidecar);
        motor.displayInfo();

        input.close();
     }
}