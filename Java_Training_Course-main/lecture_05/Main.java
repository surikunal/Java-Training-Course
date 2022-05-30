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
