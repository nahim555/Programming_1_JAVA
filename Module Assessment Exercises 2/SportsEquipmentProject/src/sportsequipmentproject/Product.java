/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsequipmentproject;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Nahim
 */
public class Product {
    
    private String productCode;
    private double pricePerUnit;
    
    //supposed to format price of product.
    private static NumberFormat formatter = new DecimalFormat("#0.00");
    
    /**
     * Constructor to check that productCode matches with input
     * @param aProductCode
     * @param appUnit
     * @throws InvalidProductCodeException 
     */
    public Product(String aProductCode, double appUnit) throws InvalidProductCodeException 
    {
        if(productCode.matches("[A-Z]{2}/[0-9]{3}") || productCode.matches("[a-z]{2}/[0-9]{3}")) //PA/123#
        {
            this.productCode = aProductCode;
            this.pricePerUnit = appUnit;
          
    }
        else
            throw new InvalidProductCodeException("invalid product code entered: ");
            
            }
    
    
    public String getProductCode(){
        
        return productCode;
    }
    
    
    public double getUnitPrice(){
        
        return pricePerUnit;
    }
    
    /**
     * 
     * @param setProductCode to productCode. 
     */
    public void setProductCode(String setProductCode){
        
        productCode=setProductCode;
        
    }
    
    public void setPricepUnit(double setPriceperUnit)
    {
        pricePerUnit=setPriceperUnit;
    }
    
    @Override
    public String toString(){
        
        return " productCode: " + productCode + " \nprice: " + formatter.format(pricePerUnit);
    }
    
}
