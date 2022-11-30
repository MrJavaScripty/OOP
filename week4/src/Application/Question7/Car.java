package week4.src.Application.Question7;

public class Car {

    private String licensePlate;
    private double speed; // kilometers per hour
    private double maxSpeed; // kilometers per hour
    // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }
    }

    public Car(String licensePlate1, double maxSpeed1, double speed1) {
        this.licensePlate = licensePlate1;
        this.speed = speed1 < 0.0 ?  0 :  speed1;

        /*

        * A ternary operator can be used only if and only if a single value is returned after the condition is met
        * The statement below the commented code block implements the ternary operator

        if (maxSpeed1 <= speed1) {
            maxSpeed = speed1;
        }
        else {
            maxSpeed = 0.0;
        }
         */

        maxSpeed = maxSpeed1 <= speed1 ? speed1 : 0.0;
    }

    /**
     * Prints the variables and there values
     */
    public void print() {
        System.out.printf("Current Speed: %s\nMaximum Speed: %s\nLicence Plate: %s", this.speed, this.maxSpeed,
                this.licensePlate);
    }


    /*
     * Alternatively, the same can be achieved by overriding the toString()
     */
    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
