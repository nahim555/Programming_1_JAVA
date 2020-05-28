/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsequipmentproject;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Nahim
 */
public class PurchaseOrderList {
    
    private ArrayList<PurchaseOrder> purchaseOrderList;
    
    /**
     * Create empty purchase order.
     */
    public PurchaseOrderList()
    {
        purchaseOrderList = new ArrayList<PurchaseOrder>();
    }
    /**
     * Add new purchase
     * @param newOrder The PurchaseOrder is added to the list.
     */
    public void addPurchaseOrder(PurchaseOrder newOrder){
        
        purchaseOrderList.add(newOrder);
               
    }
    
    /**
     * clear the purchase list.
     */
    public void clearPurchaseOrderList(){
        
        purchaseOrderList.clear();
    }
    
    /**
     * 
     * @return the number of purchases.
     */
    public int numberOfPurchases()
    {
        return purchaseOrderList.size();
    }
    
    /**
     * 
     * @return purchaseOrderList if list is not empty.
     */
    public PurchaseOrder[] getPurchaseOrders(){
        
        if(purchaseOrderList.isEmpty())
        {
            return null;
        }
        else
            
        return purchaseOrderList.toArray(new PurchaseOrder [purchaseOrderList.size()]);    
    }
    
    /**
     * 
     * @return sort the list 
     */
     public PurchaseOrder[] sortByList(){
        PurchaseOrder[] purchaseArray = getPurchaseArray();
        
        Arrays.sort(purchaseArray);
        return purchaseArray;
        
        
    }
     
     /**
      * 
      * @return the details in the PurchaseOrder.
      */
     public String toString()
     {
         StringBuilder purchaseList = new StringBuilder();
         for(int i=0; i<numberOfPurchases(); i++)
         {
             purchaseList.append(purchaseOrderList.get(i).toString()).append("\n\n");
         }
         
         return purchaseList.toString();
         
     }
     
     private PurchaseOrder[] getPurchaseArray(){
         
         return purchaseOrderList.toArray(new PurchaseOrder [purchaseOrderList.size()]);
     }
    
}
