package com.company;

public class evensandodds {

    public static void main(String[] args) {
        for (int even= 0; even <= 100; even= even+2) {
            System.out.print(" "+even);

        }
        System.out.println();
        for (int odd = 1; odd <= 99; odd = odd+2) {
            System.out.print(odd+" ");
        }
    }
}
