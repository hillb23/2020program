package com.company;
/*This is a program that will print a mirror for loops
Bridget Hill
6/5/20
 */
public class challenge2 {
    public static final int SIZE=3; // declaring a global constant


    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();


    }

    private static void Bottom() {
        for (int line = 1; line < SIZE + 1; line++){
            System.out.print("|");
            //this for loop makes the spaces before <>
            for (int space = 1; space <= line ; space++) {
                System.out.print(" ");
            }
            for (int bslash = 1 ; bslash <= -1 * line +SIZE; bslash++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int fslash = 1; fslash <= -1* line+SIZE; fslash++) {
            System.out.print("/");
            }
            // this loop makes the spaces after <>
            for(int space=1; space <= line ; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
// this is the method that creates the line
    public static void Line() {
        System.out.print("+");
        for (int dash = 0; dash < 2*SIZE+1; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }


    public static void Top() {
        for (int line = 1; line < SIZE + 1; line++){
            System.out.print("|");
            //this full loop makes the spaces before <>
            for (int space = 1; space <= SIZE + 1 - line; space++) {
                System.out.print(" ");
            }
            for (int fslash = 1; fslash <= line - 1; fslash++) {
                System.out.print("/");
            }
                System.out.print("*");
            for (int bslash = 1; bslash <= line - 1; bslash++) {
                System.out.print("\\");
            }
            // this loop makes the spaces after <>
            for(int space=1; space <= SIZE + 1 - line; space++) {
                System.out.print(" ");
            }
            spaceUp(line);
            System.out.println("|");
        }
    }
    public static void spaceUp (int line) {
        for(int space=1; space <=-2 * line+2*SIZE; space++ ) {
            System.out.print("");
        }
    }
}
