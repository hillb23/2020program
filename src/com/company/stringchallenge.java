//Bridget Hill
//create scanner
//create all variables
//T, word
// do
//ask user for T
// while (T>=2 || T<=10)
// for loop (controlled by T)
//do
//  ask user for word
//while(word.length()>=2 || word.length()<=10000
//String dividedWord = call the return method
//System.out.println(dividedWord)
//end of main
//public static string ____ (String wordSent)
// {
// logic to divide charAt()
// }
// S of length N
//indexed between



package com.company;
import java.util.Scanner;
public class stringchallenge {
    public static void main(String[] args) {
        //import scanner
        Scanner input = new Scanner(System.in);
        String inputWord;
        int runTimes;
        //ask for amount of words and initialize it, let user enter using the scanner
        do { //covers the restraints on how many times it can run so that the words can be entered
            System.out.print("How many words are you going to enter?  It must be between 1 and 10. ");
           runTimes = input.nextInt(); //prompt for words
        } while (runTimes <1 || runTimes > 10); //this is saying that no less than 2 words can be run but no more than 10 words can be run

        for (int i = 0; i < runTimes; i++) { //this for loop, do, and while: runs how many words you plan on inputting and repeats the sequence of asking you a word
           do {
               System.out.println("Enter your word:");
               inputWord = input.next();
           } while (inputWord.length() <2 && inputWord.length() >=10000);
                //check length of s is 2< and >=10000
                String dividedWord = divideWord(inputWord);
                System.out.println(dividedWord);
            }
        }


    public static String divideWord(String inputWord) { //calling return method
        String evenWord = "";
        String oddWord = "";

        for (int even = 0; even < inputWord.length(); even += 2) { //this for loop is for calculating which letters are even and then grouping them together to form one even lettered word
            char temp = inputWord.charAt(even);
            evenWord = evenWord + temp;
        }
        for (int odd = 1; odd < inputWord.length(); odd += 2) { //this for loop is for calculating which letters are odd and then grouping them together to form one odd lettered word
            char temp = inputWord.charAt(odd);
            oddWord = oddWord + temp;
        }
        return (evenWord + "  " + oddWord); //prints the even and odd letters together in words with a space between
        //example: soup su op
    }
}