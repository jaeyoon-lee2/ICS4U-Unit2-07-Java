/*
* This class use contructor.
*
* @author  Jay Lee
* @version 1.0
* @since   2021-05-27
*/
// package ca.mths.unit2.unit07.java.vehicle;

public class Vehicle {
    /** Field : Colour. */
    private String colour;
    /** Field : Speed. */
    private int speed;
    /** Field : Max speed. */
    private int maxSpeed;

    /**
    * This method constructs the vehilce class.
    * @param initColour
    * @param initMaxSpeed
    */
    public Vehicle(final String initColour, final int initMaxSpeed) {
        this.colour = initColour;
        this.speed = 0;
        this.maxSpeed = initMaxSpeed;
    }

    /**
    * This method prints to console all the properties.
    */
    public void printVehicleInfo() {
        System.out.println("Colour: " + getColour());
        System.out.println("Max speed: " + getMaxSpeed() + "km/h");
        System.out.println("Current speed: " + getSpeed() + "km/h");
    }

    /**
    * This method accelerates the speed.
    * @param increment
    */
    public void accelerate(final int increment) {
        if (speed + increment <= maxSpeed) {
            this.speed += increment;
        } else {
            System.out.println("The vehicle is at max speed!");
            this.speed = maxSpeed;
        }
    }

    /**
    * This method decelerates the speed.
    * @param decrement
    */
    public void brake(final int decrement) {
        if (speed - decrement >= 0) {
            this.speed -= decrement;
        } else {
            System.out.println("The vehicle has stopped!");
            this.speed = 0;
        }
    }

    /**
    * This method returns the colour of the car.
    * @return colour
    */
    public String getColour() {
        return this.colour;
    }

    /**
    * This method returns the max speed.
    * @return maxSpeed
    */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
    * This method returns current speed.
    * @return speed
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * This method gets new colour and sets it.
    * @param newColour
    */
    public void setColour(final String newColour) {
        this.colour = newColour;
    }
}
