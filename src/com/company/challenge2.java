package com.company;
/*This is a program that will print a mirror for loops
Bridget Hill
6/5/20
 */
public class challenge2 {
    public static final int SIZE=4; // declaring a global constant


    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Bottom();
        Top();
        Line();


    }

    private static void Bottom() {
        for (int line = 1; line < 4; line++){
            System.out.print("|");
            //this for loop makes the spaces before <>
            for (int space = 1; space <= 1 * line ; space++) {
                System.out.print(" ");
            }
            for (int bslash = 1 ; bslash <= -1 * line +4; bslash++) {
                System.out.print("/");
            System.out.print("\\");
            for (int fslash = 1; fslash <= -1* line+4; fslash++)
            System.out.print("\\");
             {
                System.out.print("*");
            }
            System.out.print("/");
            }
            // this loop makes the spaces after <>
            for(int space=1; space <= 2 * line - 4 + 1 ; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Line() {
        System.out.print("+");
        for (int dash = 0; dash < 5+SIZE; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }


    public static void Top() {
        for (int line = 1; line < 4; line++){
            System.out.print("|");
            //this full loop makes the spaces before <>
            for (int space = 1; space <= -2 * line + 5; space++) {
                System.out.print(" ");
            }
            System.out.print("/ ");
            for (int dot = 1; dot <= 2 * line - 1; dot++) {
                System.out.print("*");
            }
            System.out.print("\\");
            // this loop makes the spaces after <>
            for(int space=1; space <=-2* line+5; space++) {
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
