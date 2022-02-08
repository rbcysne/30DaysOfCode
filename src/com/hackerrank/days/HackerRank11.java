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
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author rommel
 */
public class HackerRank11 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList())
                );

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int maxSum = 0;
        
        for(int r = 0; r < 4; r++) {
            for(int c = 0; c < 4; c++) {
                int tmpSum = 0;
                
                tmpSum = arr.get(r).get(c) + 
                         arr.get(r).get(c+1) +
                         arr.get(r).get(c+2) +
                         arr.get(r+1).get(c+1) +
                         arr.get(r+2).get(c) +
                         arr.get(r+2).get(c+1) +
                         arr.get(r+2).get(c+2);
                
                if((tmpSum > maxSum) || (r == 0 && c == 0)) {
                    maxSum = tmpSum;
                }
            }
        }
 
        System.out.println(maxSum);
        bufferedReader.close();
    }
}
