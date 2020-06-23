//Bridget Hill
//6-22-20


package com.company;
import java.util.Scanner;

public class stringarraychallenge {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int n = 10;
    String[] words = new String[n]; //declare the array to take the words

    for (int i = 0; i < words.length; i++) { //this is the index of the array
        System.out.println("Please enter word with at least 4 characters: ");
    words[i] = input.next();
    }
    String[] newWord = new String[words.length];

    for (int i = 0; i < words.length; i++) {
        newWord[i] = scramble(words[i]);
        System.out.println(newWord[i]);
    }
}

public static String scramble(String word) {
    String evenword = "";

for (int even = 1; even < word.length(); even +=2) {
    char temp = word.charAt(even);
        evenword = evenword + temp;
        }
        String oddword = "";

for (int odd = 0; odd < word.length(); odd +=2) {
    char temp = word.charAt(odd);
        evenword = oddword + temp;
        }

    return evenword + " " + oddword;
}
    }


