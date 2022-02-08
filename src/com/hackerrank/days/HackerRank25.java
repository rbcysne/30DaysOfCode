/*
 * My copyright license
 */

package com.hackerrank.days;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
  * Running Time or Time Complexity
  * prime numbers
  * @author rommel
 */

public class HackerRank25 {


    
        static boolean isPrime(int n) {
        
            int d = 0;
            
            int sqrt = (int)Math.sqrt(n);
            
            if((n == 1) || (n > 2 && n % 2 == 0)) {
                return false;
            }
            
            for(int i = 2; i <= sqrt; i++) {
                if(n % i == 0) {
                    return false;
                }
            }
            
            return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        List<String> r = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            int n = scan.nextInt();
            if(isPrime(n)) {
                System.out.println("Prime");
            }else {
                System.out.println("Not prime");
            }
            
        }

        scan.close();
    }
    
    //    static String primeOrNot(int n) {
//        
//            int d = 0;
//            
//            int sqrt = (int)Math.sqrt(n);
//            
//            if((n == 1) || (n > 2 && n % 2 == 0)) {
//                return "Not prime";
//            }
//            
//            for(int i = 2; i <= sqrt; i++) {
//                if(n % i == 0) {
//                    d++;
//                }
//            }
//            
//            if(d == 0) {
//                return "Prime";
//            }else {
//                return "Not prime";
//            }
//    }
    
//        static boolean isPrime(int n) {
//        for(int i=2;i<=Math.sqrt(n);i++) {
//            if(n%i==0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int numOfTests = sc.nextInt();
//        for (int i = 0; i < numOfTests; i++) {
//            int x = sc.nextInt();
//            String s;
//            if (x >= 2 && isPrime(x)) {
//                s = "Prime";
//            } else {
//                s = "Not prime";
//            } 
//            System.out.println(s);
//        }
//    }
}
