package edu.pcc.java.Assignment08.Part1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter your number(s): ");

        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();

        sc.close();

        BulgarianSolitaire b1 = new BulgarianSolitaire (numbers);
        
        boolean loop = true;

        while (loop) {
            System.out.println(b1.toString());
            BulgarianSolitaire b2 = b1.play();
            if (b2.equals(b1)) {
                loop = false;
            } else {
                 b1 = b2;
            }
        }
    }
}
