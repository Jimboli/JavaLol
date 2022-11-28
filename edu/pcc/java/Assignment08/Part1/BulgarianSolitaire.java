// Ishan Prabhu
// Assignment #08: Bulgarian Solitaire
// November 1


package edu.pcc.java.Assignment08.Part1;
import java.util.*;

public class BulgarianSolitaire {
    // Property that has the list of values in the group
    ArrayList<Integer> cardGroup ;

    // Constructor to create objects from the initial group
    public BulgarianSolitaire (String input) {
        cardGroup = new ArrayList<Integer>();
        String[] arrOfStr = input.split(" ");

            for(String i : arrOfStr) {
                String j = i;
                int temp = Integer.parseInt(j);

                if (temp > 0) {
                    cardGroup.add(temp);       
                }   
            }    
        cardGroup.sort(null);
    }

    // Second constructor used by the method that generates next step
    public BulgarianSolitaire (ArrayList<Integer> input) {
        input.sort(null);
        cardGroup = input;
    }


    // This method will return the object with the next set of card values
    public BulgarianSolitaire play () {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(this.cardGroup.size());

        for (int item:this.cardGroup) {
            if (item > 1) {
                newList.add(item-1);
            }
        }        
        return new BulgarianSolitaire(newList) ;
    }

    // Compares 2 cardGroups
    public boolean equals (BulgarianSolitaire b) {
        return this.cardGroup.equals (b.cardGroup);
    }

    // String representation of the object
    public String toString () {
        String outputString = "";
        for (int i:cardGroup) {
            outputString = outputString + " " + i;
        }
        return outputString;
    }
}
