/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.days;

import java.io.*;

/**
 * Loops
 * 
 * Task
 * Given an integer n print its first  multiples. Each multiple n x i
 * (where 1 <= i <= 10) should be printed on a new line in the form: n x i = result.
 * 
 * Example
 * The printout should look like this:
 * 3 x 1 = 3
 * 3 x 2 = 6
 * 3 x 3 = 9
 * 3 x 4 = 12
 * 3 x 5 = 15
 * 3 x 6 = 18
 * 3 x 7 = 21
 * 3 x 8 = 24
 * 3 x 9 = 27
 * 3 x 10 = 30
 *
 * @author rommel
 */
public class HackerRank5 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        if(n >= 2 && n <= 20) {
            for(int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + n*i);
            }
        }
        bufferedReader.close();
    }
}
