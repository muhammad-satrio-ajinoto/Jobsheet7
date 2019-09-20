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
public class Challenge2 { private static int tugas;

    
    public static void main(String[]args){
        
      //Deklarasi
      double  a;
      double  Tugas;
      double  b;
      double  Laporan; 
      double  c;
      double  Ujian;
      double  d;
      double  Akhir;
      
      //Membuat scanner baru
      Scanner baca = new Scanner(System.in);
      
      
      //Input
      System.out.println("== NILAI ==");
      System.out.print("input nilaitugas :");
      Tugas = baca.nextDouble();
      
      System.out.print("input nilailaporan :");
      Laporan = baca.nextDouble();
      
      System.out.print("input nilaiujian :");
      Ujian = baca.nextDouble();
      
      
      //Proses
      a = ( Tugas * 30 / 100);
      b = ( Laporan * 20 / 100);
      c = ( Ujian * 50 / 100);
      d = ( a + b + c);
      
      //Output
      System.out.println ("== Nilai Anda Setelah Proses ==");
      System.out.println("Output nilai :" + a );
      System.out.println("Output nilai :" + b );
      System.out.println("Output nilai :" + c );
      System.out.println("Output nilai :" + d );
      
      //Penggolongan
      
      System.out.println("== Grade Anda ==");
      
      if    (a<=40){
          System.out.println("a = Grade F");
      }
             
      else if  (a<=55){
    
          System.out.println("a = Grade E");
      }
      
       else if  (a<=74){
    
          System.out.println("a = Grade D");
      }
      
       else if  (a<=85){
    
          System.out.println("a = Grade C");
      }
      
       else if  (a<=92){
    
          System.out.println("a = Grade B");
      }
      
       else if  (a<=100){
    
          System.out.println("a = Grade ");
      }
      
      
      if    (b<=40){
          System.out.println("b = Grade F");
      }
             
      else if  (b<=55){
    
          System.out.println("b = Grade E");
      }
      
       else if  (b<=74){
    
          System.out.println("b = Grade D");
      }
      
       else if  (b<=85){
    
          System.out.println("b = Grade C");
      }
      
       else if  (b<=92){
    
          System.out.println("b = Grade B");
      }
      
       else if  (b<=100){
    
          System.out.println("b = Grade A ");
      }
      
      if    (c<=40){
          System.out.println("c = Grade F");
      }
             
      else if  (c<=55){
    
          System.out.println("c = Grade E");
      }
      
       else if  (c<=74){
    
          System.out.println("c = Grade D");
      }
      
       else if  (c<=85){
    
          System.out.println("c = Grade C");
      }
      
       else if  (c<=92){
    
          System.out.println("c = Grade B");
      }
      
       else if  (c<=100){
    
          System.out.println("c = Grade A ");
      }
      
      if    (d<=40){
          System.out.println("a = Grade F");
      }
             
      else if  (d<=55){
    
          System.out.println("d = Grade E");
      }
      
       else if  (d<=74){
    
          System.out.println("d = Grade D");
      }
      
       else if  (d<=85){
    
          System.out.println("d = Grade C");
      }
      
       else if  (d<=92){
    
          System.out.println("d = Grade B");
      }
      
       else if  (d<=100){
    
          System.out.println("d = Grade A ");
      }
      
      
      //ketentuan
      
      System.out.println("== Ketentuan Lulus ==");
      
       if (d<=55){
           System.out.println("Anda tidak lulus, tingkatkan belajar anda");
      }
       
       else if (d <=74){
           System.out.println("Anda tidak lulus, tingkatkan belajar anda");
      }
       
       else if (d <= 85){
           System.out.println("Anda lulus dengan cukup, tingkatkan lagi prestasimu");
      }
        
        else if (d <= 92){
             System.out.println("Anda lulus dengan cukup, pertahankan lagi prestasimu");
      }
       
         else if (d <= 100){
             System.out.println("Anda lulus, Excellent");
      }
         
      
    }  
        
}        

    

