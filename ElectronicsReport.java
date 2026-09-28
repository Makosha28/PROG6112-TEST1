/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programming1btest;

/**
 *
 * @author Student
 */
public class ElectronicsReport {

    public static void main(String[] args) {
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

    
        int[][] sales = {
            {1000, 2000, 3000},  // Cape Town
            {2000, 3000, 4000},  // Port Elizabeth
            {1500, 1100, 1200}   // Pretoria
        };

        // Console names (for display)
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Print header
        System.out.println("---------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-20s%10s%10s%10s%n", "", "PS5", "XBOX", "SWITCH");
        System.out.println("---------------------------------------------------------------");

        // Display the sales data for each city
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%10d%10d%10d%n",
                    cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------------------");

        // Calculate and display total sales for each city
        int[] cityTotals = new int[cities.length];
        int maxTotal = 0;
        int maxIndex = 0;

        for (int i = 0; i < cities.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            cityTotals[i] = total;

            System.out.printf("%-20s : %d%n", cities[i], total);


            if (total > maxTotal) {
                maxTotal = total;
                maxIndex = i;
            }
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST GAMING CONSOLE SALES");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%s with a total of %d sales%n", cities[maxIndex], maxTotal);
        System.out.println("---------------------------------------------------------------");
    }
}
