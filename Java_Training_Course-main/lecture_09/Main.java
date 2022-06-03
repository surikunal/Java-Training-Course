import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // String str = scn.nextLine();
        // System.out.println(asciiDiff(str));
        // int n = scn.nextInt();
        // ArrayList<Integer> arr = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        //     arr.add(scn.nextInt());
        // }
        // removeAllPrime(arr);
        // String ans = stringCompression1(str);
        // String ans = stringCompression2(str);
        // int[] arr = { 1, 2, 5, 6, -1, 0 , 10 , 8, 4};
        // greatestOf2Values(arr);
        // greatestOf3Values(arr);
        // System.out.println(ans);
        // int len = 5;
        // int[][] queries = {
        //     {1, 3, 2},
        //     {2, 4, 3},
        //     {0, 2, -2}
        // };
        // rangeSum(len, queries);
        int[] arr = {1, 2, 3, 4};
        productExceptItself(arr);
    }

    public static void productExceptItself(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = arr[i] * left[i - 1];
        }

        int[] right = new int[n];
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = arr[i] * right[i + 1];
        }

        int[] ans = new int[n];
        ans[0] = right[1];
        ans[n - 1] = left[n - 2];
        for (int i = 1; i < n - 1; i++) {
            ans[i] = left[i - 1] * right[i + 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + ", ");
        }
    }

    public static void rangeSum(int len, int[][] queries) {
        int[] ans = new int[len];
        for (int i = 0; i < queries.length; i++) {
            int si = queries[i][0];
            int ei = queries[i][1];
            int val = queries[i][2];

            ans[si] += val;

            if (ei + 1 < len) {
                ans[ei + 1] -= val;
            }
        }

        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += ans[i];
            ans[i] = sum;
        }
    }

    public static void greatestOf3Values(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Not possible!");
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > max1 ) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if ( arr[i] > max2 ) {
                max3 = max2;
                max2 = arr[i];
            } else if ( arr[i] > max3 ) {
                max3 = arr[i];
            }
        }
        System.out.println("Third largest value of array : " + max3);
    }

    public static void greatestOf2Values(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Not possible!");
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > max1 ) {
                max2 = max1;
                max1 = arr[i];
            } else if ( arr[i] > max2 ) {
                max2 = arr[i];
            }
        }
        System.out.println("max1 value : " + max1);
        System.out.println("max2 value : " + max2);
    }

    public static String stringCompression2(String str) {
        String ans = str.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);
            if ( prev == curr ) {
                count++;
            } else {
                if (count > 1) {
                    ans += count;
                    count = 1;
                }
                ans += curr;
            }
        }
        if (count > 1) {
            ans += count;
        }
        return ans;
    }

    public static String stringCompression1(String str) {
        String s = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr != prev) {
                s += curr;
            }
        }
        return s;
    }

    public static void removeAllPrime(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            int val = arr.get(i);
            if (isPrime(val) == true) {
                arr.remove(i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
    public static boolean isPrime(int val) {
        for (int i = 2; i < val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String asciiDiff(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);
            int diff = curr - prev;
            sb.append(diff);
            sb.append(curr);
        }
        return sb.toString();
    }
}