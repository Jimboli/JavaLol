package edu.pcc.java.Assignment08.Part1;

import java.util.*;

public class BulgarianSolitaires {
    //Main method, executes all the other methods
    public static void main(String[] args) {
        ArrayList<Integer> abc = inputList();
        ArrayList<Integer> efg = new ArrayList<Integer>();

        while (!efg.equals(abc)) {
            efg = abc;
            abc = bulgarianAlgorithm(efg);
        }

    }

    //Takes input, handles exceptions, and turns input into list
    public static ArrayList<Integer> inputList() {
        System.out.print("Please enter your number(s): ");

        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();

        sc.close();

        String[] arrOfStr = numbers.split(" ");

        ArrayList<Integer> intList = new ArrayList<Integer>();

        try {
            for(String i : arrOfStr) {
                String j = i;
                int temp = Integer.parseInt(j);

                if (temp > 0) {
                    intList.add(temp);       
                }   
            }

        } catch (Exception e) {
            System.out.println("Please enter integer(s).");
        }
        
        intList.sort(Comparator.naturalOrder());
        System.out.println(intList);
        
        return intList;
    }

    //Takes input as parameter, and does algorithm for bulg. solitaire
    public static ArrayList<Integer> bulgarianAlgorithm(ArrayList<Integer> alg) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(alg.size());

        for (int item:alg) {
            if (item > 1) {
                newList.add(item-1);
            }
        }

        newList.sort(Comparator.naturalOrder());
        System.out.println(newList);
        
        return newList;
    }
}
