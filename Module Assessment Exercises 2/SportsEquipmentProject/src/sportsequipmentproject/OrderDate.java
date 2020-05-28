package sportsequipmentproject;
/**
 *
 * @author Nahim
 */
public class OrderDate {
    
    /**
     *
     * @param date
     * @throws IllegalDateFormatException
     */
    
    
     private int day;
     private int month;
     private int year;
     private String date;
     
  /**
   * 
   * @param aDate
     * @param aday
     * @param amonth
     * @param ayear
   * @throws IllegalDateFormatException if incorrect format.
   */
    public OrderDate(String aDate) throws IllegalDateFormatException
    {
      IllegalDateFormatException error = 
                new IllegalDateFormatException("must be in dd-mm-yyyy");
      
      
      date = day + "/" + month + "/" + year;
      
      if(date.matches("[0-9]/{2}/[0-9]{2}/(0-9){4}"))
      {     
        this.date = aDate;
        
      }
      else
          throw error;
    
    }
    
     public OrderDate(int aDate, int aMonth, int aYear){
         
         this.day = aDate;
         this.month = aMonth;
         this.year = aYear;
         
         
     }
    /**
     * 
     * @return the date for this OrderDate
     */
    public String getDate()
    {
        return date;
    }
    
    public int getDay()
    {
        return day;
    }
    
    public int getMonth(){
        
        return month;
    }
    
    public int getYear(){
        
       return year;
    }
    
   
     @Override
    public String toString(){
        StringBuilder aOrderDate = new StringBuilder();
        
        aOrderDate.append(day).append("/");
        aOrderDate.append(month).append("/");
        aOrderDate.append(year);
        
        return aOrderDate.toString();
        
    }
}

