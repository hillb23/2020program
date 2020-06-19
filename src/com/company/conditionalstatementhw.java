//Bridget Hill 6/19
//Make “n” a value between 1 and 137
//N > 1
//N <= 137
//Use a for loop so the problem can repeat as many times as the user wants
//Nesting if
//N = 1, 6, 20
//System.out.print(“weird’);
//If else n = 2, 4
//System.out.print(“not weird”);
//If else n = (range) previous number + 2 - 20-2
//System.out.print(“weird”);
//If else n = 20//previous number+2 -> 136
//System.out.print(“not weird”);

package com.company;
import java.util.*;

public class conditionalstatementhw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Want to play the game(Yes or No):");
        String play = input.next(); //calling a method
        input.nextLine();
        while (play.contains("Yes")) {
            playGame(input);
            System.out.print("Want to play the game (Yes or No):");
            play = input.next();
        }

        System.out.println("Enjoy the rest of your day! Peace.");
    }

    public static void playGame(Scanner input) {
        System.out.println("Type a number between 1 and 137 here:");
        int n = input.nextInt();
        if (n < 1 || n > 137) {
            System.out.println("Please run again and type in number between 1 and 137 here:");
            playGame(input);
        }
        else if (n % 2 != 0) {
            System.out.println("Weird");
        }
        else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not weird");
            }
            else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            }
            else {
                System.out.println("Not weird");
            }

        }

    }
}
