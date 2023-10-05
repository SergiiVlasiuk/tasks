package org.example.service;

public interface MatrixRotationService<T> {

    /**
     * method to rotate the matrix, method is not null safe, so before calling you must be sure that passed parameter
     * is correct
     *
     * @param matrix - to be rotated
     * @return       - the rotated result
     */
    T[][] rotateMatrix(T[][] matrix);
}
