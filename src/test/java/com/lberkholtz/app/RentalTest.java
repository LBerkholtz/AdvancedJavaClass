package com.lberkholtz.app;

import org.junit.* ;
import static org.junit.Assert.* ;



/**
 * Unit test for Rental.
 */
public class RentalTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testTotalCostPerSquareFoot() {
        Rental R = new Rental(5000,10,1000, "TwoBedroomTwoBath") ;
        assertTrue(R.totalCostPerSquareFoot() == 50) ;
    }
    @Test
    public void monthlyCostPerSquareFoot() {
        Rental R = new Rental(2000,5,1000, "ThreeBedroomThreeBath") ;
        assertTrue(R.monthlyCostPerSquareFoot() == 2) ;
    }
    @Test
    public void totalCostOfLease() {
        Rental R = new Rental(1000, 12,0,"OneBedroomOneBath") ;
        assertTrue(R.totalCostOfLease() == 12000) ;
    }

}
