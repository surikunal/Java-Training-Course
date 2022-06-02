package lecture_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n1 = scn.nextInt();
        // int m1 = scn.nextInt();
        // int[][] mat1 = new int[n1][m1];
        // for (int i = 0; i < n1; i++) {
        //     for (int j = 0; j < m1; j++) {
        //         mat1[i][j] = scn.nextInt();
        //     }
        // }
        // int n2 = scn.nextInt();
        // int m2 = scn.nextInt();
        // int[][] mat2 = new int[n2][m2];
        // for (int i = 0; i < n2; i++) {
        //     for (int j = 0; j < m2; j++) {
        //         mat2[i][j] = scn.nextInt();
        //     }
        // }
        // multiplication of 2 matrices
        // multiply2DMatrix(n1, m1, mat1, n2, m2, mat2);
        // int[][] arr = {
        //     {1, 2, 3, 4, 5},
        //     {6, 7, 8, 9, 10},
        //     {11, 12, 13, 14, 15},
        //     {16, 17, 18, 19, 20},
        //     {21, 22, 23, 24, 25}
        // };
        // diagonalTraversal(arr);
        // transpose(arr);
        // display(arr);
        // System.out.println();
        // rotate90(arr);
        // display(arr);
    }

    public static void rotate90(int[][] arr) {
        
        // take transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reverse the coloumn
        for (int i = 0; i < arr.length; i++) {
            int si = 0;
            int ei = arr[0].length - 1;
            while ( si < ei ) {
                int temp = arr[i][si];
                arr[i][si] = arr[i][ei];
                arr[i][ei] = temp;
                si++;
                ei--;
            }
        }
    }

    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
        display(arr);
    }

    public static void diagonalTraversal(int[][] arr) {
        for (int g = 0; g < arr.length; g++) {
            for (int i = 0, j = g; j < arr.length; i++, j++) {
                System.out.print(arr[i][j] + ",");
            }
        }
    }

    public static void multiply2DMatrix(int n1, int m1, int[][] mat1, int n2, int m2, int[][] mat2) {
        if (m1 == n2) {
            int[][] ans = new int[n1][m2];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    for (int k = 0; k < m1; k++) {
                        ans[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            display(ans);
        } else {
            System.out.println("Matrix cannot be multiplied");
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
