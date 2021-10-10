package by.epam.java.training.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class СheckingСoordinatesTest {

    @Test
    public void TrueAboveTheCoordinateAxisX() {
        int x = 2;
        int y = 2;
        boolean expectedResult = true;
        boolean realResult;

        realResult = СheckingСoordinates.isAboveTheCoordinateAxisX(x,y);

        assertEquals(expectedResult, realResult);
    }

    @Test
    public void FalseAboveTheCoordinateAxisX() {
        int x = 3;
        int y = 5;
        boolean expectedResult = false;
        boolean realResult;

        realResult = СheckingСoordinates.isAboveTheCoordinateAxisX(x,y);

        assertEquals(expectedResult, realResult);
    }

    @Test
    public void TrueBelowTheCoordinateAxisX() {
        int x = -4;
        int y = -3;
        boolean expectedResult = true;
        boolean realResult;

        realResult = СheckingСoordinates.isBelowTheCoordinateAxisX(x,y);

        assertEquals(expectedResult, realResult);
    }

    @Test
    public void FalseBelowTheCoordinateAxisX() {
        int x = -5;
        int y = -3;
        boolean expectedResult = false;
        boolean realResult;

        realResult = СheckingСoordinates.isBelowTheCoordinateAxisX(x,y);

        assertEquals(expectedResult, realResult);
    }

}