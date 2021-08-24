package com.bridgelabz;
import java.util.Scanner;

public class LineComparisonComputation {
    public static void main(String[] args) {
        //Varialbles
        int x1, x2, y1, y2 ;
        //calling Scanner method to take inputs from console
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Cartesian Co-ordinates");
        System.out.println("Enter x1 ");
        x1 = sc.nextInt();
        System.out.println("Enter x2 ");
        x2 = sc.nextInt();
        System.out.println("Enter y1 ");
        y1 = sc.nextInt();
        System.out.println("Enter y2 ");
        y2 = sc.nextInt();
        System.out.println("Length of the line:"+(Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2)));
    }
}
