package org.example.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixRotationServiceTest {

    final MatrixRotationService matrixRotationService = new Matrix90degreesClockwiseRotationServiceImpl();

    @ParameterizedTest
    @MethodSource("provideMatrices")
    public <T> void testMatrixRotation(T[][] inputMatrix, T[][] expectedRotatedMatrix) {
        assertArrayEquals(expectedRotatedMatrix, matrixRotationService.rotateMatrix(inputMatrix));
    }

    private static Stream<Object[]> provideMatrices() {
        Integer[][] intMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        Integer[][] intMatrixRotated = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3},
        };

        String[][] stringMatrix = {
                {"a", "b", "c", "d"},
                {"d", "e", "f", "g"},
                {"g", "h", "i", "j"},
        };

        String[][] stringMatrixRotated = {
                {"g", "d", "a"},
                {"h", "e", "b"},
                {"i", "f", "c"},
                {"j", "g", "d"},
        };

        return Stream.of(
                new Object[]{intMatrix, intMatrixRotated},
                new Object[]{stringMatrix, stringMatrixRotated}
        );
    }
}
