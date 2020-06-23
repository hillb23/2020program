package com.company;
import java.util.Arrays;
import java.util.Random;

public class array {

    public static void main(String[] args) {
        int [] intArray = new int[100];
        Random randy = new Random ();
        //for loop is creating the array
        for (int index = 0; index<intArray.length; index++) {
            //
           // System.out.print(intArray [index] = randy.nextInt()
        }
        //sort my array
        Arrays.sort(intArray);
        //boolean flag = false;
        for(int index=0; index<intArray.length; index++ ) {
            System.out.println(intArray[index]);

        }
    }
}
