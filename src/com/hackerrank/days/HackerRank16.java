/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rommel
 */
public class HackerRank16 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        try{
            int s = Integer.parseInt(S);
            System.out.println(s);
        }catch(RuntimeException e) {
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}
