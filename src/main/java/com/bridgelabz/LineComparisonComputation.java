package com.bridgelabz;
//Scanner utility
import java.util.Scanner;

public class LineComparisonComputation {
    //Creating a ComapareTo method
    static void compareTo(Double value1, Double value2) {
        if (value1 == value2) {
            System.out.println("Both the lines are equal in length.");
        } else if (value1 > value2) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 2 is greater than Line 1");
        }
    }

    public static void main(String[] args) {
        //Variables
        int x1, x2, y1, y2, x3, x4, y3, y4;
        //calling Scanner method to take inputs from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cartesian Co-ordinates");
        System.out.println("Enter x1 ");
        x1 = sc.nextInt();
        System.out.println("Enter x2 ");
        x2 = sc.nextInt();
        System.out.println("Enter y1 ");
        y1 = sc.nextInt();
        System.out.println("Enter y2 ");
        y2 = sc.nextInt();
        double line1 = (Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));
        System.out.println("Length of the line:" + line1);
        System.out.println("Enter Coordinates of next line : ");
        System.out.println("Enter x1 of line 2 : ");
        x3 = sc.nextInt();
        System.out.println("Enter x2 of line 2 : ");
        x4 = sc.nextInt();
        System.out.println("Enter y1 of line 2 : ");
        y3 = sc.nextInt();
        System.out.println("Enter y2 of line 2 : ");
        y4 = sc.nextInt();
        double line2 = (Math.sqrt(Math.pow((x4 - x3), 2)) + Math.pow((y4 - y3), 2));
        //calling compareTo method
        compareTo(line1, line2);

    }
}
