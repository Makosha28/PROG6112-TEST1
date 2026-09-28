/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questiontwo;

/**
 *
 * @author Student
 */
public abstract class ConsolesSales implements Consoles {

    // Instance variables
    private String consoleType;
    private String storeName;
    private int totalSales;

    // Constructor
    public ConsolesSales(consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Getter methods required by the interface
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    void printReport() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

