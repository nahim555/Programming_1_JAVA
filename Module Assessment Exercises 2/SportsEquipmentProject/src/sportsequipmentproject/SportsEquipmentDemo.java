package sportsequipmentproject;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Nahim
 */
public class SportsEquipmentDemo {
    
    public static void main(String [] args) throws FileNotFoundException, InvalidProductCodeException{
     
        /**
        * Create a object to output productData in main.
        */
     
        String productID = null;
        double priceUnit = 0.0;
        Product p = new Product(productID,priceUnit);

       
        /**
     * testing Name and Address class
     */
        String title = "Ms"; //PNW-1234/Ms/LQ/Bethea/205, Willis Road/Bolton/BO5 1DQ
        String initials = "LQ";
        String lastName = "Bethea";
        Name customerName = new Name(title,initials,lastName);
    
        int houseNumber = 205;
        String streetName = "Willis Road";
        String city = "Bolton";
        String postCode = "BO5 1DQ";
    
        Address customerAddress = new Address(houseNumber,streetName,city,postCode);
   
        System.out.println(customerName.getName() + customerAddress.getAddress());
     
    }
   
    /**
     * Supposed to read productData file and store in Product Array
     * @param productDetails
     * @throws FileNotFoundException 
     */
    public static void getProductCode(Product[] productDetails) throws FileNotFoundException{
     
        final int amountOfProducts = 10;   
   
        Scanner fileScan;
        Scanner otherScan;
    
        productDetails = new Product[amountOfProducts];
    
        String code;
        Double price = 0.0;
        int amount = 0;
    
        try{
        fileScan = new Scanner( new File("productData.txt"));
        fileScan.useDelimiter("#");
        
        /**
         * open productData text file and store in Product Array
         */
            while( fileScan.hasNext()){
                code = fileScan.next().trim();
                otherScan = new Scanner(code);
          
                String[] productData = new String[20];
            
                for(int i=0; i<20;i++)
                {
                    productData[i] = otherScan.next();
                
                }
            
                    for(int i=0; i<code.length();i++)
                    {
                        System.out.println(productData[i]);
                    }
              
                }
        
            }catch(Exception e)
            {
                System.out.println(e);}   
    }

}
            
            
 
       
       
      
        
      