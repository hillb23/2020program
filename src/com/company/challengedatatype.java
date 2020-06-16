//Bridget Hill
// 6/16/20

//Initialize and create variables
//Int i = 6;
//Double d = 5.0;
//String s = “Hornet”;
//Create scanner object
//Use methods to initialize variables
//Using the operator perform:
//Print the sum of i plus your int variable on a new line
//Print the sum of d plus your double variable to a scale of the tenths decimal place on a new line
//Sequence 8 with the string you read as input and print result on new line
//When inputting:
//First line has an integer that has to be added to i
//Second line contains a double that you must sum with d
//Third line  contains a string that you must concat with s
//The Output
//The sum of both integers on the first line
//Sum of the doubles (to the tenths place) on the second line
//Two concat strings on the third line

package com.company;
import java.util.*;

public class challengedatatype {

    public static void main(String [] args) {
        //Initialize and create variables
        int i = 4;
        double d = 4.0;
        String s = "Greenhill";

        // create scanner
        Scanner one = new Scanner (System.in);
        // declare another int, double, string
        int number;
        double decimal;
        String words;

        // print a prompt and set integer number = to the integer inputted
        System.out.println("Type an integer here: ");
        number = one.nextInt();

        // print a prompt and set double decimal = to the given double
        System.out.println("Type a double: ");
        decimal = one.nextDouble();

        // print a prompt and set words = to user given phrase
        System.out.println("Type a string: ");
        words = one.nextLine();

        // printing the final outcomes for the math concat
        System.out.println(i + number);
        System.out.printf(" \n %10.1f", (d + decimal));
        System.out.println(s.concat(words));




    }
}
