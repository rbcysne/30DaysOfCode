/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.days;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Scanner;

/**
 * Strings + Loops
 *
 * Task Given a string S of length N that is indexed from 0 to N-1 print its
 * even-indexed and odd-indexed characters as 2 space-separated strings on a
 * single line (see the Sample below for more detail). Note: 0 is considered to
 * be an even index.
 *
 * Example Print abc def
 *
 * @author rommel
 */
public class HackerRank6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        if (t >= 1 && t <= 10) {

            for (int i = 0; i < t; i++) {
                String a = scan.next();

                StringBuilder evenSb = new StringBuilder();
                StringBuilder oddSb = new StringBuilder();

                evenSb.append(a.charAt(0));

                for (int j = 1; j < a.length(); j++) {

                    if (j % 2 != 0) {
                        oddSb.append(a.charAt(j));
                    } else {
                        evenSb.append(a.charAt(j));
                    }
                }

            /*
                // Another solution using iterator (CharacterIterator)
                CharacterIterator iterator = new StringCharacterIterator(a);

                evenSb.append(iterator.current());
                iterator.next();

                while (iterator.current() != CharacterIterator.DONE) {
                    if ((iterator.getIndex()) % 2 != 0) {
                        oddSb.append(iterator.current());
                    } else {
                        evenSb.append(iterator.current());
                    }

                    iterator.next();
                }
            */
            
            
                System.out.println(evenSb + " " + oddSb);
            }

            scan.close();
        }
    }
}
