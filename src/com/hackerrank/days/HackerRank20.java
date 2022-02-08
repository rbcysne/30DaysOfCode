/*
 * My copyright license
 */
package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author rommel
 */
public class HackerRank20 {

//    private static void printArray(String s, int[] x) {
//        System.out.print(s + " Array: ");
//        for (int i : x) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//    public static void bubbleSort(int[] x) {
//
//        int swapNum = 0;
//
//        while ((x.length - 1) > 0) {
//
//            for (int i = 0; i < (x.length - 1); i++) {
//
//                if (x[i] > x[i + 1]) {
//                    int tmp = x[i];
//                    x[i] = x[i + 1];
//                    x[i + 1] = tmp;
//
//                    swapNum++;
//                }
//            }
//        }
//        System.out.println("Array is sorted in " + swapNum + " swaps.");
//        System.out.println("First Element: " + x[0]);
//        System.out.println("Last element: " + x[x.length - 1]);
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int swapNum = 0;

        for(int i = 0; i < a.size(); i++) {

            for (int j = 0; j < (a.size() - 1); j++) {

                if (a.get(j) > a.get(j + 1)) {
                    int tmp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, tmp);

                    swapNum++;
                }
            }
            if (swapNum == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + swapNum + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));

        bufferedReader.close();
    }
}
