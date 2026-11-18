/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q1.mattresssalesreport;

/**
 *
 * @author Student
 */
public class Q11MattressSalesReport {

    public static void main(String[] args) {
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        
        int[][] sales ={
            {25,18,20},
            {15,10,12},
            {18,15,20}
        };
        //calculate total 
        int total = 0;
        for(int i = 0; i < sales.length; i ++){
            for(int j = 0; j < sales[i].length; j ++){
                total += sales[i][j];
            }
        }
        System.out.println("Total: " + total);
        
        
        
        
        int maxSales = -1;
        int mostPopularIndex = 0;
        
        System.out.println("Average sales per product");
         for(int i = 0; i < sales.length; i ++){
             int currentProductTotal = 0;
              for(int j = 0; j < sales[i].length; j ++){
                  currentProductTotal += sales[i][j];
              
              }
         
         }
        
        //calculate highest sales
        int maximum = sales[0][0];
        
        for(int i = 0; i < sales.length; i ++){
            for(int j = 0; j < sales[i].length; j ++){
                maximum = sales[i];
            }
            
            }
            
        }
        System.out.println("Most Popular Product: " + products);
        System.out.println("Highest Total sales: " + maxSales);
    }

