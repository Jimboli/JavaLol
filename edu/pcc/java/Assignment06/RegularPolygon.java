/* Name: Ishan Prabhu
* Assignment: #5 Strings
* Class: CIS 016 Programming with Java
* Date: October 5
* */


package edu.pcc.java.Assignment06;

import java.util.Scanner;
import java.lang.Math;


public class RegularPolygon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Integer sideCount = null;
        Double sideLength = null;

        String a = "Y";

        while (a.toUpperCase().compareTo("Y") == 0) {
            try {

                System.out.println("Enter the number of sides: ");
                String temp1 = input.next();
                sideCount = Integer.parseInt(temp1);
                
                System.out.println("Enter the side length: ");
                String temp2 = input.next();
                sideLength = Double.parseDouble(temp2);
                
                double regPolygon = area(sideCount, sideLength);

                System.out.println("The area of this regular polygon is: " + regPolygon);
                   
            }
            catch (Exception ex) {
                System.out.println("Please enter an integer for sides, and a double for the side length!");
            }   
            
            System.out.println("Do you want to do this again? (Y to continue)");
            a = input.next();
        }

         
        input.close();
    }

    
    public static double area(int n, double side) {
        final double PI = Math.PI;
        double area = (n * Math.pow(side, 2))/(4*Math.tan(PI/n));

        return area;
    }
    
}
