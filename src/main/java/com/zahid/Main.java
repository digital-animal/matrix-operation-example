package com.zahid;

import com.zahid.exception.OrderMismatchException;
import com.zahid.matrix.Matrix;
import static com.zahid.matrix.Matrix.display;;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        // addition, subtraction & multiplication for 5 x 5 matrix
        int[][] a = matrix.random(5, 5);
        int[][] b = matrix.random(5, 5);

        System.out.println("# Matrix A:");
        display(a);
        System.out.println("# Matrix B:");
        display(b);
        System.out.println();

        // as multiplication throws OrderMismatchException
        // multiplication should be surrounded by try..catch
        try {
            System.out.println("# Multiplication: ");
            int[][] mult = matrix.multiply(a, b);
            display(mult);

        } catch (OrderMismatchException e) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("# Addition: ");
        int[][] add = matrix.add(a, b);
        display(add);
        System.out.println();

        System.out.println("# Subtraction: ");
        int[][] sub = matrix.sub(a, b);
        display(sub);
        System.out.println();
        System.out.println();

        // multiplication for 3 x 3 matrix
        System.out.println("# Matrix X:");
        int[][] x = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        }; 
        display(x);
        
        System.out.println("# Matrix Y:");
        int[][] y = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        }; 
        display(y);
        
        try {
            System.out.println("# Multiplication of X & Y:");
            display(matrix.multiply(x, y));
        } catch (OrderMismatchException e) {
            System.out.println(e);
        }
    }

}
