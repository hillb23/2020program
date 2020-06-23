//Bridget Hill
//6-23-20
//import java.util.Arrays/Random;
//create random object
//declare my int variable for the size
//declare my array
//use randomObject.nextInt for it
//for loop with the size
//create each element randomObject.nextInt
//call your swap (array, i1, i2)
//p s int[] swap(int [] name, int1, int2) {
//return swapped array





package com.company;
import java.util.Arrays;
import java.util.Random;

public class reversenumbers {
    public static void main(String [] args) {
        Random randy = new Random(); //creation of the random object
        int size = randy.nextInt(5) + 5; //j=length of the array
        int[] number = new int[size];
        for (int j = 0; j < size; j++) { //for loop with the size
            number[j] = randy.nextInt(100);
        }
        System.out.println("Original Array \n" + Arrays.toString(number));
        int a = randy.nextInt(number.length);
        int b = randy.nextInt(number.length);
        while (a==b) {
            a = randy.nextInt(number.length);
        }
        int [] number2 = swap(number, a,b);
        System.out.println("\n Swapped Array between " + (a+1)+"th # and " + (b+1) + "th # \n" + Arrays.toString(number2));


        /*int a; //create each element
        int c;
        do {
            a = randy.nextInt(size);
            c = randy.nextInt(size);
        } while (a==c);
        System.out.println(Arrays.toString(number));
        number = reverse(number,a,c);
        System.out.println(Arrays.toString(number)); */
    }
        public static int[] swap (int [] num, int j, int i) {

        int temp = num[j];
        num [j] = num[i];
        num [i] = temp;
        return num; //return swapped array


    }
}
