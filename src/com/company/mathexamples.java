package com.company;

public class mathexamples {
public static void main (String [] args) {
    float floaty1 = -5.67f;
    int integy1 = -7;
    float floaty2 = Math.abs(floaty1);
    int integy2 = Math.abs(integy1);
    System.out.println(floaty1 + "   " + floaty2);
    System.out.println("min = "+Math.min(floaty1, floaty2));
    System.out.println(integy1 + "   " + integy2);
    System.out.println("max = "+Math.max(floaty1, floaty2));
    double root = Math.sqrt(Math.abs(floaty1));
    System.out.println("square root = "+Math.ceil(root));
    System.out.println("square root = "+Math.round(root));



}

}
