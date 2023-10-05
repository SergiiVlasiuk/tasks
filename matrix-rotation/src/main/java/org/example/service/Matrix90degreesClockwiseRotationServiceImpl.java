package org.example.service;

public class Matrix90degreesClockwiseRotationServiceImpl<T> implements MatrixRotationService<T> {

    public T[][] rotateMatrix90degreesClockwise(T[][] matrix) {
        final int rows = matrix.length;
        final int cols = matrix[0].length;

        // Create a new matrix to store the rotated values
        final T[][] rotatedMatrix = (T[][]) new Object[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    /**
     *
     * @param matrix - to be rotated
     * @return       - returns 90 deg clockwise rotated matrix
     */
    @Override
    public T[][] rotateMatrix(T[][] matrix) {
        return rotateMatrix90degreesClockwise(matrix);
    }
}
