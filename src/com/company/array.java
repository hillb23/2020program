package com.company;
import java.util.Arrays;
import java.util.Random;

public class array {

    public static void main(String[] args) {
        int [] intArray = new int[100];
        Random randy = new Random ();
        //for loop is creating the array
        for (int index = 0; index<intArray.length; index++) {
            intArray[index] = randy.nextInt(100)+1;
            //creates a random between 1-100 exclusive
            System.out.println("the value of the array at index");

            //
           // System.out.print(intArray [index] = randy.nextInt()
        }
        System.out.println(Arrays.toString(intArray));
        //intArray =
        //sort my array
        Arrays.sort(intArray);
        //boolean flag = false;
        for(int index=0; index<intArray.length; index++ ) {
            System.out.println(intArray[index]);

        }
    }
}
