package com.company;

public class letterK {

    public static void main(String[] args) {
        double num1 = 9.7;
        int num2 = 5;
        double total;
        int total2;

        total = num1 + num2;
        // type casting
        total2 = num2 + (int) num1;
        //    System.out.println("Total 1= " + total + "Total 2" + total2);

        char letter = 117;
        for (byte count = 0; count < 5; count++) {
            System.out.print((char)(letter+count) + " ");
        }
        System.out.println((char)(letter-20));
    }
}
