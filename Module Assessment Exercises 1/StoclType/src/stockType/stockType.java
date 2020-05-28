/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockType;

/**
 *
 * @author Nahim
 */
public class stockType {

    private String identifier;
    private int stockQuantity;
    private int dailyDemandRate;
    private int reOrderQuantity;
    private double leadTime;
    private boolean batchOrder;
   
    public stockType()
    {
        identifier = null;
        stockQuantity = 0;
        dailyDemandRate = 0;
        reOrderQuantity = 0;
        leadTime = 0;
        
    }

    public stockType(String stockIdent, int Quantity, int ddemandRate, int reOrder,double leadTimeOrder)
       
    {
     
       identifier = stockIdent;
       stockQuantity = Quantity;
       dailyDemandRate = ddemandRate;
       reOrderQuantity = reOrder;
       leadTime = leadTimeOrder;
    //batchOrder = RecordBatchOrder;
      
    }
   
  
    public String getIdentifier()
   {
       return identifier;
   }
   
   public int getDailyRate()
   {
       
       return dailyDemandRate;
   }
   
   public int getReOrder()
   {
       return reOrderQuantity;
   }
   
   
   public void removeDailyDemand(int amount, int dailyDemandRate)
   {
       
        dailyDemandRate = - amount;
      
   }
     
   public void RecordStockBatch(String stockType, boolean batchOrder )
   {
       
   }
   
    public boolean isReOrderPoint(String reOrder,String identifier)
   {
     
       identifier = getIdentifier(); 
       System.out.println(identifier);
       
       if("yes".equals(reOrder))
       {
           return true;
       }
      
   return false;
   }
   
    @Override
   public String toString()
   {
       return "\tidentifier: " + identifier + "\tstockQuantity: " + stockQuantity +
               "\tdailyDemand: " + dailyDemandRate + "\treOrderQuantity: " + reOrderQuantity +
               "\tleadTime: " + leadTime + "\tbatchOrder: " + batchOrder;
               
              
   }
   }
  