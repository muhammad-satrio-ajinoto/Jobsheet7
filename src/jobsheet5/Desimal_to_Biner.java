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
public class Desimal_to_Biner {
    public static void main(String[]args){
        int dec;
        String bin;
        
        Scanner data = new Scanner(System.in);
        
        System.out.print("Input desimal: ");
        dec = data.nextInt();
        
        bin= Integer.toBinaryString(dec);
        
        System.out.println("Output Binary: " + bin);
       
    }
    
}
