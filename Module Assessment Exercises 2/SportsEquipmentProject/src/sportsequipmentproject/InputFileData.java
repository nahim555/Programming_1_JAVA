/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsequipmentproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Nahim
 */
public class InputFileData {
   
    /**
     * input out stream for textfiles
     * @param s
     * @throws IOException 
     */
    public InputFileData(String s)throws IOException{
   
    FileInputStream in = null;
    FileOutputStream out = null;
    
    try{
        in = new FileInputStream("ptoductData.txt");
        out = new FileOutputStream("productData.txt");
        
        int c;
        while((c = in.read()) != -1)
        {
            out.write(c);
        }
    }finally{
        if(in != null){
        in.close();
    }
        if(out != null){
        out.close();
    }
    }
            
    }
    
}
