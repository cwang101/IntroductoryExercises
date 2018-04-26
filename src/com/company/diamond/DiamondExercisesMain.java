package com.company.diamond;

import com.company.triangle.TriangleDrawer;

public class DiamondExercisesMain {
    public static void main(String[] args) {
        DiamondDrawer drawer=new DiamondDrawer();
        // write your code here
        System.out.println("Now a isosceles triangle will be drawn:");
        drawer.drawIsoscelesTriangle(3);
        System.out.println("Now a diamond  will be drawn:");
        drawer.drawDiamond(3);
        System.out.println("Now a diamond with name will be drawn:");
        drawer.drawDiamondWithName(3,"bill");
    }
}
