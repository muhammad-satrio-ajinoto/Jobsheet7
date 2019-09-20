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
public class pengulanganWhile {
    public static void main(String[]args){
        
        //membuat variable dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while (running){
            System.out.println("Yakin ingin keluar ?");
            System.out.print("Jawab [ya/tidak]>");
            
            jawab = scan.nextLine();
            
        //cek jawaban, jika ya maka berhenti mengulang program
        if (jawab.equalsIgnoreCase("ya")){
            running = false;
        } 
        counter++;
        }
        System.out.println("Anda sudah melakukan pengulangan sebanyak" + counter + "kali");
        
        }
    }

