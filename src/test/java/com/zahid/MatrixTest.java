package com.zahid;

import com.zahid.exception.OrderMismatchException;
import com.zahid.matrix.Matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;;

public class MatrixTest {
    public Matrix matrix = null;

    @BeforeEach
    void init() {
        matrix = new Matrix();
    }

    @Test
    @DisplayName("Testing additon of two matrix")
    void testAddition() {
        int[][] matA = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        }; 

        int[][] matB = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        }; 

        int[][] expected = {
            {4, 10, 4},
            {6, 9, 12},
            {14, 8, 14}
        };

        int[][] actual = matrix.add(matA, matB);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing subtraction of two matrix")
    void testSubtraction() {
        int[][] matA = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        }; 

        int[][] matB = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        }; 

        int[][] expected = {
            {4, 8, 0},
            {0, 1, 2},
            {2, -6, -2}
        };

        int[][] actual = matrix.sub(matA, matB);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing multiplication of two matrix")
    void testMultiplication() throws OrderMismatchException {
        int[][] matA = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        }; 

        int[][] matB = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        }; 

        int[][] expected = {
            {39, 54, 69},
            {57, 72, 87},
            {39, 54, 69}
        };

        int[][] actual = matrix.multiply(matA, matB);

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing 'OrderMismatchException' of two matrix multiplication")
    void testMultiplicationException() throws OrderMismatchException {
        int[][] matA = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        }; 

        int[][] matB = {
            {0, 1, 2},
            {3, 4, 5},
        }; 
        assertThrows(OrderMismatchException.class, () -> matrix.multiply(matA, matB));
    }
}
