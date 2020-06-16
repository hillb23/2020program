package com.company;

import java.util.Scanner;

public class gangstaclassversion {

    public static void main(String[] args) {
        String name = "MAria SUarez";
        System.out.println(name);
        //to create a scanner object give it a name
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter your name: ");
        name = input.nextLine() ; //next only takes one word
        System.out.println(name);

    }
}
