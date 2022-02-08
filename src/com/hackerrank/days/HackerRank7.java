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
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Arrays data structure
 *
 * 
 * Task
 * Given an array A of N integers, print 's elements in reverse order as a single line of space-separated numbers.
 * 
 * Example
 * Print 4 3 2 1. Each integer is separated by one space.
 * 
 * @author rommel
 */
public class HackerRank7 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(arr);

        for(int i = 0; i <= arr.size()-1; i++) {
            System.out.print(arr.get(i)+ " ");
        }

        bufferedReader.close();
    }
}
