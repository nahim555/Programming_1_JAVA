/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockType;

import java.util.Scanner;

/**
 *
 * @author Nahim
 */
public class ElectornicCoDemo {
    
    public static stockType [] generateStock(){
        
    String [] inventoryIDlist =
        { "AB123", "AB125", "AC143",
          "AC143", "AD124", "AD133", "BE123", "BE128",
          "BE144", "BG223", "BG251", "BG444",
          "CD768", "CD813"};
    
    int [] stockQuantities =
        {155, 288, 95, 70, 42, 130, 84, 55,
        72, 18, 45, 50, 64, 28};
    int [] dailyDemands =
        {31, 18, 19, 14, 14, 26, 12, 11, 12,
        3, 9, 10, 16, 7};
    int [] reorderQuantities =
        {310, 180, 285, 140, 140, 390, 240,
        110, 120, 60, 135, 100, 160, 140};
    int [] leadTimes =
        {5, 7, 3, 2, 1, 5, 6, 4, 5,
        2, 3, 2, 4, 3};
    
    int n = inventoryIDlist.length;
    
    stockType[] currentStock = new stockType[n];
    
    for(int i =0; i<n; i++)
    {
        currentStock[i] = new stockType(inventoryIDlist[i], stockQuantities[i], dailyDemands[i], reorderQuantities[i], leadTimes[i]);
    }
    
    return currentStock;
// USE THE ABOVE DATA TO CREATE AN ARRAY OF StockType OBJECTS
}
    
     public static void main( String [ ] args )
     {
         String identifier = null;
         int amount = 0;
         int quantity = 0;
         int dailyDemandRate =0;
         int removeDailyAmount = 0;
         int reOrder =0;
         double leadTime = 0;
      
         Scanner scan = new Scanner(System.in);
         
         //testing removal of daily demand
         System.out.println("Enter identifier");
         
         identifier = scan.nextLine();
         
         System.out.println("enter daily demand rate ");
         dailyDemandRate = scan.nextInt();
         
         System.out.println("Enter amount to remove :");
         removeDailyAmount = scan.nextInt();
         
         
   //TO RETURN STOCK TYPE AND REMOVE DAILY RATE    
         stockType myStock = new stockType();
         
     // System.out.println("return identifier " + myStock + " is " + myStock.getIdentifier());
         
         myStock.removeDailyDemand(removeDailyAmount, dailyDemandRate);
         
       System.out.println("Stock Type: " + identifier + " is " + myStock.getDailyRate());
         
       //  RECORD BATCH HAS BEEN ORDERED FOR STOCK TYPE;
       
       //testing array
       stockType [] currentStock = generateStock();
       int stock = currentStock.length;
       for(int i=0; i< stock; i++)
       {
           System.out.println(currentStock[i]);
       }
       
       
     }
}
