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
public class HackerRank12 {

    class Person {

        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                    + "\nID: " + idNumber);
        }

    }

    static class Student extends Person {

        private int[] testScores;

        /*	
        *   Class Constructor
        *   
        *   @param firstName - A string denoting the Person's first name.
        *   @param lastName - A string denoting the Person's last name.
        *   @param id - An integer denoting the Person's ID number.
        *   @param scores - An array of integers denoting the Person's test scores.
        */
        Student(String firstName, String lastName, int identification, int[] testScores) {
            super(firstName, lastName, identification);
            this.testScores = testScores;
        }
        /*	
        *   Method Name: alculate
        *   @return A character denoting the grade.
        */
        public String calculate() {
            
            int avScore = 0;
            int sumScores = 0;
            String grade = "";
            
            for(int i = 0; i < this.testScores.length; i++) {
                sumScores += this.testScores[i];
            }
            
            avScore = sumScores / this.testScores.length;
            if(avScore >= 90 && avScore <= 100) {
                grade = "O";
            }else if(avScore >= 80 && avScore < 90) {
                grade = "E";
            }else if(avScore >= 70 && avScore < 80) {
                grade = "A";
            }else if(avScore >= 55 && avScore < 70) {
                grade = "P";
            }else if(avScore >= 40 && avScore < 55) {
                grade = "D";
            }else if(avScore < 40) {
                grade = "T";
            }
            
            return grade;
        }
    }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstName = scan.next();
            String lastName = scan.next();
            int id = scan.nextInt();
            int numScores = scan.nextInt();
            int[] testScores = new int[numScores];
            for (int i = 0; i < numScores; i++) {
                testScores[i] = scan.nextInt();
            }
            scan.close();

            Student s = new Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate());
        }

}
    