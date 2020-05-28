package sportsequipmentproject;
/**
 *
 * @author Nahim
 */
public class Address {
    
    private int hsNumber;
    private String stName;
    private String town;
    private String postCode;
    private String fullAddress;
    private Name name;
    
    
    public Address(int houseNum, String streetName,String cTown,String aPostCode)
    {
        String anAddress = null;
        fullAddress = anAddress; 
        this.hsNumber = houseNum;
        this.stName = streetName;
        this.town = cTown;
        this.postCode = aPostCode;
        
        fullAddress = hsNumber + " " + stName + " " + town + " " + postCode;
             
    }

    Address(String title, String streetName, String city, String postCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * 
     * @param addAddress to CustomerDetails.
     */
    public void addName(CustomerDetails addAddress)
    {
        
            fullAddress+=addAddress;
    }
    
    public String getAddress(){
        
        return fullAddress;
    }
      
    @Override
    public String toString()
    {
       StringBuilder addStr = new StringBuilder("\tAddress: ");
       addStr.append(fullAddress);
       return addStr.toString();
    }
   
}
