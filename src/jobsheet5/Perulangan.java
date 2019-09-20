/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5;

import java.util.Scanner;

/**
 *
 * @author HP 242
 */
public class Perulangan {
    public static void main(String[]args){
       
        int bil, hasil = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka:");
        bil = input.nextInt();
        int i = bil;
        
        do{
           System.out.println(" Nilai faktorial dari "+bil+ "adalah " +hasil);
           hasil = hasil * i;
           i--;
        }while (i > 0);
        
        
      
       
            
                    
        
        
        
    }
    
}
