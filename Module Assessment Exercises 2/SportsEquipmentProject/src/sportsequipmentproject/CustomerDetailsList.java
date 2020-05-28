package sportsequipmentproject;
import java.util.ArrayList;

/**
 *This produces a list of CustomerDetails.
 * @author Nahim
 */
public class CustomerDetailsList {
    
    private ArrayList<CustomerDetails> aCustomerDetails;
    private String idDetails;
    
    /**
     * Creates an empty list.
     */
     public CustomerDetailsList()
    {
    
        aCustomerDetails = new ArrayList<CustomerDetails>();
    }
    
     /**
      * Store details of new customer into CustomerDetails.
      * @param newCustomer 
      */
    public void addCustomer(CustomerDetails newCustomer){
        
        aCustomerDetails.add(newCustomer);
    }
    
    /**
     * 
     * @return the size of customerDetails
     */
    public int numberOfCustomer(){
        
        return aCustomerDetails.size();
    }
    
    /**
     * 
     * @param givenID check if ID has correct first character.
     * @return
     * @throws CustomerNotFoundException 
     */
    public CustomerDetails findCustomer(String givenID)
                            throws CustomerNotFoundException{
            
    CustomerNotFoundException error = new CustomerNotFoundException(); 
    int sz = aCustomerDetails.size();
    int i = 0;
   
        if(givenID.charAt(0) != 'P' || givenID.charAt(0) != 'C')
                {
                    throw error;
                }
               else
            
            return aCustomerDetails.get(i-1);    
                    
    }
    
    @Override
    public String toString(){
        
        StringBuilder CustomerIDList = new StringBuilder();
        
        for(int i =0; i<numberOfCustomer(); i++){
            CustomerIDList.append(aCustomerDetails.get(i).toString()).append("\n\n");
        }
        return CustomerIDList.toString();
    }
    
    private CustomerDetails[] getCustomerArray(){
        return aCustomerDetails.toArray(new CustomerDetails [aCustomerDetails.size()]);
    }
    
    
    
}
