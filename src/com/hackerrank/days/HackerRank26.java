/*
 * My copyright license
 */
package com.hackerrank.days;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Nested Logic
 * @author rommel
 */
public class HackerRank26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rDay = sc.nextInt();
        int rMonth = sc.nextInt();
        int rYear = sc.nextInt();
        
        int dDay = sc.nextInt();
        int dMonth = sc.nextInt();
        int dYear = sc.nextInt();
        
        int fine = 0;

        
        if(rYear == dYear && rMonth == dMonth) {
            if(rDay > dDay) {
                fine = (rDay - dDay) * 15;
            }
        }else if(rYear == dYear && rMonth > dMonth) {
            fine = (rMonth - dMonth) * 500;
        }else if(rYear > dYear) {
            fine = 10000;
        }
        
        System.out.println(fine);
        sc.close();
    }
}
