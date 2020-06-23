package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.*;

public class arraypractice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("How many days' temperature? ");
        int numdays = input.nextInt();
        int [] temp = new int [numdays];
        int sum = 0;

        for(int daysprinted = 0; daysprinted < numdays; daysprinted++) {
            System.out.print("Day " + (daysprinted + 1) + "'s high temp: ");
            temp[daysprinted] = input.nextInt();
            sum += temp[daysprinted];
        }

        double average = (double) sum / numdays;
        int count = 0;

        for(int i=0;  i < numdays; i++) {
            if (temp[i] > average) {
                count++;
            }
        }
        System.out.printf("Average temp = %.1f\n", average);
        System.out.printf(count + " days above average.");

    }
}
