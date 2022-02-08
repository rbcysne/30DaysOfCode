/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.days;

import java.util.Scanner;

/**
 *
 * @author rommel
 */
public class HackerRank17 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
class Calculator {
    public int power(int n, int p) throws Exception {
        if(n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        
//        int result = 1;
//        for(int i = 1; i <= p; i++) {
//            result *= n;
//        }
//        return result;
        
        return (int)Math.pow(n, p);
    }
}
