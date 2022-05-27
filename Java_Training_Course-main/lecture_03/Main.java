package lecture_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.print("Input a number :");
        // int n = scn.nextInt();
        // // fibonacci series
        // int a = 0, b = 1;
        // for ( int i = 0; i < n; i++ ) {
        //     System.out.print(a + " ");
        //     int c = a + b;
        //     a = b;
        //     b = c;
        // }

        // int old_idx = 1;
        // int inverse = 0;
        // while ( n != 0 ) {
        //     int old_val = n % 10;

        //     int new_idx = old_val;
        //     int new_val = old_idx;

        //     inverse = inverse + new_val * (int)Math.pow(10, new_idx - 1);

        //     n = n / 10;
        //     old_idx++;
        // }
        // System.out.println(inverse);

        // rotate the number
        // Scanner scn = new Scanner(System.in);
        // System.out.print("Input a number to rotate :");
        // int n = scn.nextInt();
        // System.out.print("Input a number K :");
        // int k = scn.nextInt();

        // // to calculate the length of n
        // int temp = n;
        // int len = 0;
        // while ( temp != 0 ) {
        //     temp = temp / 10;
        //     len++;
        // }
        // k = k % len;
        // if (k < 0) {
        //     k = k + len;
        // }
        // // main logic
        // int mult = 1, div = 1;
        // for (int i = 1; i <= len; i++) {
        //     if (i <= k) {
        //         div = div * 10;
        //     } else {
        //         mult = mult * 10;
        //     }
        // }
        // // System.out.println("mult " + mult + " and div " + div);
        // int q = n / div;
        // int r = n % div;
        // int ans = r * mult + q;
        // System.out.println(ans);

        // functions
        // fun1();
        // fun2(23);
        // fun3(23, "Kunal", 3.34);

        // int a = func1();
        // int b = func2(34);
        // int c = func3(235, false, "Hello");

        // span of an array
        // int[] arr = {2, 3, 1, 5, 8, -2, 0, 6};
        // int ans = spanOfArray(arr);
        // System.out.println(ans);
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // int target = scn.nextInt();
        // int ans = findTarget(arr, target);
        // System.out.println(ans);

        barChart(arr);
    }

    public static void barChart(int[] arr) {
        int maxi = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        // main logic
        for (int max = maxi; max >= 1; max--) {
            for (int i = 0; i < arr.length; i++) {
                if ( arr[i] >= max ) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static int findTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == target ) {
                return i;
            }
        }
        return -1;
    }

    public static int spanOfArray(int[] arr) {
        int n = arr.length;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for ( int i = 0; i < n; i++ ) {
            if ( mini > arr[i] ) {
                mini = arr[i];
            }
            if ( maxi < arr[i] ) {
                maxi = arr[i];
            }
        }
        int span = maxi - mini;
        // System.out.println(span);
        return span;
    }

    public static int func1() {
        // statements
        return 0;
    }
    public static int func2(int a) {
        // statements
        return a;
    }
    public static int func3(int a, boolean b, String s) {
        // statements
        return 0;
    }

    public static void fun1() {

    }
    public static void fun2(int i) {

    }
    public static void fun3(int i, String s, double d) {

    }
}