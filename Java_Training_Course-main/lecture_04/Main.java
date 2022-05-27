package lecture_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // sum of 2 arrays
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        // int n2 = scn.nextInt();
        // int[] arr2 = new int[n2];
        // for (int i = 0; i < n2; i++) {
        //     arr2[i] = scn.nextInt();
        // }
        // sumOfArrays(n1, arr1, n2, arr2);
        // diffOfArrays(n1, arr1, n2, arr2);
        // rotateAnArray(arr1, k);
        // binarySearchAlgo(arr1, target);
        // BSLB(arr1, target); // binary search lower bound
        BSUB(arr1, target); // binary search upper bound
    }

    public static void BSUB(int[] arr, int tar) {   // O(logN)
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if ( arr[mid] == tar ) {
                
                if ( mid + 1 < arr.length && arr[mid] == arr[mid + 1] ) {
                    start = mid + 1;
                } else {
                    System.out.println(mid);
                    return;
                }

            } else if (tar > arr[mid]) {
                start = mid + 1;
            } else if (tar < arr[mid]) {
                end = mid - 1;
            }
        }
    }

    public static void BSLB(int[] arr, int tar) {   // O(logN)
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if ( arr[mid] == tar ) {
                
                if ( mid - 1 >= 0 && arr[mid] == arr[mid - 1] ) {
                    end = mid - 1;
                } else {
                    System.out.println(mid);
                    return;
                }

            } else if (tar > arr[mid]) {
                start = mid + 1;
            } else if (tar < arr[mid]) {
                end = mid - 1;
            }
        }
    }

    public static void binarySearchAlgo(int[] arr, int tar) {   // O(logN)
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if ( arr[mid] == tar ) {
                System.out.println(true);
                return;
            } else if (tar > arr[mid]) {
                start = mid + 1;
            } else if (tar < arr[mid]) {
                end = mid - 1;
            }
        }
        System.out.print(false);
    }

    public static void reverse(int[] arr, int start, int end) {
        int s = start, e = end;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }
    public static void rotateAnArray(int[] arr, int k) {
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        // step 1
        reverse(arr, arr.length - k, arr.length - 1);
        // step 2
        reverse(arr, 0, arr.length - k - 1);
        // step 3
        reverse(arr, 0, arr.length - 1);
    }

    public static void diffOfArrays(int n1, int[] arr1, int n2, int[] arr2) {
        int[] diff = new int[ n2 ];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = diff.length - 1;
        int carry = 0;
        while ( k >= 0 ) {
            int d = 0;
            int val = i >= 0 ? arr1[i] : 0;
            if ( arr2[j] + carry >= val ) {
                d = arr2[j] + carry - val;
                carry = 0;
            } else {
                d = arr2[j] + carry + 10 - val;
                carry = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx < diff.length) {
            if ( diff[idx] == 0 ) {
                idx++;
            } else {
                break;
            }
        }
        while (idx < diff.length) {
            System.out.print(diff[idx]);
            idx++;
        }
    }

    public static void sumOfArrays(int n1, int[] arr1, int n2, int[] arr2) {
        int[] sum = new int[ (int)Math.max(n1, n2) ];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;
        int carry = 0;
        while ( k >= 0 ) {
            int curr_sum = carry;
            if ( i >= 0 ) {
                curr_sum = curr_sum + arr1[i];
            }
            if ( j >= 0 ) {
                curr_sum = curr_sum + arr2[j];
            }
            carry = curr_sum / 10;
            curr_sum = curr_sum % 10;
            sum[k] = curr_sum;
            i--;
            j--;
            k--;
        }
        if (carry != 0) {
            System.out.print(carry);
        }
        for (int a = 0; a < sum.length; a++) {
            System.out.print(sum[a]);
        }
    }
}
