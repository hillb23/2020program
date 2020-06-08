package com.company;
/*This is a program that will print a mirror for loops
Bridget Hill
6/5/20
 */
public class classchallengeversion2 {
    public static final int SIZE=4; // declaring a global constant


    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();


    }

    private static void Bottom() {
        for (int line = 1; line < SIZE + 1; line++){
            System.out.print("|");
            //this for loop makes the spaces before <>
            for (int space = 1; space <= 2 * line - SIZE/2; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= -4 * line + 4*SIZE; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            // this loop makes the spaces after <>
            for(int space=1; space <= 2 * line - SIZE/2; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Line() {
        System.out.print("#");
        for (int dash = 0; dash < 4*SIZE; dash++) {
            System.out.print("=");
        }
        System.out.println("#");
    }


    public static void Top() {
        for (int line = 1; line < 5; line++){
            System.out.print("|");
            //this full loop makes the spaces before <>
            for (int space = 1; space <= -2 * line + 8; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= 4 * line - 4; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            // this loop makes the spaces after <>
            for(int space=1; space <=-2* line+8; space++) {
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
