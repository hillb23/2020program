package com.company;
import java.util.*;
import java.util.Scanner;

public class testingprograms {
    public static void main(String [] args) {
        int num = 7; //primitive data type
        //byte, int, short, long, char, boolean, float, double
        //object is an instance of a class
        System.out.print("Please enter your full name");
        Scanner keyboard = new Scanner (System.in) ;
        String fullName= keyboard.nextLine();
        int indexOf=fullName.indexOf(" ");
        System.out.println(indexOf);
        String lastName= fullName.substring(indexOf+1) ; // String is an array of
        String firstName= fullName.substring(0, indexOf);
        byMyself(firstName, keyboard);
        byMyself(lastName, keyboard);
        classchallengeversion2.Line();
        String letter = fullName.substring(0, 1);
        System.out.println (letter+ ".");

    }
public static void byMyself(String name, Scanner keyboard) {
        name = name.toUpperCase();
        //String secondName = keyboard.next(); //watch out for lack of verbal warning for the person using the code
        System.out.println("Hello " + name.toUpperCase());
        System.out.println("Hello " + name);
}


}
