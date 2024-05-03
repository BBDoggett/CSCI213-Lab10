/**
 * Car.java
 * Car class extending the Vehicle class.
 * @Author Blake D.
 * @Date 5/2/2024
 */

public class Car extends Vehicle {
    private int doors;
    private int passengers;

    /**
     * Constructs with attributes.
     * @param make the make
     * @param model the model
     * @param plate the license plate 
     * @param doors the number of doors
     * @param passengers the number of passengers 
     */
    public Car(String aMake, String aModel, String aPlate, int doors, int passengers) {
        super(aMake, aModel, aPlate);
        this.doors = doors;
        this.passengers = passengers;
    }

    /**
     * Getter for the number of doors
     * @return the number of doors
     */
    public int getDoors() {
        return this.doors;
    }

    /**
     * Getter for the number of passengers
     * @return the number of passengers
     */
    public int getPassengers() {
        return this.passengers;
    }

    /**
     * returns a string of the form
     * @return result  a string representation of the Car
     */
    @Override
    public String toString() {
        String result = "";
        result = String.format("%d-door %s $s with license %s.", this.doors, super.getMake(), super.getModel(), super.getPlate());
        return result;
    }

    /**
     * To find if two cars equal
     * @param obj what's being compared
     * @return true if equals false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) {
            return false;
        }
        Car other = (Car) obj;
        
        return (super.equals(other)) && (this.doors == other.doors)
                && this.passengers == other.passengers;
    }

    /**
     * makes a copy of car
     * @return a copy of this Car
     */
    public Car copy() {
        int theDoors = this.doors;
        int thePassengers = this.passengers;
        String aMake = super.getMake();
        String aModel = super.getModel();
        String aPlate = super.getPlate();
                
        Car theCopy = new Car(aMake, aModel, aPlate, theDoors, thePassengers);        
        return theCopy;
    }
}
