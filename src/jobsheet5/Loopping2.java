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
public class Loopping2 {
    public static void main(String[]args){
        int panjang, lebar;
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nilai panjang");
        panjang = input.nextInt();
        System.out.println("masukan nilai lebar");
        lebar = input.nextInt();
        
        for(int a = 1; a>= lebar; a++){
            for(int t = 1; t<=panjang; t++){
                System.out.println(" - ");
            }
            System.out.print("");
        }
       
    }
}
