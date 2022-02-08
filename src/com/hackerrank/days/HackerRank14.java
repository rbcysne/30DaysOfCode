/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.days;

import java.util.Scanner;

/**
 *
 * @author rommel
 */
public class HackerRank14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.println(difference.maximumDifference);
    }
}

class Difference {

    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }
    
    public int computeDifference() {
        maximumDifference = 0;
        for(int i = 0; i < (this.elements.length - 1); i++) {
            for(int j = 0; j < this.elements.length; j++) {
                int difference = this.elements[i] - this.elements[j];
                if( Math.abs(difference) > maximumDifference ) {
                    maximumDifference = Math.abs(difference);
                }
            }
            
        }
        return maximumDifference;
    }
}
