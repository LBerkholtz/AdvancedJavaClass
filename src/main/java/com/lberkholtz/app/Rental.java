// Written by Laura Berkholtz
package com.lberkholtz.app;

/**
 * This class uses the dependency injection pattern - all dependencies are injected at run time
 * Class Rental holds information about a rental property and has methods to calculate  total cost
 * per square foot over the life of the lease, monthly square foot cost, and total cost of the lease
 */
public class Rental {
    //define class parameters to be passed in to class
    private int rent ; // rent in whole dollars
    private int leaseLength ; // length of lease in months
    private int footage ; // size of rental unit in square feet
    private String rentalType;

    // constructor: values for class parameters will be injected at run time


    public Rental(int rent, int leaseLength, int footage, String rentalType) {
        this.rent = rent;
        this.leaseLength = leaseLength;
        this.footage = footage;
        this.rentalType = rentalType;
    }
    /**
     * Calculate the total cost per square footage over the life of the lease
     * rounded up to the nearest dollar.
     */
    public int totalCostPerSquareFoot() {
        int totalCost = rent * leaseLength;
        int tCostPerSquareFoot = 0;  //initialize to zero to avoid divide by zero error
        if (footage > 0) {
            tCostPerSquareFoot = totalCost/footage;
        }
        return tCostPerSquareFoot;
    }
    /**
     * Call this to calculate the monthly cost per square foot
     * rounded up to the nearest dollar.
     */
    public int monthlyCostPerSquareFoot() {
        int mCostPerSquareFoot = 0; //initialize to zero to avoid divide by zero error
        if (footage > 0) {
            mCostPerSquareFoot = rent / footage;
        }
        return mCostPerSquareFoot;
    }
    /**
     * Call this to calculate the total cost of the lease
     * rounded up to the nearest dollar.
     */
    public int totalCostOfLease() {
        return rent * leaseLength;
    }

}

