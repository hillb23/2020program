package com.company;
import java.util.*;


public class numbersandthings {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        String answer;
        do {
            Random guess = new Random();
            int guess1 = guess.nextInt(90);
            System.out.printf("%5d \n ", guess1);
            double doubly1 = 4.65;
            int integy1 = 9;
            double rndy = Math.random(); //random number between 0 and 1
            int randy = (int) rndy * 100;
            System.out.printf(" %10.5f \n %5d", rndy, randy);
            System.out.println("Do you want to try again ");
            answer = input.next();
                    String stringy = "Greenhill";
            System.out.printf("Printing a string: %s\n", stringy);

            double doubly2 = Math.sqrt(doubly1 * integy1);
            double doubly3 = doubly2 * doubly1;
            double doubly4 = Math.pow(doubly3, 4);
            System.out.printf(" This is my calculation \n %20.3f \n %20.3f", doubly2, doubly3);

        }
        while(answer.contains("y"));

    }
}
