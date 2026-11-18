/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1.mattresssalesreport;

/**
 *
 * @author Student
 */
public class Product implements IProducts {
    
    int[][] sales ={
            {25,18,20},
            {15,10,12},
            {18,15,20}
        };
 public class Product(){    
    public int GetTotalProductSold(){
        int total = 0;
        for(int i = 0; i < sales.length; i ++){
            for(int j = 0; j < sales[i].length; j ++){
                total += sales[i][j];
            }
        }
        return total;
    }
    public double GetAverageProductSold(){
        int total = ToalSales ;
        int count = 0;
        for(int i = 0; i < sales.length; i ++){
             int currentProductTotal = 0;
              for(int j = 0; j < sales[i].length; j ++){
                  currentProductTotal += sales[i][j];
                  count++;
              
              }
         
         }
          return (double) total/count;
    }
    public  String GetMostPopularProduct(){
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

    
}
}
