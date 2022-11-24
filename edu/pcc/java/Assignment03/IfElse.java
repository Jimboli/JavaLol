/* Name: Ishan Prabhu
* Assignment: If Else Statements
* Class: CIS 016 Programming with Java
* Date: October 3
* */


package edu.pcc.java.Assignment03;
import java.util.Scanner;


public class IfElse {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

Double weight = null;
Double age = null;

//Catch errors with non-numeric input
try {
System.out.print("Please enter your age: ");
age = input.nextDouble();

System.out.print("Please enter your weight: ");
weight = input.nextDouble();


} catch (Exception ex) {
System.out.println("Input is non-numeric.");

return;

} finally {
input.close();

}

// If Statements
if (age < 0 || weight < 0) {

System.out.print("The program does not accept negative inputs.");
} else if (age <= 10 && weight < 80) {

System.out.println("This person needs to ride the black roller coaster.");
} else if (age <= 10 && weight >= 80 && weight <= 200 ) {

System.out.println("This person needs to ride the green roller coaster.");
} else if (age <= 10 && weight > 200) {

System.out.println("This person needs to ride the yellow roller coaster.");
} else if (age > 10 && age <= 20 && weight < 80) {

System.out.println("This person needs to ride the silver roller coaster.");
} else if (age > 10 && age <= 20 && weight >= 80 && weight <= 200) {

System.out.println("This person needs to ride the red roller coaster.");
} else if (age >= 10 && age <= 20 && weight > 200) {

System.out.println("This person needs to ride the purple roller coaster.");
} else {

System.out.println("This person needs to ride the pink roller coaster.");

}
}

}
