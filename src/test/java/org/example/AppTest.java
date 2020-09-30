package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    //testing for dm return metric system
    @Test
    public void testOne() {
        App app = new App();
        double myResult = app.calculator("25m - 30dm + 40mm + 1km -20cm", "dm");
        System.out.println("My result -> " + myResult);
        double expectedResult = 10218.4;
        assertEquals(expectedResult, myResult, 0.1);
    }
    //Testing for invalid user input for the returned metric system
    @Test
    public void testTwo() {
        App app2 = new App();
        double myResult = app2.calculator("200km -150km + 30cm", "invalid input");
        System.out.println("MyResult -> " + myResult);
        double expectedResult = -1;
        assertEquals(expectedResult, myResult, 0.1);
    }

    //Testing for metres
    @Test
    public void testThree() {
        App app3 = new App();
        double myResult = app3.calculator("120 km - 110 km + 20dm - 10 cm + 3 dm", "m");
        System.out.println("My Result -> " + myResult);
        double expectedResult = 10002.2;
        assertEquals(expectedResult, myResult, 0.1);
    }

    //testing for mm
    @Test
    public void testFour(){
        App app4 = new App();
        double myResult = app4.calculator("1km -0.5km + 300dm -2000cm + 34 dm + 200mm", "mm");
        System.out.println("My result ->> " + myResult);
        double expectedResult = 513600;
        assertEquals(expectedResult, myResult, 0.1);
    }

    //Testing for km
    @Test
    public void testFive(){
        App app5 = new App();
        double myResult = app5.calculator("1km -0.5km + 300dm -2000cm + 34 dm + 200mm", "km");
        System.out.println("My result ->> " + myResult);
        double expectedResult = 0.5136;
        assertEquals(expectedResult, myResult, 0.1);
    }

    @Test
    public void testSixOverloadedCalculatorDefaultMm(){
        App app6 = new App();
        double myResult = app6.calculator("1km + 2km - 3km + 2m - 5dm + 2000mm");
        System.out.println("My result ->> " + myResult);
        double expectedResult = 3500;
        assertEquals(expectedResult, myResult, 0.1);
    }
}