/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questiontwo;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Allow user to select / enter console type
        System.out.println("===== ELECTRONICS STORE CONSOLE SALES =====");
        System.out.println("Select a console device type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. NINTENDO SWITCH");
        System.out.println("4. Other");
        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();
        input.nextLine(); // clear the buffer

        String consoleType;

        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "NINTENDO SWITCH";
                break;
            case 4:
                System.out.print("Enter console type: ");
                consoleType = input.nextLine();
                break;
            default:
                consoleType = "Unknown";
                System.out.println("Invalid choice. Defaulting to Unknown.");
        }

        // Enter store name
        System.out.print("Enter store name: ");
        String storeName = input.nextLine();

        // Enter total sales amount
        System.out.print("Enter total amount of sales: ");
        int totalSales = input.nextInt();

        // Create object of ConsoleSales
        ConsoleSales sales = new ConsoleSales(consoleType, storeName, totalSales);

        // Display the report
        System.out.println();
        sales.printReport();

        input.close();
    }
}
