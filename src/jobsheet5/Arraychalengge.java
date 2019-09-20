/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5;

/**
 *
 * @author HP 242
 */
public class Arraychalengge {
    public static void main(String[]args){
        int nilai [] = new int[5];
       nilai [0] = 86;
       nilai [1] = 76;
       nilai [2] = 69;
       nilai [3] = 96;
       nilai [4] = 100;
       double ratarata = 0.0;
       
       for(int i = 0; i<nilai.length; i++)ratarata+=nilai [i];
       ratarata/=nilai.length;
       
       
        
        if (ratarata <75){
           System.out.println("Nilai rata rata = " + ratarata);
           System.out.println("Belajar lagi");
       
       
        
          
       }else if (ratarata >75){
           System.out.println("Nilai rata rata = " + ratarata);
           System.out.println("Selamat anda lulus");
        
   
        
           
       }
          
       
       
       
       
   }
    
}
    

