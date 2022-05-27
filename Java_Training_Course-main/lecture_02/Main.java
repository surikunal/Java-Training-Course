package lecture_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // largest of 3 numbers
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Input 3 numbers");
        // int a = scn.nextInt();
        // int b = scn.nextInt();
        // int c = scn.nextInt();

        // if ( a > b && a > c ) {
        // System.out.println(a + " is the largest number!");
        // } else if ( b > a && b > c ) {
        // System.out.println(b + " is the largest number!");
        // } else if ( c > a && c > b ) {
        // System.out.println(c + " is the largest number!");
        // }

        // program to calculate age
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Input birth date in Days, months and year");
        // int birthDay = scn.nextInt();
        // int birthMonth = scn.nextInt();
        // int birthYear = scn.nextInt();

        // System.out.println("Input Current date in Days, months and year");
        // int currentDay = scn.nextInt();
        // int currentMonth = scn.nextInt();
        // int currentYear = scn.nextInt();

        // if ( currentDay < birthDay ) {
        // currentDay = currentDay + 30;
        // currentMonth = currentMonth - 1;
        // }

        // if ( currentMonth < birthMonth ) {
        // currentMonth = currentMonth + 12;
        // currentYear = currentYear - 1;
        // }

        // int days = currentDay - birthDay;
        // int months = currentMonth - birthMonth;
        // int years = currentYear - birthYear;

        // reverse of a 3 digit number
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();

        // int ans = 0, rev = 1;
        // while ( n != 0 ) {
        // int rem = n % 10;
        // n = n / 10;
        // ans = ans * 10 + rem;
        // }
        // System.out.println(ans);

        // program to check for palindrome ================================
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Input a number to check for palindrome");
        // int n = scn.nextInt();

        // int a = n / 100;
        // int b = n % 100;
        // int c = b / 10;
        // int d = b % 10;

        // int rev = d * 100 + c * 10 + a;
        // if (rev == n) {
        // System.out.println("Yes, Its a palindrome");
        // } else {
        // System.out.println("No, it is not a palindrome");
        // }

        // int day = 3;
        // switch (day) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // }

        // pattern 1
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Input number of rows");
        // int n = scn.nextInt();

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*\t");
        // }
        // System.out.println();
        // }

        // pattern 2
        // int nsp = n - 1;
        // int nst = 1;
        // for ( int i = 1; i <= n; i++ ) {
        // for (int j = 1; j <= nsp; j++) {
        // System.out.print("\t");
        // }
        // for (int j = 1; j <= nst; j++) {
        // System.out.print("*\t");
        // }
        // nsp--;
        // nst++;
        // System.out.println();
        // }

        // int nsp = 0;
        // int nst = n;
        // for ( int i = 1; i <= n; i++ ) {
        // for (int j = 1; j <= nsp; j++) {
        // System.out.print("\t");
        // }
        // for (int j = 1; j <= nst; j++) {
        // System.out.print("*\t");
        // }
        // nsp++;
        // nst--;
        // System.out.println();
        // }

        // int nsp = n / 2;
        // int nst = 1;
        // for ( int i = 1; i <= n; i++ ) {
        // for (int j = 1; j <= nsp; j++) {
        // System.out.print("\t");
        // }
        // for (int j = 1; j <= nst; j++) {
        // System.out.print("*\t");
        // }

        // if ( i <= n / 2 ) { // upper half
        // nsp = nsp - 1;
        // nst = nst + 2;
        // } else { // lower half
        // nsp = nsp + 1;
        // nst = nst - 2;
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i == j) {
        // System.out.print("*\t");
        // } else {
        // System.out.print("\t");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i + j == n - 1) {
        // System.out.print("*\t");
        // } else {
        // System.out.print("\t");
        // }
        // }
        // System.out.println();
        // }

        // int val = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(val + "\t");
        // val++;
        // }
        // System.out.println();
        // }

        // for (int i = 1; i * i <= n; i++) {
        // System.out.print(i * i);
        // }

    }
}
