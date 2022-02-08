/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.days;

import java.util.Scanner;

/**
 * Class vs. Instance
 * 
 * Task
 * Write a Person class with an instance variable, age, and a constructor that 
 * takes an integer, initialAge, as a parameter. The constructor must assign 
 * initialAge to age after confirming the argument passed as initialAge is not 
 * negative; if a negative argument is passed as initialAge, the constructor 
 * should set 0 to age and print Age is not valid, setting age to 0.. In addition, 
 * you must write the following instance methods:
 * 
 * yearPasses() should increase the age instance variable by 1.
 * amIOld() should perform the following conditional actions:
 * If age<13, print You are young..
 * If age>=13 and age<18, print You are a teenager..
 * Otherwise, print You are old..
 * 
 * To help you learn by example and complete this challenge, much of the code is 
 * provided for you, but you'll be writing everything in the future. The code 
 * that creates each instance of your Person class is in the main method. 
 * Don't worry if you don't understand it all quite yet!
 * Note: Do not remove or alter the stub code in the editor.
 * 
 * Input Format
 * Input is handled for you by the stub code in the editor.
 * 
 * The first line contains an integer, T(the number of test cases), and the T 
 * subsequent lines each contain an integer denoting the age of a Person instance
 * 
 * @author rommel
 */
public class HackerRank4 {

    private int age;

    public HackerRank4(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String statement = "";

        if (this.age < 13) {
            statement = "You are young.";
        } else if (this.age >= 13 && this.age < 18) {
            statement = "You are a teenager.";
        } else {
            statement = "You are old.";
        }
        System.out.println(statement);
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            HackerRank4 p = new HackerRank4(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
