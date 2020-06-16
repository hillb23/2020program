package com.company;

import java.util.Scanner;
//find first word indexOf (sub 0 to #)
//for > length (don't repeat letters)
// Peter and his friends

public class sixeleven {

    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Say something!");
        String phrase = screen.nextLine();
        int indexOf = phrase.indexOf(" ");
        String firstword = phrase.substring(0, indexOf+1);// "Peter "
        // phrase = phrase - firstword
        char letter;
        int count = 0;
        for (int index = 0; index < firstword.length(); index++) {
            letter = firstword.charAt(index);
            if (letter != ' ') {
                count++;
                String temp = firstword.substring(index + 1);
                indexOf = temp.indexOf(letter);
                while (indexOf >= 0) {
                    count++;
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(letter);
                }
                // find the rest of the letter of your message maybe use a method??

                //  replace the letter you just finished in the firstword with a ' '

                System.out.println(letter + " " + count);
                count = 0;
            }
        }
    }



    }

