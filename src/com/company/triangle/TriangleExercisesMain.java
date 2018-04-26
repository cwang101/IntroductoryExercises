package com.company.triangle;

public class TriangleExercisesMain {

    public static void main(String[] args) {
        TriangleDrawer drawer=new TriangleDrawer();
        // write your code here
        System.out.println("Now a horizontal line will be drawn:");
        drawer.drawHorizontalLine(8);
        System.out.println("Now a vertical line will be drawn:");
        drawer.drawVerticalLine(3);
        System.out.println("Now a right triangle will be drawn:");
        drawer.drawRightTriangle(3);
    }
}
