/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.days;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Dictionaries and Maps
 * 
 * @author rommel
 */
public class HackerRank8 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map<String, Integer> book = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            book.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();

            if(book.containsKey(s)) {
                System.out.println(s + "=" + book.get(s));
            }else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
