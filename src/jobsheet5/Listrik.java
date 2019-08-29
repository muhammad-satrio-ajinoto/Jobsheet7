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
public class Listrik {public static void main(String[] args) {
            
            //deklarasi
            int kWh;
            int biaya;
            int biayatotal;
            Double Total;
            
            //scanner
            java.util.Scanner pembaca = new java.util.Scanner(System.in);
            
            //input kWh~Program Pembayaran T
            System.out.println("~Program Pembayaran Tagihan Listrik~");
            System.out.print("Input jumlah kWh/bulan: ");
            kWh = pembaca.nextInt();
            
            //penggolongan
            System.out.println("\n~Penggolongan~");
            if(kWh <= 450) {
                System.out.println("Selamat anda masuk golongan W(People of Wakanda)");
                biaya = 20000 + (1000 * kWh);
                System.out.println("Biaya " + "Rp." + biaya);
                System.out.println("\nBiaya total");
                biayatotal =(biaya + (biaya * 15/100));
                System.out.println("Biaya total: " + biayatotal);
                
            } else if(kWh <=900) { 
                System.out.println("Selamat anda masuk golongan B(anak ilang)");
                biaya = 35000 + (2500 * kWh);
                System.out.println("Biaya " + "Rp." + biaya);
                
            } else if(kWh <1200) {
                System.out.println("Selamat anda masuk golongan A(King of Wakanda)");
                biaya = 50000 + (3000 * kWh);
                System.out.println("Biaya " + "Rp." + biaya);
                
            } else
                System.out.println("Maaf jumlah kWh anda tidak ada dikategori ini, silahkan coba lagi...");
            
            //menghitung total
            
           
        }
    
}
