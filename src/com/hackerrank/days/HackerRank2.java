/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.days;


    import java.io.*;

/**
 * Operators
 * 
 * Task
 * Given the meal price (base cost of a meal), tip percent (the percentage of 
 * the meal price being added as tip), and tax percent (the percentage of the 
 * meal price being added as tax) for a meal, find and print the meal's total 
 * cost. Round the result to the nearest integer.
 * 
 * Input Format
 * 
 * There are 3 lines of numeric input:
 * The first line has a double, mealCost (the cost of the meal before tax and tip).
 * The second line has an integer, tipPercent (the percentage of mealCost being added as tip).
 * The third line has an integer, taxPercent (the percentage of mealCost being added as tax).
 * 
 * 
 * @author rommel
 */
public class HackerRank2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
    
}


class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
    
        //alternativamente, multiplica o valor int por 1.0
        //(tip_percent * 1.0) e (tax_percent * 1.0)
        double tip = (Double.valueOf(tip_percent) / 100) * meal_cost;
        double tax = (Double.valueOf(tax_percent) / 100) * meal_cost;
        
        long cost = Math.round(meal_cost + tip + tax);
        
        System.out.println(cost);

    }

}