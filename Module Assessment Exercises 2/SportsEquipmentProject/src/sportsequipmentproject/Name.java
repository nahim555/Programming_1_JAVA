package sportsequipmentproject;

public class Name {
    
    private String fullName;
    private String title;
    private String initials;
    private String lastName;
    /**
     * 
     * @param atitle
     * @param ainitials
     * @param alastName 
     * concatenation of three fields to create fullName.
     */
    public Name(String atitle,String ainitials,String alastName)
    {
        String afullName = null;
        fullName = afullName;
        this.title = atitle;
        this.initials = ainitials;
        this.lastName = alastName;
        
        fullName = title + " " + initials + " " + lastName; 
    }
    
    /**
     * 
     * @param addName to CustomerDetails
     */
    public void addName(CustomerDetails addName)
    {
       
        fullName+=addName;
    }
    
    /**
     * 
     * @return fullName.
     */
    public String getName(){
        
        
        return fullName;
    }
    
    
    @Override
    public String toString()
    {
        return "\tFullName: " + fullName; 
    }
    
}
