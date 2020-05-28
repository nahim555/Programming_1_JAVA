/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber1;

/**
 *
 * @author Nahim
 */
public class employee {

     public static boolean isPrime( int n )
    {
        if( n > 2 && (n & 1) == 0)
        {
            return false;
        }
            for(int i = 3;  i * i <= n;  i += 2)
            
                if(n % i == 0)
                    return false;
            return true;      
    }
            
    public static void main(String[] args) {
        
       int counter = 0;
       
       for(int i =1;  i < 100;  i++)
       {
           if(isPrime(i) == true)
           {
               System.out.print(i + "\t");
               counter++;
               
               if(counter == 5)
               {
                   System.out.println();
                   counter = 0;
               }
           }
       }
    }
}
    
      
  
