package main.java.pe3;

class AdditionOfMatrices {
    int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix, int numberOfRows, int numberOfColoumns) {
        if (firstMatrix == null || secondMatrix == null || numberOfColoumns == 0 || numberOfRows == 0) {
            return null;
        }
        int[][] result = new int[numberOfRows][numberOfColoumns];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColoumns; j++) {
                result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return result;
    }
}
