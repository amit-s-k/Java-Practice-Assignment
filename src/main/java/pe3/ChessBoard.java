package main.java.pe3;

class ChessBoard {
    private static final String WHITE = "WW|";
    private static final String BLACK = "BB|";

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
