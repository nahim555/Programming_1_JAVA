package sportsequipmentproject;
import java.text.NumberFormat;
/**
 * A model of a SportsClub customerDetails
 * @author Nahim
 */
public class SportsClubDetails{
    
    private Name fullName;
    private CustomerDetails discount;
    private String customerID;
    
    /**
     * 
     * @param aName
     * @param agreedDiscount
     * @param aCustomerID
     * @throws IllegalCustomerIDException if String does not have right format.
     */
    public SportsClubDetails(Name aName, CustomerDetails agreedDiscount, String aCustomerID)throws IllegalCustomerIDException {
        
            if ( customerID.charAt(0) != 'C')
            throw new IllegalCustomerIDException("Customer ID must begin with 'C'"
                    + " for a private individual customer");
        else
            fullName = aName;
            discount = agreedDiscount;
            customerID = aCustomerID;
    }
    
    public Name getfullName()
    {
        return fullName;
    }
    
    /**
     * Discount for SportsCLub is agreed with the company.
     * @param agreedDiscount
     * @return 
     */
    public CustomerDetails getDiscount(CustomerDetails agreedDiscount){
        
        return discount = agreedDiscount;
        
    }
    
    public String getID(){
        
        return customerID;
    }
    
    @Override
    public String toString(){
        NumberFormat fmt = NumberFormat.getPercentInstance();
        
        StringBuilder str = new StringBuilder(super.toString());
        str.append(fullName).append("\n\tCurrent discount: ").append(getDiscount(discount));
        return str.toString();
        
    }
    
}
