package com.company;

import java.util.Scanner;
public class gangstaname {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name, playa: ");
        String name = console.nextLine();
        //split name into first and last initials
        String first = name.substring(0, name.indexOf (" "));
        String last = name.substring(name.indexOf(" ")+1);
        last = last.toUpperCase();
        String fInitial = first.substring(0,1);
        //print out gangsta name output
        System.out.println("Your gangsta name is \"" + fInitial + ". Diddy" + last + " " + first + "-izzle\"");



    }
}
