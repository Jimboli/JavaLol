/* Name: Ishan Prabhu
* Assignment: #5 Strings
* Class: CIS 016 Programming with Java
* Date: October 4
* */


package edu.pcc.java.Assignment05;

import java.util.Scanner;


public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 cities (Separated by a space) without spaces in their names: ");

        String city1 = input.next();
        String city2 = input.next();
        String city3 = input.next();

        input.close();

        String x = null;
        String y = null;
        String z = null;

        if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0) {
            if (city2.compareTo(city3) < 0) {
                x = city1;
                y = city2;
                z = city3;
        }

            else if (city2.compareTo(city3) > 0) {
                x = city1;
                y = city3;
                z = city2;
            }

        }

        else if (city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0) {
            if (city1.compareTo(city3) < 0) {
                x = city2;
                y = city1;
                z = city3;
            }

            else {
                x = city2;
                y = city3;
                z = city1;
            }
        }
        else {
            if (city1.compareTo(city2) < 0) {
                x = city3;
                y = city1;
                z = city2;
            }

            else {
                x = city3;
                y = city2;
                z = city1;
            }
        }

        System.out.println("Your 3 cities in alphabetical order are: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        }
        }
    