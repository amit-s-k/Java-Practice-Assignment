package com.stackroute.main.java.pe3;
/*
* Write a program to create a ChessBoard pattern with the help of multidimensional array,
* where WWrepresents white color and BB represents Black color.
*      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|

* */
class ChessBoard {
    private static final String WHITE = "WW|";
    private static final String BLACK = "BB|";

    /**
     * prints chess board
     */
    void printChessBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print(WHITE);
                    } else {
                        System.out.print(BLACK);
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print(WHITE);
                    } else {
                        System.out.print(BLACK);
                    }
                }
            }
            System.out.println();
        }
    }
}
