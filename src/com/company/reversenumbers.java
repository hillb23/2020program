//Bridget Hill
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
        int a; //create each element
        int c;
        do {
            a = randy.nextInt(size);
            c = randy.nextInt(size);
        } while (a==c);
        System.out.println(Arrays.toString(number));
        number = reverse(number,a,c);
        System.out.println(Arrays.toString(number));
    }
        public static int[] reverse (int [] num, int x, int z) {

        int temp = num[x];
        num [x] = num[z];
        num [z] = temp;
        return num; //return swapped array


    }
}
