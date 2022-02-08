/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Recursion
 * 
 * @author rommel
 */
public class HackerRank9 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = HackerRank9.factorial(n);

        System.out.println(result);

        bufferedReader.close();

    }

        /*
         * Complete the 'factorial' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER n as parameter.
         */
        public static int factorial(int n) {
            // Write your code here

              return (n ==1) ? 1 : n * factorial(n - 1);

        }


}
