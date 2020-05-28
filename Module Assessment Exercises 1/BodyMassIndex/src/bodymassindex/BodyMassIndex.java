package bodymassindex;
import java.util.Scanner;

public class BodyMassIndex {

   public static String bodyMassIndex(double weight, double height){
  
        Scanner scan = new Scanner( System.in );
        double BMI;
        String bmi = null;
        
        BMI = weight / (height*height);
      
        if(BMI<16)
           {
            System.out.println(String.format(bmi ="seriously underweight " + "BMI is " + "%.2f", + BMI));
           }
         if(BMI >= 16 && BMI <18)
          {
            System.out.println(String.format(bmi = "underweight " + "BMI is " + "%.2f", BMI)) ;
          }
        if(BMI >=18 && BMI <24)
        {
            System.out.println(String.format("Normal weight " + "BMI is " + "%.2f", + BMI));
        }
        if(BMI >=24 && BMI <29)
        {
            System.out.println(String.format("Overweight " + "BMI is " + "%.2f", BMI));
        }
        if(BMI >=29 && BMI <35)
        {
            System.out.println(String.format("Seriously Overweight " + "BMI is " + "%.2f", BMI));
        }
        if(BMI >=35)
        {
            System.out.println(String.format("Obese " + "BMI is " + "%.2f", BMI));
        }
        
       return bmi;
    }
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner( System.in );
        
        double ht;
        double wt;
        
        System.out.println("enter height in meters (e.g 1.70)");
        ht= scan.nextDouble();
        System.out.println("enter weight in kilogram (e.g. 50 )");
        wt= scan.nextDouble();
          
        bodyMassIndex(wt,ht);
    
    }
    
}
    
  