//Bridget Hill
//6-22-20
/* input scanner
enter the # of strings
put in error phrase in case they enter a number below 1 or over 10
for loop to read T number of input strings
convert each string to an even odd format
concatenate all even and odd characters and store inside of a for loop
return to main function answer */


package com.company;
import java.util.*;

public class stringarraychallenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] stringArray = new String[10];
        System.out.println("Enter the number of strings you want to print between 1 and 10: ");
        int T = input.nextInt();
        input.nextLine(); //skip return key
        while (T < 1 || T > 10) {
            System.out.println("You can only print 1 to 10 strings"); //the error message that gets printed if the number the user inputs isn't between 1 and 10
            System.out.println("Enter the number of strings you want to print between 1 and 10: ");
            T = input.nextInt();
            input.nextLine(); //skip return key
        }
        for (int i = 0; i < T; i++) {  //for loop reads T number of input strings
            System.out.print("Type input string #" + (i + 1) + ": ");
            stringArray[i] = input.nextLine(); //stores input string seperately in this array
        }

        for (int i = 0; i < T; i++) {
            String finalAnswer = evenOdd(stringArray[i]); //converts each input string to even/odd format
            System.out.println(finalAnswer);
        }
    }
    public static String evenOdd (String str) {
        String evens= "";
        String odds = "";
            for (int i = 0; i < str.length(); i+=2) {
                evens = evens+str.charAt(i); //all the even index characters are concatenated and stored inside this for loop
            }
            for (int i = 1; i < str.length(); i+=2) {
                odds = odds+str.charAt(i); // all the odd index characters are concatenated and stored inside this for loop
        }
            String answer= evens + " " + odds;
            return answer; //goes back to main function "answer"
    }

}

