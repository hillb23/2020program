//Bridget Hill
//input scanner
//ask user for string
//return method
// S of length N
//indexed between



package com.company;
import java.util.*;

public class stringchallenge {
    Scanner input = new Scanner(System.in);
    //System.out.print("Input phrase to equal the value of N:");


    public static void main(String[] args) {
        for (int even= 2; even <= 10000; even= even+2) {
            System.out.print(" "+even);

        }
        System.out.println();
        for (int odd = 3; odd <= 9999; odd = odd+2) {
            System.out.print(odd+" ");
        }
    }
}
