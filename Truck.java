/*
* This class use inheritance.
*
* @author  Jay Lee
* @version 1.0
* @since   2021-05-28
*/
// package ca.mths.unit2.unit07.java.truck;

public class Truck extends Vehicle {
    /** Field : License plate number. */
    private String licensePlateNumber;

    /**
    * This calls the contructor of Vehicle, Truck's superClass.
    * @param initLicensePlateNumber
    * @param initColour
    * @param initMaxSpeed
    */
    public Truck(final String initLicensePlateNumber, final String initColour,
                 final int initMaxSpeed) {
        super(initColour, initMaxSpeed);
        this.licensePlateNumber = initLicensePlateNumber;
    }

    /**
    * This method returns amout of air.
    * @param amountOfAir
    * @return amountOfAir
    */
    public int provideAir(final int amountOfAir) {
        return amountOfAir;
    }

    /**
    * This method returns the license plate number.
    * @return licensePlateNumber
    */
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }


    /**
    * This method gets new license plate number and sets it.
    * @param newLicensePlateNumber
    */
    public void setLicensePlateNumber(final String newLicensePlateNumber) {
        this.licensePlateNumber = newLicensePlateNumber;
    }

}
