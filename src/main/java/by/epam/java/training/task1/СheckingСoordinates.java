package by.epam.java.training.task1;

import java.util.Scanner;

    /*4. Для данных областей составить линейную программу, которая печатает true,
    если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:*/

public class СheckingСoordinates {
    public static void main(String[] args) {
        int x;
        int y;
        boolean isCoordinateInArea;

        x = inputCoordinate("x");
        y = inputCoordinate("y");

        isCoordinateInArea = isCoordinatesInTheSelectedArea(x, y);

        System.out.println(isCoordinateInArea);

    }

    public static int inputCoordinate(String сoordinateAxis) {
        int coordinateValue;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input coordinate " + сoordinateAxis + "\n>");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Not a number!\n>");
        }
        coordinateValue = scanner.nextInt();

        return coordinateValue;
    }

    public static boolean isAboveTheCoordinateAxisX(int x, int y) {
        boolean isAbove;

        isAbove = y >= 0 && y <= 4 && x >= -2 && x <= 2;

        return isAbove;
    }

    public static boolean isBelowTheCoordinateAxisX(int x, int y) {
        boolean isBelow;

        isBelow = y >= -3 && y <= 0 && x >= -4 && x <= 4;

        return isBelow;
    }

    public static boolean isCoordinatesInTheSelectedArea(int x, int y) {
        boolean isAbove;
        boolean isBelow;
        boolean result;

        isAbove = isAboveTheCoordinateAxisX(x, y);
        isBelow = isBelowTheCoordinateAxisX(x, y);

        result = isAbove || isBelow;

        return result;
    }
}
