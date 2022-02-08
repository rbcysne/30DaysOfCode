/*
 * My copyright license
 */

package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.*;

/**
 * Regular expressions
 * 
 * Task
 * Consider a database table, Emails, which has the attributes First Name and 
 * Email ID. 
 * Given N rows of data simulating the Emails table, print an alphabetically-
 * ordered list of people whose email address ends in @gmail.com.
 * 
 * Input Format
 * The first line contains an integer, N, total number of rows in the table.
 * Each of the N subsequent lines contains 2 space-separated strings denoting a 
 * person's first name and email ID, respectively.
 * 
 * Sample Input
 * 6
 * riya riya@gmail.com
 * julia julia@julia.me
 * julia sjulia@gmail.com
 * julia julia@gmail.com
 * samantha samantha@gmail.com
 * tanya tanya@gmail.com
 * 
 * Sample Output
 * julia
 * julia
 * riya
 * samantha
 * tanya
 * 
 * @author rommel
 */

public class HackerRank28 {

     public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> listOfNames = new ArrayList<String>();
        
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                Pattern p = Pattern.compile("[a-z](@gmail.com)$");
                Matcher m = p.matcher(emailID);
                if(m.find()) {
                    listOfNames.add(firstName);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        Collections.sort(listOfNames);
        
        for(String name : listOfNames) {
            System.out.println(name);
        }
//        for(int i = 0; i < listOfNames.size(); i++) {
//            System.out.println("lista: " + listOfNames.get(i));
//        }
        
        bufferedReader.close();
    }
}
