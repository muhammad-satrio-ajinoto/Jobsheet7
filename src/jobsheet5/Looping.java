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
public class Looping {
   
    public static void main(String[]args){
        int a, b, jumlah;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai suku awal :");
        a = input.nextInt();
        System.out.println("Masukan nilai beda tiap suku :");
        b = input.nextInt();
        System.out.println("Masukan jumlah suku");
        jumlah = input.nextInt();
        System.out.println("Berikut tampilan deret aritmatika");
        int i = 1;
        
           while(i<=jumlah);
           a+=b;
           
           System.out.println(a + " ");
           i++;
           
        
        
    }
    
    
}
