package edu.pcc.java.Assignment08.Part1;

import java.util.*;

public class BulgarianSolitaires {
    //Main method, executes all the other methods
    public static void main(String[] args) {
        ArrayList<Integer> abc = inputList();
        bulgarianAlgorithm(abc);
    }

    //Takes input, handles exceptions, and turns input into list
    public static ArrayList<Integer> inputList() {
        System.out.print("Please enter your number(s): ");

        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();

        sc.close();

        String[] arrOfStr = numbers.split(" ");

        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList());

        try {
            for(String i : arrOfStr) {
                int j = Integer.parseInt(i);
                
                if (j > 0) {
                    intList.add(j);
                } else {
                    continue;
                }
                
            }

        } catch (Exception e) {
            System.out.println("Please enter integer(s).");
        }
        
        return intList;
    }

    //Takes input as parameter, and does algorithm for bulg. solitaire
    public static void bulgarianAlgorithm(ArrayList<Integer> alg) {
        int[] goal = {1,2,3,4,5,6,7,8,9};
        int[] A = new int[45];
        int total = 45;
        int currentSize = 0;
        int counter=0;
        
        //Form initial pile of random size >=1 and <=45
        for(int i=0; total>0; i++)
        {
          int rn = (int) (Math.random()*total)+1;
          total -= rn;
          A[i] = rn;
          currentSize++;
        }
        System.out.println(A, currentSize);
        
        //Start game of removing one card from each pile
        while(true)
        {
          int newPile=0;
          for(int i=0; i<currentSize ; i++)
          { 
            A[i] = A[i]-1; //remove one card from each pile
            newPile++;      
          }
          
          currentSize++;
          A[currentSize-1] = newPile;
    }

    //Prints the result(s)
    public static void arrayPrinter(int[][] b) {
    }

}