/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rommel
 */
public class HackerRank10 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int remainder;
        List<Integer> bin = new ArrayList<Integer>();
        int maxCount = 0;
        int currentCount = 0;
        while(n > 0) {
            remainder = n%2;
            n = n/2;
            bin.add(remainder);
            if(remainder == 1) {
                currentCount += 1;
                if(currentCount > maxCount) {
                    maxCount = currentCount;
                }
            }else {
                if(currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentCount = 0;
            }
        }
                
        System.out.println(maxCount);
        bufferedReader.close();
    }
}
