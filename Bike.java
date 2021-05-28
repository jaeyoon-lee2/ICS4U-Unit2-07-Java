/*
* This class use inheritance.
*
* @author  Jay Lee
* @version 1.0
* @since   2021-05-28
*/
// package ca.mths.unit2.unit07.java.bike;

public class Bike extends Vehicle {
    /** Field : License plate number. */
    private int cadence = 0;

    /**
    * This calls the contructor of Vehicle, Truck's superClass.
    * @param initColour
    * @param initMaxSpeed
    */
    public Bike(final String initColour, final int initMaxSpeed) {
        super(initColour, initMaxSpeed);
    }

    /**
    * This method returns string ring bell.
    * @return string
    */
    public String ringBell() {
        return "The bell rings!";
    }

    /**
    * This method returns the license plate number.
    * @return licensePlateNumber
    */
    public int getCadence() {
        return this.cadence;
    }


    /**
    * This method gets new license plate number and sets it.
    * @param newCadence
    */
    public void setCadence(final int newCadence) {
        this.cadence = newCadence;
    }
}
