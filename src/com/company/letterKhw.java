package com.company;


public class letterKhw {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        Toppart();
        Bottompart();


    }

    public static void Toppart() {
        char letter = 65;
        for (byte count = SIZE ; count <= SIZE; count--) {
            for (byte count2 = 0; count2 <= count; count2++) {
                System.out.print((char) (letter + count2) + " ");
            }
            System.out.println(" ");
        }
        }
        public static void Bottompart () {
            char letter = 65;
            for (byte count = 0; count <= SIZE; count++) {
                for (byte count2 = 0; count2 <= count; count2++) {
                    System.out.print((char) (letter + count2) + " ");
                }
                System.out.println(" ");
            }
        }
    }

