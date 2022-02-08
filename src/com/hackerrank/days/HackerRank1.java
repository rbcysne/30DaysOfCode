/*
 * Copyright (C) 2021 rommel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.hackerrank.days;

import java.io.*;
import java.util.*;

/**
 * Data types
 * 
 * Task
 * Complete the code in the editor below. The variables i, d, and s are already 
 * declared and initialized for you. You must:
 * Declare 3 variables: one of type int, one of type double, and one of type String.
 * Read 3 lines of input from stdin (according to the sequence given in the 
 * Input Format section below) and initialize your  variables.
 * Use the + operator to perform the following operations:
 * Print the sum of i plus your int variable on a new line.
 * Print the sum of d plus your double variable to a scale of one decimal place 
 * on a new line.
 * Concatenate s with the string you read as input and print the result on a new line.
 * 
 * Input Format
 * The first line contains an integer that you must sum with i.
 * The second line contains a double that you must sum with d.
 * The third line contains a string that you must concatenate with s.
 * 
 * 
 * @author rommel
 */
public class HackerRank1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(new BufferedInputStream(System.in));

        /* Declare second integer, double, and String variables. */
        int a = 0;
        double b = 0.0;
        String st = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
                a = scan.nextInt();
            
                b = scan.nextDouble();
            
            scan.nextLine();
            st = scan.nextLine();
            
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + a);
        /* Print the sum of the double variables on a new line. */
	System.out.println(d + b);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + st);
        

        scan.close();
    }
}