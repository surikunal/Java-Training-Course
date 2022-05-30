package lecture_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = scn.nextInt();
        // }
        // int target = scn.nextInt();
        // closestToTarget(arr, target);
        // segrigation01(arr);
        // segrigation012(arr);
        // for (int i = 0; i < arr.length; i++)
        //     System.out.print(arr[i] + ", ");

        // System.out.println(maximumSumSubarray(arr));
        // int[][] arr = {{1, 2, 3, 4, 5, 6},
        //                {7, 8, 9, 10, 11, 12},
        //                {13, 14, 15, 16, 17, 18}};
        // waveTraversal_01(arr);
        // waveTraversal_02(arr);

        // System.out.println("Input row size :");
        // int n = scn.nextInt();
        // System.out.println("Input col size :");
        // int m = scn.nextInt();
        // int[][] arr = new int[n][m];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         arr[i][j] = scn.nextInt();
        //     }
        // }
        // spiralTraversal_01(arr);
        // spiralTraversal_02(arr);


        System.out.println("Input row size of matrix 1 :");
        int n1 = scn.nextInt();
        System.out.println("Input col size of matrix 1:");
        int m1 = scn.nextInt();
        int[][] matrix1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                matrix1[i][j] = scn.nextInt();
            }
        }

        System.out.println("Input row size of matrix 2 :");
        int n2 = scn.nextInt();
        System.out.println("Input col size of matrix 2:");
        int m2 = scn.nextInt();
        int[][] matrix2 = new int[n1][m1];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                matrix2[i][j] = scn.nextInt();
            }
        }
        additionOfMatrix(n1, m1, matrix1, n2, m2, matrix2);
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void additionOfMatrix(int n1, int m1, int[][] mat1, int n2, int m2, int[][] mat2) {
        if (n1 == n2 && m1 == m2) {
            int[][] sum = new int[n1][m1];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    sum[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
            System.out.println();
            display(sum);
        }
        System.out.println("addition is not possible");
    }

    public static void spiralTraversal_02(int[][] arr) {
        int minR = 0;
        int minC = 0;
        int maxR = arr.length - 1;
        int maxC = arr[0].length - 1;
        int count = 0;
        int total = arr.length * arr[0].length;
        while (count < total) {
            for (int r = minR; r <= maxR && count < total; r++) {
                System.out.print(arr[r][minC] + ",");
                count++;
            }
            minC++;
            for (int c = minC; c <= maxC && count < total; c++) {
                System.out.print(arr[maxR][c] + ",");
                count++;
            }
            maxR--;
            for (int r = maxR; r >= minR && count < total; r--) {
                System.out.print(arr[r][maxC] + ",");
                count++;
            }
            maxC--;
            for (int c = maxC; c >= minC && count < total; c--) {
                System.out.print(arr[minR][c] + ",");
                count++;
            }
            minR++;
        }
    }

    public static void spiralTraversal_01(int[][] arr) {
        int minR = 0;
        int minC = 0;
        int maxR = arr.length - 1;
        int maxC = arr[0].length - 1;
        int count = 0;
        int total = arr.length * arr[0].length;
        while (count < total) {
            for (int c = minC; c <= maxC && count < total; c++) {
                System.out.print(arr[minR][c] + ",");
                count++;
            }
            minR++;

            for (int r = minR; r <= maxR && count < total; r++) {
                System.out.print(arr[r][maxC] + ",");
                count++;
            }
            maxC--;

            for (int c = maxC; c >= minC && count < total; c--) {
                System.out.print(arr[maxR][c] + ",");
                count++;
            }
            maxR--;

            for (int r = maxR; r >= minR && count < total; r--) {
                System.out.print(arr[r][minC] + ",");
                count++;
            }
            minC++;
        }
    }

    public static void waveTraversal_02(int[][] arr) {
        for (int col = 0; col < arr.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < arr[0].length; row++) {
                    System.out.print(arr[row][col] + ",");
                }
            } else {
                for (int row = arr[0].length - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + ",");
                }
            }
        }
    }

    public static void waveTraversal_01(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < arr[0].length; col++) {
                    System.out.print(arr[row][col] + ",");
                }
            } else {
                for (int col = arr[0].length - 1; col >= 0; col--) {
                    System.out.print(arr[row][col] + ",");
                }
            }
        }
    }

    public static int maximumSumSubarray(int[] arr) {
        int ans = 0;
        int maxAns = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (ans < 0) {
                ans = arr[i];
            } else {
                ans += arr[i];
            }

            if (ans > maxAns) {
                maxAns = ans;
            }
        }
        return maxAns;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void segrigation012(int[] arr) {
        int ptr1 = 0;
        int ptr2 = arr.length - 1;
        int itr = 0;
        while ( itr <= ptr2 ) {
            if ( arr[itr] == 0 ) {
                swap(arr, itr, ptr1);
                itr++;
                ptr1++;
            } else if ( arr[itr] == 1 ) {
                itr++;
            } else if ( arr[itr] == 2 ) {
                swap(arr, itr, ptr2);
                ptr2--;
            }
        }
    }

    public static void segrigation01(int[] arr) {
        int itr = 0;
        int ptr = 0;
        while ( itr < arr.length ) {
            if ( arr[itr] == 0 ) {
                int temp = arr[itr];
                arr[itr] = arr[ptr];
                arr[ptr] = temp;

                ptr++;
                itr++;
            } else {
                itr++;
            }
        }
    }

    public static void closestToTarget(int[] arr, int tar) {

        if (tar <= arr[0]) {
            System.out.print(arr[0]);
            return;
        }
        if (tar >= arr[arr.length - 1]) {
            System.out.print(arr[arr.length - 1]);
            return;
        }
        int i = 0, j = arr.length - 1, mid = 0;
        while ( i < j ) {
            mid = (i + j) / 2;
            if (arr[mid] == tar) {
                System.out.print(arr[mid]);
                return;
            } else if ( arr[mid] < tar ) {
                if ( tar < arr[mid + 1] ) {
                    System.out.print(check(arr[mid], arr[mid + 1], tar));
                    return;
                }
                i = mid + 1;
            } else if ( arr[mid] > tar ) {
                if (tar > arr[mid - 1]) {
                    System.out.print(check(arr[mid], arr[mid - 1], tar));
                    return;
                }
                j = mid;
            }
        }
    }
    public static int check(int val1, int val2, int tar) {
        if (tar - val1 <= val2 - tar) return val1;
        else return val2;
    }
}
