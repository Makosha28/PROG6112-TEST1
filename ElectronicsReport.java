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
         String[]cities = {"CapeTown","Port Elizabeth","Pretoria"};
        int[][] sales={{1000,2000,3000},//Capetown
                      {2000,3000,4000},//Port Elizabeth
                      {1500,4000,1200}//Pretoria
                      
        String[] consoles ={"PS5","XBOX","SWITCH"};
        System.out.println("---------------------------------------------------------------"); 
        System.out.println("GAMING CONSOLE REPORT"); 
        System.out.println("---------------------------------------------------------------"); 
        System.out.printf("%-20s%10s%10s%10s%n", "", "PS5", "XBOX", "SWITCH"); 

 for (int i = 0; i < cities.length; i++) { 

     System.out.printf("%-20s%10d%10d%10d%n", cities[i], sales[i][0], sales[i][1], sales[i][2]); 

} 

 

System.out.println("---------------------------------------------------------------"); 
System.out.println("CONSOLE SALES TOTALS FOR EACH CITY"); 
System.out.println("---------------------------------------------------------------"); 


int[] cityTotals; 
        cityTotals = new int[cities.length];

int maxTotal = 0; 
int maxIndex = 0; 

 

 for (int i = 0; i < cities.length; i++) { 
int total = 0; 
 for (int j = 0; j < sales[i].length; j++) { 
total += sales[i][j]; 
} 
 cityTotals[i] = total; 
System.out.printf("%-20s : %d%n", cities[i], total); 

 
 // Track the city with the highest sales 

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

