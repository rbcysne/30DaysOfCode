/*
 * My copyright license
 */
package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * Task
 * Given set S={1,2,3,...,N}. Find two integers, A and B (where A<B), from set S
 * such that the value of A&B is the maximum possible and also less than a given
 * integer, K. In this case, & represents the bitwise AND operator.
 * 
 * Function Description
 * Complete the bitwiseAnd function in the editor below.
 * 
 * bitwiseAnd has the following paramter(s):
 * - int N: the maximum integer to consider
 * - int K: the limit of the result, inclusive
 * 
 * Returns
 * - int: the maximum value of A&B within the limit.
 * 
 * Input Format
 * The first line contains an integer, T, the number of test cases.
 * Each of the T subsequent lines defines a test case as 2 space-separated 
 * integers, N and K, respectively.
 *
 * @author rommel
 */
public class HackerRank29 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = ResultDay29.bitwiseAnd(count, lim);
//                bufferedWriter.write(String.valueOf(res));
//                bufferedWriter.newLine();
                System.out.println(res);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
//        bufferedWriter.close();
    }
}

class ResultDay29 {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
    // Write your code here
        int maxValue = Integer.MIN_VALUE;
        for(int i = 1; i < N; i++) {
            for(int j = i + 1; j <= N; j++) {
                if( ( maxValue < (i&j) ) && ( (i&j) < K ) ) {
                    maxValue = i&j;
                }
            }
        }
        
        return maxValue;
    }

}
