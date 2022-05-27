package lecture_01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // complier going to execute this function 1st
        // System.out.println("this is a statement");
        // System.out.println("Hello World!");

        // primitive data types ================================
        // byte a = 12;
        // System.out.println(a);

        // int b = 12345;
        // System.out.println(b);

        // long c = 12342343423L;
        // System.out.println(c);

        // float d = 2.456F;
        // System.out.println(d);

        // char e = '#';
        // System.out.println(e);

        // boolean f = true;
        // System.out.println(f);


        // non primitive data types ================================
        // String name = "This is a demo statement";
        // System.out.println( name.length() );

        // String name = "Anything";
        // System.out.println(name);

        // String name1 = new String("Anything again");
        // System.out.println(name1);

        // String firstname = "Elonabc";
        // String lastname = "musk";
        // String name = firstname + "and " + lastname + " !";
        // System.out.println(name);

        // System.out.println(name.charAt(0));
        // System.out.println(name.charAt(1));
        // System.out.println(name.charAt(2));
        // System.out.println(name.charAt(3));
        // System.out.println(name.charAt(4));
        // System.out.println(name.charAt(5));
        // System.out.println(name.charAt(6));

        // replace
        // String name1 = "abcabcabc";
        // String name2 = name1.replace('b', 'y');
        // System.out.println(name2);

        // String str = "Elon and Musk with Tesla";
        // System.out.println( str.substring(6, 12) );       
        // System.out.println( str.substring(0, 5) );
        
        // Arrays ===================================
        // int[] arr = new int[5];
        // arr[0] = 3;
        // arr[1] = 2;
        // arr[2] = 5;
        // arr[3] = 0;
        // arr[4] = -1;
        // System.out.println(arr.length);
        
        // System.out.println( arr[0] );
        // Arrays.sort(arr);
        // System.out.println( arr[0] );

        // System.out.println(arr[0]);    // [I@4617c264
        // System.out.println(arr[1]);    // [I@4617c264
        // System.out.println(arr[2]);    // [I@4617c264
        // System.out.println(arr[3]);    // [I@4617c264
        // System.out.println(arr[4]);    // [I@4617c264
        // // address of array

        // boolean[] arr1 = new boolean[3];
        // arr1[0] = true;

        // int[] arr = {2, 3, 5, -1, 0};   // 1d array
        // System.out.println(arr[0]);

        // // 2d array
        // int[][] arr2 = {{1, 2, 3},
        //                 {4, 5, 6},
        //                 {7, 8, 9}};
        
        // System.out.println( arr2[1][2] );

        // double p = 100.00;
        // double a = p + 10;
        // System.out.println(a);

        // int i = 100;
        // int x = i + (int)10.99;
        // System.out.println(x);

        // int a = 10;
        // a = 11;
        // a = 12;

        // final int b = 10;

        // operators =========================

        // int a = 1;
        // int b = 2;
        // int sum = a + b;
        // int sub = a - b;
        // int mult = a * b;
        // int div = a / b;
        // int mod = a % b;

        // increment and decrement operator
        // int i = 4;
        // i = i + 1;
        // i++; // incremenet operator
        // i--; // decrement operator

        // int x = 1;
        // System.out.println(--x);
        // System.out.println(x--);
        // System.out.println(x++);
        // System.out.println(++x);

        // boolean x = false;
        // if ( x == true ) {
        //     System.out.println("Hi");
        // } else {
        //     System.out.println("hello");
        // }

        // Scanner scn = new Scanner(System.in);
        // System.out.println("Give back an integer value : ");
        // int i = scn.nextInt();

        // System.out.println("Give Back an String value : ");
        // String s = scn.nextLine();

        // System.out.println("Integer Value is " + i + " and String value is " + s);

        // int a = 60, b = 40;
        // boolean c = false;
        // if ( a < 50 || b < 50 ) {
        //     System.out.println("First");
        // } else {
        //     System.out.println("Second");
        // }
        // if ( !c ) {
        //     System.out.println("Hi1");
        // } else {
        //     System.out.println("Hi2");
        // }

        Scanner scn = new Scanner(System.in);
        System.out.println("Input the age of person : ");
        int age = scn.nextInt();
        if ( age >= 18 ) {   // 18 as adult also
            System.out.println("He/she is an adult");
        } else {
            System.out.println("He/she is not an adult");
        }
    }
}













